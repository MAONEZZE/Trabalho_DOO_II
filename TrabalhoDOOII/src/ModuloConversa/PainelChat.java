package ModuloConversa;

import java.net.MulticastSocket;
import TrabalhoDOOII.Main;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PainelChat extends javax.swing.JPanel {
    private InetAddress srvIP;
    private int srvPort;
    private MulticastSocket mtcSock;
    private JSONObject jsonRecebimento;
        
    public PainelChat(JSONObject jsonRecebimento) {
        initComponents();
        this.jsonRecebimento = jsonRecebimento;
        lbl_nomeFunc.setText(jsonRecebimento.get("Nome").toString());
        DadosChat();
        lerMSG();
    }
    
    private void DadosChat(){
        try {
            this.srvPort = Integer.parseInt(tf_port.getText());
            this.srvIP = InetAddress.getByName(tf_ip.getText());
            mtcSock = new MulticastSocket(srvPort);
                
            mtcSock.joinGroup(srvIP); 

        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        bt_sair = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        tf_enviarMensagem = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        tf_ip = new javax.swing.JTextField();
        tf_port = new javax.swing.JTextField();
        lbl_nomeFunc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_mensagens = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, -1));

        bt_sair.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });
        add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        bt_voltar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        add(bt_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 380, 10));
        add(tf_enviarMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 300, 30));

        btn_enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/send_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        btn_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_enviarMouseClicked(evt);
            }
        });
        add(btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 50, 30));

        tf_ip.setEditable(false);
        tf_ip.setText("224.0.0.1");
        add(tf_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        tf_port.setEditable(false);
        tf_port.setText("40000");
        add(tf_port, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        lbl_nomeFunc.setText("nomeFunc");
        add(lbl_nomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        ta_mensagens.setEditable(false);
        ta_mensagens.setColumns(20);
        ta_mensagens.setRows(5);
        jScrollPane1.setViewportView(ta_mensagens);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 360, 160));

        jLabel4.setText("IP:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 20, 20));

        jLabel5.setText("Porta:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 30, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Chat");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Chat");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lerMSG(){
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
                        
                        ta_mensagens.setText(ta_mensagens.getText() + "Date: " + json.get("date") + 
                                "\n" + "Username: " + json.get("username") + 
                                "\n" + "Time: " + json.get("time") + 
                                "\n" + "Message: " + json.get("message") + "\n");
                        
                        ta_mensagens.setText(ta_mensagens.getText() + "\n");
                        

                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                    } catch (ParseException ex) {
                        Logger.getLogger(PainelChat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
    
    private void enviarMSG(String msg){
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
                    json.put("username", lbl_nomeFunc.getText());
                    json.put("message", msg);

                    txMsg = json.toString();
                    txData = txMsg.getBytes(StandardCharsets.UTF_8);
                    
                    DatagramPacket txPkt = new DatagramPacket(txData, txData.length, srvIP, srvPort);

                    mtcSock.send(txPkt);
                    
                    
                } catch (SocketException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }.start();
    }
    
    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Main.ctrlBase.opcaoPaineisPrincipais(1);
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void btn_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enviarMouseClicked
        String msg = tf_enviarMensagem.getText();
        tf_enviarMensagem.setText(null);
        enviarMSG(msg);
    }//GEN-LAST:event_btn_enviarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_nomeFunc;
    private javax.swing.JTextArea ta_mensagens;
    private javax.swing.JTextField tf_enviarMensagem;
    private javax.swing.JTextField tf_ip;
    private javax.swing.JTextField tf_port;
    // End of variables declaration//GEN-END:variables
}
