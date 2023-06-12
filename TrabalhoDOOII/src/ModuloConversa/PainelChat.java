package ModuloConversa;

import TrabalhoDOOII.Main;
import org.json.simple.JSONObject;

public class PainelChat extends javax.swing.JPanel {
    private JSONObject jsonRecebimento;
    private ControladorChat ctrlChat;
        
    public PainelChat(JSONObject jsonRecebimento) {
        initComponents();
        ctrlChat = new ControladorChat(tf_ip.getText(), tf_port.getText(), jsonRecebimento);
        
        this.jsonRecebimento = jsonRecebimento;
        
        lbl_nomeFunc.setText(jsonRecebimento.get("Nome").toString());

        ctrlChat.lerMSG();
    }
    
    public void mostrarMSG(JSONObject json){
        ta_mensagens.setText(ta_mensagens.getText() + "Date: " + json.get("date") + 
        "\n" + "Username: " + json.get("username") + 
        "\n" + "Time: " + json.get("time") + 
        "\n" + "Message: " + json.get("message") + "\n");

        ta_mensagens.setText(ta_mensagens.getText() + "\n");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        add(tf_port, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        lbl_nomeFunc.setText("nomeFunc");
        add(lbl_nomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        ta_mensagens.setEditable(false);
        ta_mensagens.setColumns(20);
        ta_mensagens.setRows(5);
        jScrollPane1.setViewportView(ta_mensagens);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 360, 130));

        jLabel4.setText("IP:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 20, 20));

        jLabel5.setText("Porta:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 40, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Chat");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setText("<req>  nome do remedio --> para fazer requisição do remedio");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        ctrlChat.closeConnection();
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        ctrlChat.closeConnection();
        if(jsonRecebimento.get("Tipo").equals("Cliente")){
            Main.ctrlBase.opcaoPaineisUnitarios(1, jsonRecebimento);
        }
        else if(jsonRecebimento.get("Tipo").equals("Funcionario")){
            Main.ctrlBase.opcaoPaineisUnitarios(3, jsonRecebimento);
        }
        else if(jsonRecebimento.get("Tipo").equals("Fornecedor")){
            Main.ctrlBase.opcaoPaineisUnitarios(2, jsonRecebimento);
        }
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void btn_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enviarMouseClicked
        String msg = tf_enviarMensagem.getText();
        tf_enviarMensagem.setText(null);
        ctrlChat.enviarMSG(msg);
    }//GEN-LAST:event_btn_enviarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
