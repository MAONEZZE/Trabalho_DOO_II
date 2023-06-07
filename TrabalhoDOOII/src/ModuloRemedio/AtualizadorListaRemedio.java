package ModuloRemedio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

public class AtualizadorListaRemedio extends Thread{
    private InetAddress srvAddrGlobal;
    private int srvPortGlobal;
    private Socket sock;
    private DataOutputStream out;
    private DataInputStream in;
    
    public AtualizadorListaRemedio(InetAddress srvAddr, int srvPort){
        srvAddrGlobal = srvAddr;
        srvPortGlobal = srvPort;
        
        inicializarSock();
    }
    
    private void inicializarSock(){
        try {
            sock = new Socket(srvAddrGlobal, srvPortGlobal);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+" Erro ", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*else if(json.get("Comando").equals("CarregarMemoria")){
            
     }*/
    @Override
    public void run(){
        try {
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            ObjectInputStream objIn = new ObjectInputStream(in);
            
            JSONObject json = new JSONObject();
            json.put("Objeto", "Remedio");
            json.put("Comando", "CarregarMemoria");
            
            while(true){
                
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+" Erro ", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
