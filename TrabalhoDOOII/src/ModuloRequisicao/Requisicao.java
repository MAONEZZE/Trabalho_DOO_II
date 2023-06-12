package ModuloRequisicao;

import Compartilhado.EntidadeBase;
import java.io.Serializable;

public class Requisicao extends EntidadeBase implements Serializable{
    private String dataReq;
    private String nomeRemedio;
    private String nomeUsuario;

    public Requisicao(String dataReq, String nomeRemedio, String nomeUsuario) {
        this.dataReq = dataReq;
        this.nomeRemedio = nomeRemedio;
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataReq() {
        return dataReq;
    }

    public void setDataReq(String dataReq) {
        this.dataReq = dataReq;
    }

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    @Override
    public String toString() {
        return "ID: "+id+" | Data: "+dataReq+" | Nome Remedio: "+nomeRemedio+" | Nome Funcionario: "+nomeUsuario;
    }
}
