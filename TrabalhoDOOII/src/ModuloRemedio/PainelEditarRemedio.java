package ModuloRemedio;

import TrabalhoDOOII.Main;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

public class PainelEditarRemedio extends javax.swing.JPanel {
    private JSONObject jsonUsuario;
    private Remedio remedioSelecionado;
    
    public PainelEditarRemedio(JSONObject jsonUsuario, Remedio remedioSelecionado) {
        initComponents();
        
        this.remedioSelecionado = remedioSelecionado;
        this.jsonUsuario = jsonUsuario;
        
        tf_nomeForn.setText(jsonUsuario.get("Nome").toString());
        tf_nomeR.setText(remedioSelecionado.getNome());
        tf_preco.setText(String.valueOf(remedioSelecionado.getPreco()));
        tf_quant.setText(String.valueOf(remedioSelecionado.getQuantidade()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        bt_sair = new javax.swing.JButton();
        tf_nomeForn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nomeR = new javax.swing.JTextField();
        tf_quant = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_preco = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_cadastrarNovoR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbl_statusCad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 10));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Edição de Remedio");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        bt_voltar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        add(bt_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 380, 10));

        bt_sair.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });
        add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        tf_nomeForn.setEditable(false);
        add(tf_nomeForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("Nome do Funcionario:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel6.setText("Nome do Remedio:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 20));
        add(tf_nomeR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 200, -1));

        try {
            tf_quant.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(tf_quant, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 80, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel5.setText("Quantidade:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 90, 20));

        tf_preco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###.00"))));
        add(tf_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 80, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setText("Preço:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 40, 20));

        btn_cadastrarNovoR.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_cadastrarNovoR.setText("<html> \t<style> \t\t.obj {text-align: center;} \t</style>  \t<div class = \"obj\"> \t\tCadastrar <br>Novo<br>Remédio\n \t</div> </html>  ");
        btn_cadastrarNovoR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarNovoRMouseClicked(evt);
            }
        });
        add(btn_cadastrarNovoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel8.setText("Status do cadastro:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        lbl_statusCad.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        lbl_statusCad.setForeground(new java.awt.Color(0, 102, 0));
        lbl_statusCad.setText("-------");
        add(lbl_statusCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Main.ctrlBase.opcaoPaineisUnitarios(2, jsonUsuario);
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked
    
    private void limparTF(){
        tf_nomeR.setText("");
        tf_preco.setText("");
        tf_quant.setText("");
    }
    
    private void btn_cadastrarNovoRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarNovoRMouseClicked
        String nome = tf_nomeR.getText();
        String preco = tf_preco.getText();
        String quant = tf_quant.getText();

        if(Main.ctrlRemedio.editar(jsonUsuario.get("Nome").toString(), nome, preco, quant, this.remedioSelecionado)){
            limparTF();
            lbl_statusCad.setText("Remedio editado com sucesso!");
            tf_nomeR.setEnabled(false);
            tf_preco.setEnabled(false);
            tf_quant.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não pode haver campos em branco!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_cadastrarNovoRMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton btn_cadastrarNovoR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_statusCad;
    private javax.swing.JTextField tf_nomeForn;
    private javax.swing.JTextField tf_nomeR;
    private javax.swing.JFormattedTextField tf_preco;
    private javax.swing.JFormattedTextField tf_quant;
    // End of variables declaration//GEN-END:variables
}
