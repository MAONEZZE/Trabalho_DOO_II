package ModuloRequisicao;

import TrabalhoDOOII.Main;
import java.util.List;
import javax.swing.DefaultListModel;
import org.json.simple.JSONObject;

public class PainelRequisicao extends javax.swing.JPanel {
    private DefaultListModel model = new DefaultListModel();
    private JSONObject jsonUsuario;
    private Requisicao requisicaoGlobal;
    
    public PainelRequisicao(JSONObject jsonUsuario) {
        initComponents();
        this.jsonUsuario = jsonUsuario;
        
        btn_concluir.setEnabled(false);
        
        lbl_nomeFunc.setText(jsonUsuario.get("Nome").toString() + "!");
        
        carregarLista();
    }
    
    private void carregarLista(){
        List<Requisicao> listaReq = Main.ctrlReq.selecionarTodos();
        model.clear();
        
        if(!listaReq.isEmpty()){
            for(Requisicao req: listaReq){
                model.addElement(req.toString());
            }
            jListmensagem.setModel(model);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        bt_sair = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        lbl_nomeFunc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListmensagem = new javax.swing.JList<>();
        btn_concluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 380, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 380, 10));

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

        lbl_nomeFunc.setText("jLabel2");
        add(lbl_nomeFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel2.setText("Seja Bem vindo,");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Requisições");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jListmensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListmensagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListmensagem);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 160));

        btn_concluir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_concluir.setText("Concluir");
        btn_concluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_concluirMouseClicked(evt);
            }
        });
        add(btn_concluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TrabalhoDOOII/imagens/TelaBase.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_bt_sairMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Main.ctrlBase.opcaoPaineisUnitarios(2, jsonUsuario);
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void btn_concluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_concluirMouseClicked
        Main.ctrlReq.excluir(requisicaoGlobal);
    }//GEN-LAST:event_btn_concluirMouseClicked

    private void jListmensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListmensagemMouseClicked
        btn_concluir.setEnabled(true);

        for(Requisicao req: Main.ctrlReq.selecionarTodos()){
            if(jListmensagem.getSelectedValue().equals(req.toString())){
                requisicaoGlobal = req;
                break;
            }
        }
    }//GEN-LAST:event_jListmensagemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton btn_concluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListmensagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_nomeFunc;
    // End of variables declaration//GEN-END:variables
}
