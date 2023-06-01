package Compartilhado;

import Main.janelasPrincipais.Janela;
import Main.janelasPrincipais.PainelCadastro;
import Main.janelasPrincipais.PainelLogin;
import Main.janelasUnitarias.PainelCliente;
import Main.janelasUnitarias.PainelFornecedor;
import Main.janelasUnitarias.PainelFuncionario;
import ModuloCliente.Cliente;
import ModuloConversa.PainelChat;
import ModuloForn.Fornecedor;
import ModuloFunc.Funcionario;
import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ControladorBase implements IControl{
    private Janela janela;
    private PainelLogin pLog;
    private PainelCadastro pCad;
    
    private PainelChat pChat;
    
    
    private PainelCliente pCliente;
    private PainelFornecedor pForn;
    private PainelFuncionario pFunc;
    
    //########## Comunicação Server ############//
    private InetAddress srvAddrGlobal;
    private int srvPortGlobal;
    private Socket sock;
    private DataOutputStream out;
    private DataInputStream in;
    
    private void inicializarSock(){
        try {
            sock = new Socket(srvAddrGlobal, srvPortGlobal);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+"Erro na implementação do socket", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //########## Janelas ############//
    public ControladorBase(InetAddress srvAddr, int srvPort){
        srvAddrGlobal = srvAddr;
        srvPortGlobal = srvPort;
        
        this.janela = new Janela();
        this.janela.setLocationRelativeTo(null);
        
        inicializarSock();
    }
    
    public void start(){
        this.pLog = new PainelLogin();  //Incializa o painel da tela de cadastro.
        this.mostraTela(this.pLog); 
        
        this.janela.setVisible(true);
    }
    
    public void mostraTela(JPanel newPanel){
        this.janela.getContentPane().removeAll();       
        this.janela.add(newPanel, BorderLayout.CENTER); 
        this.janela.pack();                             
    }
    
    public void opcaoPainelFuncionario(int op, JSONObject json){ // control Funcionario
        switch(op){
            case 1:
                this.pChat = new PainelChat(json);
                mostraTela(this.pChat);
                break;
                
            case 2:
                break;
                
            case 3:
                break;
                
            case 4:
                break;
        }
    }
    
    public void opcaoPainelUnitarios(int op, JSONObject json){
        switch(op){
            case 1:
                this.pCliente = new PainelCliente(json);
                mostraTela(this.pCliente);
                break;
                
            case 2:
                this.pForn = new PainelFornecedor(json);
                mostraTela(this.pForn);
                break;
                
            case 3:
                this.pFunc = new PainelFuncionario(json);
                mostraTela(this.pFunc);
                break;
                
            case 4:
                break;
        }
    }
    
    public void opcaoPaineisPrincipais(int op){
        switch(op){
            case 1:
                this.pLog = new PainelLogin();
                mostraTela(this.pLog);
                break;
                
            case 2:
                this.pCad = new PainelCadastro();
                mostraTela(this.pCad);
                break;
                
            case 3:
                break;
                
            case 4:
                break;
        }
    }
    
    //################ Chat ###############//
    
    
    
    
    
    
    
    
    
    //########### envio Servidor ##########//
    public void enviarObjServidor(JSONObject json){
        try {
            out = new DataOutputStream(sock.getOutputStream());
            in = new DataInputStream(sock.getInputStream());
            
            String msgEnvio, msgRecebida;
            
            msgEnvio = json.toString();
            
            this.out.writeUTF(msgEnvio);
            
            msgRecebida = this.in.readUTF();
            
            if(json.get("Comando").equals("Cadastro")){
                this.pCad.atualizarStatusDeCadastro(msgRecebida);
            }
            else if(json.get("Comando").equals("Entrar")){
                
                JSONParser jsonP = new JSONParser();
                JSONObject jsonEntrar = (JSONObject) jsonP.parse(msgRecebida);
                
                if(jsonEntrar.get("Existente").equals("sim")){
                    
                    if(jsonEntrar.get("Tipo").equals("Cliente")){
                        opcaoPainelUnitarios(1, jsonEntrar);
                    }
                    else if(jsonEntrar.get("Tipo").equals("Funcionario")){
                        opcaoPainelUnitarios(3, jsonEntrar);
                    }
                    else if(jsonEntrar.get("Tipo").equals("Fornecedor")){
                        opcaoPainelUnitarios(2, jsonEntrar);
                    }
                }
            }        
                
            
                              
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "Erro no envio da mensagem", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(ControladorBase.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void criadorJsonEntrar(String cpf, String senha, String comando){
        JSONObject json = new JSONObject();
        
        json.put("CPF", cpf);
        json.put("Senha", senha);
        json.put("Comando", comando);
        
        enviarObjServidor(json);
    }
    
    public void criadorJsonCadastro(Pessoa user, String comando){
        JSONObject json = new JSONObject();
        
        json.put("Nome", user.getNome());
        json.put("CPF", user.getCpf());
        json.put("Senha", user.getSenha());
        json.put("Telefone", user.getTelefone());
        json.put("Data", user.getData());
        json.put("Tipo", user.getTipoUser());
        json.put("Comando", comando);
        
        enviarObjServidor(json);
    }
    
    public boolean verificadorVazios(String nome, String senha, String telefone, String data, String cpf, int tipoUser){
        if(nome.equals("") || senha.equals("") || data.equals("  /  /    ") || cpf.equals("   .   .   -  ") || telefone.equals("(  )     -    ") || tipoUser == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void cadastrarObj(String nome, String senha, String telefone, String data, String cpf, int tipoUser){
        Pessoa user = null;
        
        try{
            if (verificadorVazios(nome, senha, telefone, data, cpf, tipoUser)){
                throw new InputMismatchException();
            }
            else{
                switch(tipoUser){
                    
                    case 1://forn
                        user = new Fornecedor(nome, senha, telefone, data, cpf, "Fornecedor");
                        break;
                        
                    case 2://func
                        user = new Funcionario(nome, senha, telefone, data, cpf, "Funcionario");
                        break;
                        
                    case 3://cli
                        user = new Cliente(nome, senha, telefone, data, cpf, "Cliente");
                        break;
                }
                
                criadorJsonCadastro(user, "Cadastro");
            }
            
        }catch(InputMismatchException ex){
            JOptionPane.showMessageDialog(null, "Não pode haver campos em branco!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
