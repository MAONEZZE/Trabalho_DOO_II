package TrabalhoDOOII;

import Compartilhado.ControladorBase;
import ModuloRemedio.ControladorRemedio;
import ModuloRequisicao.ControladorRequisicao;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

public class Main {
    public static ControladorBase ctrlBase;
    public static ControladorRemedio ctrlRemedio = new ControladorRemedio();
    public static ControladorRequisicao ctrlReq = new ControladorRequisicao();
    
/*Controle de estoque, com funcionario, cliente e fornecedor 
 * RepositorioBase, EntidadeBase;
 * Classes Pessoa {Cliente, Fornecedor, Funcionario}, Remedio, Estoque, 
    - Funcionario irá Pegar os medicamentos com o fornecedor e colocar no estoque
    - Fornecedor ira "criar" os medicamentos dar os remedio */
    
    public static void main(String[] args) {
        InetAddress srvAddr = null;
        int srvPort = 0;
        
        if(args.length == 2){
            try {
                srvAddr = InetAddress.getByName(args[0]);
                srvPort = Integer.parseInt(args[1]);
                
                ctrlBase = new ControladorBase(srvAddr, srvPort);
                
                ctrlBase.IniciarPaineis();
            } catch (UnknownHostException ex) {
                JOptionPane.showMessageDialog(null, "IP inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
