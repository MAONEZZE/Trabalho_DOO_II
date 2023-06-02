package Compartilhado;

public abstract class Pessoa extends EntidadeBase{
    protected String nome;
    protected String senha;
    protected String telefone;
    protected String data;
    protected String cpf;
    protected String tipoUser;

    public Pessoa(String nome, String senha, String telefone, String data, String cpf, String tipoUser) {
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
        this.data = data;
        this.cpf = cpf;
        this.tipoUser = tipoUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }
    
    
}
