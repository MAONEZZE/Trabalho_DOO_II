package trabalhodooiiserver.cadastroCliente;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ArmazenadorCliente {
    private Socket clientSock;
    private DataOutputStream out;
    private String nomeArquivo;
    private List<String> listaVerificadora;
    
    public ArmazenadorCliente(Socket clientSock){
        this.clientSock = clientSock;
    }

    public List<String> carregadorArquivos(String nomeArquivo){
        File verificarArquivo = new File(nomeArquivo);
        List<String> listaUser = new ArrayList();
        
        try {
            if(verificarArquivo.exists()){
                
                long tamanhoArquivo = verificarArquivo.length();
                
                if(tamanhoArquivo > 0){
                    FileInputStream arquivoIn = new FileInputStream(nomeArquivo);
                    ObjectInputStream in = new ObjectInputStream(arquivoIn);

                    listaUser = (List<String>) in.readObject();

                    in.close();
                    arquivoIn.close();
                    
                    return listaUser;
                }
            }
            else{
                return new ArrayList();
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + ", Arquivo não encontrado", "ERRO", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + ", ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + ", Erro na Desserialização", "ERRO", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } 
        
        return null;
    }
    
    private void serializador(List<String> listaUser, String mostrarUsuario){
        try {
            FileOutputStream arquivoOut = new FileOutputStream(this.nomeArquivo);
            ObjectOutputStream outSerializador = new ObjectOutputStream(arquivoOut);
            
            outSerializador.writeObject(listaUser);
            outSerializador.close();
            arquivoOut.close();
            
            if(!mostrarUsuario.equals("Geral")){
                //Enviar para o cliente que o cliente foi cadastrado
                out = new DataOutputStream(clientSock.getOutputStream());
                out.writeUTF(mostrarUsuario + " cadastrado no servidor");
            }
            

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + ", Arquivo não encontrado", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void serializadorCliente(List<String> listaCliente){ //passar a lista por aqui e so serializar dps
        this.nomeArquivo = "Clientes.ser";//criar o arquivo aqui antes

        serializador(listaCliente, "Cliente");
    }
    
    public void serializadorFornecedor(List<String> listaForn){
        this.nomeArquivo = "Fornecedor.ser";

        serializador(listaForn, "Fornecedor");
    }
    
    public void serializadorFuncionario(List<String> listaFunc){
        this.nomeArquivo = "Funcionario.ser";

        serializador(listaFunc, "Funcionario");
    }
    
    public void serializadorGeral(List<String> listaGeral){
        this.nomeArquivo = "Geral.ser";

        serializador(listaGeral, "Geral");
    }
    
    public void verificadorUsuario(String cpf, String senha, List<String> listaGeral){ 
        JSONParser jsonP = new JSONParser();
        
        for(String user: listaGeral){
            try {
                JSONObject json = (JSONObject) jsonP.parse(user);
                
                if(json.get("CPF").equals(cpf) && json.get("Senha").equals(senha)){
                    out = new DataOutputStream(clientSock.getOutputStream());
                   
                    json.put("Nome", json.get("Nome"));
                    json.put("CPF", json.get("CPF"));
                    json.put("Telefone", json.get("Telefone"));
                    json.put("Tipo", json.get("Tipo"));
                    
                    json.put("Existente", "sim");
                    
                    out.writeUTF(json.toString());
                    break;
                }
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage() + "ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage() + "ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
