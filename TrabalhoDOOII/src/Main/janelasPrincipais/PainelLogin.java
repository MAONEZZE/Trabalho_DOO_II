package Main.janelasPrincipais;

import TrabalhoDOOII.Main;

public class PainelLogin extends javax.swing.JPanel {

    public PainelLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_continuarSemCadastro = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_cad = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        formTf_cpf = new javax.swing.JFormattedTextField();
        tfPass_senha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabel1.setText("CPF:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabel4.setText("Senha:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 80));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Seja Bem Vindo!");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        btn_entrar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_entrar.setText("Entrar");
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entrarMouseClicked(evt);
            }
        });
        add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Entre ou Cadastre-se");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        jLabel5.setText("Caso não possua cadastro");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 140, 30));

        bt_continuarSemCadastro.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        bt_continuarSemCadastro.setText("<html>\n\t<style>\n\t\t.obj {\n \t \t\ttext-align: center;\n\t\t}\n\t</style>\n\t<div class = \"obj\">\n\t\tEntrar <br>sem Cadastro\n\t</div>\n</html>\n");
        bt_continuarSemCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(bt_continuarSemCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 110, 40));

        btn_sair.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_sair.setText("Sair");
        add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 360, -1));

        btn_cad.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_cad.setText("Cadastre-se");
        btn_cad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadMouseClicked(evt);
            }
        });
        add(btn_cad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 380, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 322, 380, 10));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 10, 254));

        try {
            formTf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(formTf_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));
        add(tfPass_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaLogin.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadMouseClicked
        Main.ctrlBase.opcaoPaineisPrincipais(2);
    }//GEN-LAST:event_btn_cadMouseClicked

    private void btn_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseClicked
        String cpf = formTf_cpf.getText();
        String senha = String.valueOf(tfPass_senha.getPassword());
        String comando = "Entrar";
        
        Main.ctrlBase.criadorJsonEntrar(cpf, senha, comando);

    }//GEN-LAST:event_btn_entrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_continuarSemCadastro;
    private javax.swing.JButton btn_cad;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JFormattedTextField formTf_cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField tfPass_senha;
    // End of variables declaration//GEN-END:variables
}
