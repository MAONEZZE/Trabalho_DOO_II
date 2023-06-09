package ModuloRemedio;

import java.io.Serializable;
import java.util.Random;

public class Remedio implements Serializable{
    private Random rand = new Random();
    private int id;
    private String nomeForn;
    private String nome;
    private float preco;
    private int quantidade;

    public Remedio(String nomeForn, String nome, int quantidade, float preco) {
        this.id = rand.nextInt(0, 30);
        this.nomeForn = nomeForn;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNomeForn() {
        return nomeForn;
    }

    public void setNomeForn(String nomeForn) {
        this.nomeForn = nomeForn;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ID: "+id+" | Nome: "+nome+" | Quantidade: "+quantidade+" | Fornecedor: "+nomeForn;
    }
    
    
}
