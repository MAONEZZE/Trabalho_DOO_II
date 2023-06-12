package ArmazenadorObjetos;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ValidacaoTCP extends Thread{
    private DataInputStream in;
    private Socket clientSock;

    public ValidacaoTCP(Socket sock) {  
        try {
            clientSock = sock;
            in = new DataInputStream(clientSock.getInputStream());
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    @Override
    public void run(){
        JSONParser jsonP = new JSONParser();
        Armazenador armC = new Armazenador(clientSock);
        
        List<String> listaCliente = armC.carregadorArquivos("Clientes.json");
        List<String> listaForn = armC.carregadorArquivos("Fornecedor.json");
        List<String> listaFunc = armC.carregadorArquivos("Funcionario.json");
        List<String> listaGeral = armC.carregadorArquivos("Geral.json");

        String msgIn;
        
        try {
            while(true){
                msgIn = in.readUTF();
                JSONObject json = (JSONObject) jsonP.parse(msgIn);

                if(json.get("Comando").equals("Entrar")){
                    armC.verificadorUsuario(json.get("CPF").toString(), json.get("Senha").toString(), listaGeral);
                }
                else if(json.get("Comando").equals("Cadastro")){

                    listaGeral.add(msgIn);

                    if(json.get("Tipo").equals("Fornecedor")){
                        listaForn.add(msgIn);
                        armC.serializadorFornecedor(listaForn);
                    }
                    else if(json.get("Tipo").equals("Funcionario")){
                        listaFunc.add(msgIn);
                        armC.serializadorFuncionario(listaFunc);
                    }
                    else if(json.get("Tipo").equals("Cliente")){
                        listaCliente.add(msgIn);
                        armC.serializadorCliente(listaCliente);
                    } 

                    armC.serializadorGeral(listaGeral);
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
        } 
    }
}
