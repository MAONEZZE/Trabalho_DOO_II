package ModuloRequisicao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorRequisicao {
    private List<Requisicao> listaReq;
    
    public ControladorRequisicao(){
        listaReq = carregarListaMemoria();
    }
    
    public void inserir(Requisicao req){
        listaReq.add(req);
        serializador();
    }
    
    public void excluir(Requisicao req){
        listaReq.remove(req);
        serializador();
    }

    public List<Requisicao> selecionarTodos(){
        return listaReq;
    }
    
    private void serializador(){
        try {
            FileOutputStream arquivoOut = new FileOutputStream("Requisicoes.ser");
            ObjectOutputStream outSerializador = new ObjectOutputStream(arquivoOut);
            
            outSerializador.writeObject(this.listaReq);
            outSerializador.close();
            arquivoOut.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    private List<Requisicao> carregarListaMemoria(){
        File verificarArquivo = new File("Requisicao.ser");
        try {
            if(verificarArquivo.exists()){
                
                long tamanhoArquivo = verificarArquivo.length();
                
                if(tamanhoArquivo > 0){
                    FileInputStream arquivoIn = new FileInputStream("Requisicao.ser");
                    ObjectInputStream in = new ObjectInputStream(arquivoIn);

                    this.listaReq = (List<Requisicao>) in.readObject();

                    in.close();
                    arquivoIn.close();
                    
                    return this.listaReq;
                }
            }
            else{
                return new ArrayList();
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
        } 
        return null;
    }
}
