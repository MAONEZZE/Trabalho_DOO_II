package ArmazenadorObjetos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class TrabalhoDOOIIServer {

    public static void rodarServidor(int port){
        try {
            ServerSocket sock = new ServerSocket(port, 10);
            
            while (true) {                
                System.out.println("Waiting client connection...");
                Socket clientSock = sock.accept();
                System.out.println("Connected to:\n\t" +
                        clientSock.getInetAddress().toString() + 
                        " at port " + clientSock.getPort());
                
                ValidacaoTCP c = new ValidacaoTCP(clientSock);
                c.start();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO na porta de comunicação (Socket)", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        rodarServidor(50000);
    }
    
}
