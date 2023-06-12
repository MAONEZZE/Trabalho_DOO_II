package ModuloFunc;

import ModuloRemedio.Remedio;
import TrabalhoDOOII.Main;
import java.util.List;
import javax.swing.DefaultListModel;
import org.json.simple.JSONObject;

public class PainelFuncionario extends javax.swing.JPanel {//Tirar as requisições daqui, pq não tem cliente
    private DefaultListModel model = new DefaultListModel();
    private JSONObject jsonRecebimento;
    private Remedio remedio;
    
    public PainelFuncionario(JSONObject jsonRecebimento) {
        initComponents();
        
        btn_verificarRequisicoes.setEnabled(false);
        btn_remover.setEnabled(false);
        
        this.jsonRecebimento = jsonRecebimento;
        
        lbl_nomeFunc.setText(jsonRecebimento.get("Nome").toString() + "!");
        
        if(!Main.ctrlRemedio.selecionarTodos().isEmpty()){
            carregarRemedios();
        }       
    }
    
    public void carregarRemedios(){
        List<Remedio> listaRemedios = Main.ctrlRemedio.selecionarTodos();
        model.clear();
        
        if(!listaRemedios.isEmpty()){
            for(Remedio rem: listaRemedios){
                model.addElement(rem.toString());
            }
            jlist_remedios.setModel(model);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btn_msgForn = new javax.swing.JButton();
        btn_verificarRequisicoes = new javax.swing.JButton();
        lbl_nomeFunc = new javax.swing.JLabel();
        btn_remover = new javax.swing.JButton();
        btn_verificarAquisicoes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_remedios = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 180, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/gifSemAnimacao (1).gif"))); // NOI18N
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 130, 130));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 30, 270));

        btn_msgForn.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_msgForn.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tMenssagem <br>para o <br> Fornecedor\n\t</div>\n</html>\n");
        btn_msgForn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_msgFornMouseClicked(evt);
            }
        });
        add(btn_msgForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, -1));

        btn_verificarRequisicoes.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_verificarRequisicoes.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tVerificar <br> Requisições\n\t</div>\n</html>\n");
        add(btn_verificarRequisicoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, -1));

        lbl_nomeFunc.setText("jLabel2");
        add(lbl_nomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        btn_remover.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_remover.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tRemover <br> Remedio <br> do estoque\n\t</div>\n</html>\n");
        btn_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removerMouseClicked(evt);
            }
        });
        add(btn_remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, -1));

        btn_verificarAquisicoes.setFont(new java.awt.Font("Georgia", 1, 10)); // NOI18N
        btn_verificarAquisicoes.setText("<html>\n\t<style>\n\t\t.obj {text-align: center;}\n\t</style>\n\n\t<div class = \"obj\">\n\t\tVerificar <br> Aquisições\n\t</div>\n</html>\n");
        add(btn_verificarAquisicoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, -1));

        jLabel2.setText("Seja Bem vindo,");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setEnabled(false);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 10, 380));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("<html> \t\n<style> \t\t\n.obj {text-align: center;} \t\n</style>  \t\n<div class = \"obj\"> \t\t\nListagem  <br> Remedios \t\n</div> </html> \n");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 70, 50));

        jlist_remedios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlist_remediosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlist_remedios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 160, 220));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 600, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 200, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Main.ctrlBase.opcaoPaineisPrincipais(1);
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked

    private void btn_msgFornMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_msgFornMouseClicked
        Main.ctrlBase.chat(jsonRecebimento);
    }//GEN-LAST:event_btn_msgFornMouseClicked

    private void jlist_remediosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlist_remediosMouseClicked
        btn_remover.setEnabled(true);

        for(Remedio rem: Main.ctrlRemedio.selecionarTodos()){
            if(jlist_remedios.getSelectedValue().equals(rem.toString())){
                remedio = rem;
                break;
            }
        }
        
    }//GEN-LAST:event_jlist_remediosMouseClicked

    private void btn_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removerMouseClicked
        Main.ctrlRemedio.remover(remedio, 1);
    }//GEN-LAST:event_btn_removerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton btn_msgForn;
    private javax.swing.JButton btn_remover;
    private javax.swing.JButton btn_verificarAquisicoes;
    private javax.swing.JButton btn_verificarRequisicoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList<String> jlist_remedios;
    private javax.swing.JLabel lbl_nomeFunc;
    // End of variables declaration//GEN-END:variables
}
