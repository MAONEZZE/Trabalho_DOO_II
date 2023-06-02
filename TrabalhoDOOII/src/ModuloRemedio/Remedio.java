package ModuloRemedio;

import Compartilhado.EntidadeBase;
import ModuloForn.Fornecedor;

public class Remedio extends EntidadeBase{
    private Fornecedor forn;
    private String nome;
    private int quantidade;

    public Remedio(Fornecedor forn, String nome, int quantidade) {
        this.forn = forn;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Fornecedor getForn() {
        return forn;
    }

    public void setForn(Fornecedor forn) {
        this.forn = forn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
