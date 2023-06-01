package Main.janelasUnitarias;

import TrabalhoDOOII.Main;
import org.json.simple.JSONObject;

public class PainelFuncionario extends javax.swing.JPanel {
    private JSONObject jsonRecebimento;
    
    public PainelFuncionario(JSONObject jsonRecebimento) {
        initComponents();
        
        this.jsonRecebimento = jsonRecebimento;
        
        lbl_nomeFunc.setText(jsonRecebimento.get("Nome").toString() + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btn_msgForn = new javax.swing.JButton();
        btn_inserirIMG = new javax.swing.JButton();
        btn_verificarRequisicoes = new javax.swing.JButton();
        lbl_nomeFunc = new javax.swing.JLabel();
        btn_inserir = new javax.swing.JButton();
        btn_remover = new javax.swing.JButton();
        btn_verificarAquisicoes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 20));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Funcionario");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

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
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 380, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/gifSemAnimacao (1).gif"))); // NOI18N
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 130, 130));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 30, 270));

        btn_msgForn.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_msgForn.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tMenssagem <br>para o <br> Fornecedor\n\t</div>\n</html>\n");
        btn_msgForn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_msgFornMouseClicked(evt);
            }
        });
        add(btn_msgForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 130, -1));

        btn_inserirIMG.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_inserirIMG.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tInserir <br> Imagens\n\t</div>\n</html>\n");
        add(btn_inserirIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 130, -1));

        btn_verificarRequisicoes.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_verificarRequisicoes.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tVerificar <br> Requisições\n\t</div>\n</html>\n");
        add(btn_verificarRequisicoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, -1));

        lbl_nomeFunc.setText("jLabel2");
        add(lbl_nomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        btn_inserir.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_inserir.setText("<html> \t\n<style> \t\t\n.obj {text-align: center;} \t\n</style>  \t\n<div class = \"obj\"> \t\t\nInserir <br> Remedio <br> no estoque \t\n</div> </html> ");
        add(btn_inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        btn_remover.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_remover.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tRemover <br> Remedio <br> do estoque\n\t</div>\n</html>\n");
        add(btn_remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, -1));

        btn_verificarAquisicoes.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_verificarAquisicoes.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tVerificar <br> Aquisições\n\t</div>\n</html>\n");
        add(btn_verificarAquisicoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));

        jLabel2.setText("Seja Bem vindo,");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Main.ctrlBase.opcaoPaineisPrincipais(1);
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked

    private void btn_msgFornMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_msgFornMouseClicked
        Main.ctrlBase.opcaoPainelFuncionario(1, jsonRecebimento);
    }//GEN-LAST:event_btn_msgFornMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_inserirIMG;
    private javax.swing.JButton btn_msgForn;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_verificarAquisicoes;
    private javax.swing.JButton btn_verificarRequisicoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_nomeFunc;
    // End of variables declaration//GEN-END:variables
}
