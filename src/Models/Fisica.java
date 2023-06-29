package Models;

public class Fisica extends Pessoa {

    private String cpf;

    public Fisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "cpf: " + this.cpf;
    }
}
