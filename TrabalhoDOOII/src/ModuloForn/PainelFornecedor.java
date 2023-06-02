package ModuloForn;

import TrabalhoDOOII.Main;
import org.json.simple.JSONObject;

public class PainelFornecedor extends javax.swing.JPanel {
    private JSONObject jsonRecebimento;
    
    public PainelFornecedor(JSONObject jsonRecebimento) {
        initComponents();
        
        this.jsonRecebimento = jsonRecebimento;
        
        lbl_nomeFunc.setText(jsonRecebimento.get("Nome").toString() + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bt_sair = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btn_inserir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_visualizacaoReq = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btn_msgFunc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_nomeFunc = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Fornecedor");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 20));

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

        btn_inserir.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_inserir.setText("<html> \t\n<style> \t\t\n.obj {text-align: center;} \t\n</style>  \t\n<div class = \"obj\"> \t\t\nInserir <br> Remedio <br> no estoque \t\n</div> </html> ");
        btn_inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inserirMouseClicked(evt);
            }
        });
        add(btn_inserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        btn_editar.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_editar.setText("<html> \t\n<style> \t\t\n.obj {text-align: center;} \t\n</style>  \t\n<div class = \"obj\"> \t\t\nEditar <br> Remedio <br> no estoque \t\n</div> </html> ");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });
        add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, -1));

        btn_visualizacaoReq.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_visualizacaoReq.setText("<html> \t\n<style> \t\t\n.obj {text-align: center;} \t\n</style>  \t\n<div class = \"obj\"> \t\t\n Visualizar <br> Requisições\t\n</div> </html> ");
        btn_visualizacaoReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_visualizacaoReqMouseClicked(evt);
            }
        });
        add(btn_visualizacaoReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, -1));

        btn_listar.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_listar.setText("<html> \t\n<style> \t\t\n.obj {text-align: center;} \t\n</style>  \t\n<div class = \"obj\"> \t\t\nListar <br> Remedio <br> no estoque \t\n</div> </html> ");
        btn_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listarMouseClicked(evt);
            }
        });
        add(btn_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 30, 270));

        btn_msgFunc.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_msgFunc.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tMenssagem <br>para o <br> Funcionario\n\t</div>\n</html>\n");
        btn_msgFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_msgFuncMouseClicked(evt);
            }
        });
        add(btn_msgFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, -1));

        jLabel2.setText("Seja Bem vindo,");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lbl_nomeFunc.setText("jLabel2");
        add(lbl_nomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/gifSemAnimacao (1).gif"))); // NOI18N
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Main.ctrlBase.opcaoPaineisPrincipais(1);
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void btn_inserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inserirMouseClicked
        Main.ctrlBase.chat(jsonRecebimento);
    }//GEN-LAST:event_btn_inserirMouseClicked

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editarMouseClicked

    private void btn_visualizacaoReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_visualizacaoReqMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_visualizacaoReqMouseClicked

    private void btn_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_listarMouseClicked

    private void btn_msgFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_msgFuncMouseClicked
        Main.ctrlBase.opcaoPainelFuncionario(1, jsonRecebimento);
    }//GEN-LAST:event_btn_msgFuncMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_msgFunc;
    private javax.swing.JButton btn_visualizacaoReq;
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
