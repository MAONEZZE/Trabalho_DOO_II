package Main.janelasPrincipais;

import TrabalhoDOOII.Main;
import javax.swing.JOptionPane;

public class PainelCadastro extends javax.swing.JPanel {
    private int i = 0;
    private int tipoUser = 0;
    
    public PainelCadastro() {
        initComponents();
        tf_senha.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        formTf_cpf = new javax.swing.JFormattedTextField();
        tf_nome = new javax.swing.JTextField();
        formTf_dataN = new javax.swing.JFormattedTextField();
        formTf_telefone = new javax.swing.JFormattedTextField();
        rb_cliente = new javax.swing.JRadioButton();
        rb_forn = new javax.swing.JRadioButton();
        rb_func = new javax.swing.JRadioButton();
        bt_voltar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        btn_cadastrarUser = new javax.swing.JButton();
        tfPass = new javax.swing.JPasswordField();
        tf_senha = new javax.swing.JTextField();
        btn_verSenha = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbl_statusCad = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cadastre-se");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 380, 10));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabel2.setText("Data de Nascimento:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabel4.setText("Nome:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabel5.setText("Telefone:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabel6.setText("CPF:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabel7.setText("Senha:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        try {
            formTf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(formTf_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 100, -1));
        add(tf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, -1));

        try {
            formTf_dataN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(formTf_dataN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 70, -1));

        try {
            formTf_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(formTf_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 100, -1));

        rb_cliente.setBackground(new java.awt.Color(177, 202, 252));
        buttonGroup1.add(rb_cliente);
        rb_cliente.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        rb_cliente.setText("Cliente");
        rb_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_clienteMouseClicked(evt);
            }
        });
        add(rb_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 100, -1));

        rb_forn.setBackground(new java.awt.Color(177, 202, 252));
        buttonGroup1.add(rb_forn);
        rb_forn.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        rb_forn.setText("Fornecedor");
        rb_forn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_fornMouseClicked(evt);
            }
        });
        add(rb_forn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 100, -1));

        rb_func.setBackground(new java.awt.Color(177, 202, 252));
        buttonGroup1.add(rb_func);
        rb_func.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        rb_func.setText("Funcionário");
        rb_func.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_funcMouseClicked(evt);
            }
        });
        add(rb_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 100, -1));

        bt_voltar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        add(bt_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        bt_sair.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sairMouseClicked(evt);
            }
        });
        add(bt_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        btn_cadastrarUser.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_cadastrarUser.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tCadastrar <br>Usuário\n\t</div>\n</html>\n\n");
        btn_cadastrarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarUserMouseClicked(evt);
            }
        });
        add(btn_cadastrarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));
        add(tfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 110, -1));
        add(tf_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 110, -1));

        btn_verSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/visibility_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        btn_verSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verSenhaMouseClicked(evt);
            }
        });
        add(btn_verSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 30, 20));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel8.setText("Status do cadastro:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        lbl_statusCad.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        lbl_statusCad.setForeground(new java.awt.Color(0, 102, 0));
        lbl_statusCad.setText("-------");
        add(lbl_statusCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 380));
    }// </editor-fold>//GEN-END:initComponents

    public void atualizarStatusDeCadastro(String msgServer){
        lbl_statusCad.setText(msgServer);
    }
    
    private void limparTF(){
        tf_nome.setText("");
        tfPass.setText("");
        formTf_dataN.setText("");
        formTf_cpf.setText("");
        formTf_telefone.setText("");
    }
    
    private void btn_cadastrarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarUserMouseClicked
        String nome = tf_nome.getText();
        String senha = String.valueOf(tfPass.getPassword());
        String data = formTf_dataN.getText();
        String cpf = formTf_cpf.getText();
        String telefone = formTf_telefone.getText();
        
        if(Main.ctrlBase.cadastrarObj(nome, senha, telefone, data, cpf, tipoUser)){
            limparTF();
        }
        else{
            JOptionPane.showMessageDialog(null, "Não pode haver campos em branco!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_cadastrarUserMouseClicked

    private void btn_verSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verSenhaMouseClicked
        tf_senha.setText(String.valueOf(tfPass.getPassword()));
        
        if(i%2 == 0){
            tfPass.setVisible(true);
            tf_senha.setVisible(false);
        }
        else{
            tfPass.setVisible(false);
            tf_senha.setVisible(true);
        }
        
        i++;
    }//GEN-LAST:event_btn_verSenhaMouseClicked

    private void rb_fornMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fornMouseClicked
        this.tipoUser = 1;
    }//GEN-LAST:event_rb_fornMouseClicked

    private void rb_funcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_funcMouseClicked
        this.tipoUser = 2;
    }//GEN-LAST:event_rb_funcMouseClicked

    private void rb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_clienteMouseClicked
        this.tipoUser = 3;
    }//GEN-LAST:event_rb_clienteMouseClicked

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Main.ctrlBase.opcaoPaineisPrincipais(1);
    }//GEN-LAST:event_bt_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton btn_cadastrarUser;
    private javax.swing.JButton btn_verSenha;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField formTf_cpf;
    private javax.swing.JFormattedTextField formTf_dataN;
    private javax.swing.JFormattedTextField formTf_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_statusCad;
    private javax.swing.JRadioButton rb_cliente;
    private javax.swing.JRadioButton rb_forn;
    private javax.swing.JRadioButton rb_func;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_senha;
    // End of variables declaration//GEN-END:variables
}
