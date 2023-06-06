package ModuloRemedio;

import TrabalhoDOOII.Main;
import java.util.List;
import java.util.ArrayList;
import org.json.simple.JSONObject;

public class ControladorRemedio{
    private List<Remedio> listaRemedio = new ArrayList();
    
    public void atualizarListMemoria(String listaStr){
        
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
