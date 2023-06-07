package ModuloRemedio;

import TrabalhoDOOII.Main;
import java.util.List;
import org.json.simple.JSONObject;

public class ControladorRemedio{//Serializar a lista nesse projeto mesmo, sempre 
                                //carregar a lista primeiro e serializar a cada ação (Ex: editar, excluir e inserir)
    private List<Remedio> listaRemedio;
    private AtualizadorListaRemedio atualizador;
    
    public ControladorRemedio(){

        listaRemedio = carregarListaMemoria();
    }

    private void carregarListaMemoria(){
        
    }
    
    public void cadastrarRemedio(Remedio remedio, String comando) {
        JSONObject json = new JSONObject();
        
        json.put("Objeto", "Remedio");
        json.put("Comando", "Cadastro");
        json.put("Nome Fornecedor", remedio.getNomeForn());
        json.put("Nome", remedio.getNome());
        json.put("Preco", remedio.getPreco());
        json.put("Quantidade", remedio.getQuantidade());
        
        Main.ctrlBase.enviarObjServidor(json);
    }
    
    public void removerRemedio(){
        
    }
    
    public void editarRemedio(){
        
    }
    
}
