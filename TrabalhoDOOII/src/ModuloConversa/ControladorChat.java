package ModuloConversa;

import TrabalhoDOOII.Main;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ControladorChat{
    private InetAddress srvIP;
    private int srvPort;
    private MulticastSocket mtcSock;
    private JSONObject jsonRecebimento;
    
    public ControladorChat(String srvIP, String srvPort, JSONObject jsonRecebimento){
        dadosChat(srvIP, srvPort);
        this.jsonRecebimento = jsonRecebimento;
        
        lerMSG();
    }
    
    public void dadosChat(String srvIP, String srvPort){
        try {
            this.srvPort = Integer.parseInt(srvPort);
            this.srvIP = InetAddress.getByName(srvIP);
            mtcSock = new MulticastSocket(this.srvPort);
                
            mtcSock.joinGroup(this.srvIP); 

        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void lerMSG(){
        new Thread(){
            
            @Override
            public void run() {
                String msg;
                while(true){
                    try {
                        byte[] rxData = new byte[65507];
                        JSONParser jsonP = new JSONParser();
                        DatagramPacket rxPkt = new DatagramPacket(rxData, rxData.length);
                                
                        mtcSock.receive(rxPkt);

                        rxData = rxPkt.getData();
                        msg = new String(rxData);
                        msg = msg.substring(0, rxPkt.getLength());
                        JSONObject json = (JSONObject) jsonP.parse(msg);

                        Main.ctrlBase.pChat.mostrarMSG(json);

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO",JOptionPane.ERROR_MESSAGE);
                    } catch (ParseException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }.start();
    }
    
    public void enviarMSG(String msg){
        new Thread(){
            
            @Override
            public void run() {
                    try {
                    LocalDateTime agora = LocalDateTime.now();
                    JSONObject json = new JSONObject();
                    byte[] txData = new byte[65507];
                    String txMsg;
                    
                    DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    String dataFormatada = formatterData.format(agora);

                    DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
                    String horaFormatada = formatterHora.format(agora);
                    //=======================
                    
                    if(msg.equalsIgnoreCase("<exit>")){
                        mtcSock.leaveGroup(srvIP);
                        mtcSock.close();
                        Main.ctrlBase.opcaoPainelUnitarios(3, jsonRecebimento);
                    }
                    
                    json.put("date", dataFormatada);
                    json.put("time", horaFormatada);
                    json.put("username", jsonRecebimento.get("Nome").toString());
                    json.put("message", msg);

                    txMsg = json.toString();

                    txData = txMsg.getBytes(StandardCharsets.UTF_8);
                    
                    DatagramPacket txPkt = new DatagramPacket(txData, txData.length, srvIP, srvPort);

                    mtcSock.send(txPkt);
                    
                    
                } catch (SocketException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), " ERRO", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), " ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }.start();
    }
}
