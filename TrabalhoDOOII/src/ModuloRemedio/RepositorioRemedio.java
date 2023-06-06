package ModuloRemedio;

import TrabalhoDOOII.Main;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;

public class RepositorioRemedio {
    private List<Remedio> listaRemedio = new ArrayList();

    public RepositorioRemedio() {
        carregarListaMemoria();
    }
    
    private void carregarListaMemoria(){
        JSONObject json = new JSONObject();
        
        json.put("Objeto", "Remedio");
        json.put("Comando", "CarregarMemoria");
        
        Main.ctrlBase.enviarObjServidor(json);
    }
    
    public List<Remedio> getListaRemedio() {
        return listaRemedio;
    }
}
