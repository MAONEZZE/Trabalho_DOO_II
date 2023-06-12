package ModuloRemedio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import TrabalhoDOOII.Main;
import javax.swing.JOptionPane;

public class ControladorRemedio{
    private List<Remedio> listaRemedio;
    private Remedio remedio;
    
    public ControladorRemedio(){

        listaRemedio = carregarListaMemoria();
    }
    
    private boolean verificadorVazios(String nomeForn, String nome, String preco, String quant){
        if(nome.equals("") || nomeForn.equals("") || preco.equals("   .00") || quant.equals("   ")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean cadastrarRemedio(String nomeForn, String nome, String preco, String quant) {
        try{
            if (verificadorVazios(nomeForn, nome, preco, quant)){
                throw new InputMismatchException();
            }
            else{

                String[] array1 = preco.split(",");

                int quantReal = Integer.parseInt(quant);
                float precoRealFloat = Float.parseFloat(array1[0]);
                
                remedio = new Remedio(nomeForn, nome, quantReal, precoRealFloat);
                listaRemedio.add(remedio);
                                
                serializadorRemedio();
                return true;
            }
            
        }catch(InputMismatchException ex){
            return false;
        }
    }
    
    public void removerRemedio(Remedio remedio, int op){
        listaRemedio.remove(remedio);
        serializadorRemedio();
        
        switch(op){
            case 1: 
                Main.ctrlBase.pFunc.carregarRemedios();
                break;
                
            case 2:
                Main.ctrlBase.pForn.carregarRemedios();
                break;
        }
    }
    
    public boolean editarRemedio(String nomeForn, String nome, String preco, String quant,Remedio remedioSelec){
        try{
            if (verificadorVazios(nomeForn, nome, preco, quant)){
                throw new InputMismatchException();
            }
            else{
                String[] array1 = preco.split(",");

                int quantReal = Integer.parseInt(quant);
                float precoRealFloat = Float.parseFloat(array1[0]);
                
                remedioSelec.setNome(nome);
                remedioSelec.setPreco(precoRealFloat);
                remedioSelec.setQuantidade(quantReal);
                
                serializadorRemedio();
                return true;
            }
            
        }catch(InputMismatchException ex){
            return false;
        }
    }

    public List<Remedio> SelecionarTodosRemedios(){
        return listaRemedio;
    }
    
    private void serializadorRemedio(){
        try {
            FileOutputStream arquivoOut = new FileOutputStream("Remedios.ser");
            ObjectOutputStream outSerializador = new ObjectOutputStream(arquivoOut);
            
            outSerializador.writeObject(this.listaRemedio);
            outSerializador.close();
            arquivoOut.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    private List<Remedio> carregarListaMemoria(){
        File verificarArquivo = new File("Remedios.ser");
        try {
            if(verificarArquivo.exists()){
                
                long tamanhoArquivo = verificarArquivo.length();
                
                if(tamanhoArquivo > 0){
                    FileInputStream arquivoIn = new FileInputStream("Remedios.ser");
                    ObjectInputStream in = new ObjectInputStream(arquivoIn);

                    this.listaRemedio = (List<Remedio>) in.readObject();

                    in.close();
                    arquivoIn.close();
                    
                    return this.listaRemedio;
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
