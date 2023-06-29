package Models;

import java.util.ArrayList;

public abstract class Pessoa {

    protected String nome;
    protected int idade;

    protected ArrayList<Pessoa> clientes = new ArrayList<>();

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "nome: " + this.nome + "\n" + "idade: " + this.idade;
    }
}
