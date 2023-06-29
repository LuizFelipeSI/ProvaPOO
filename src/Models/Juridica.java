package Models;

public class Juridica extends Pessoa{

    private String cnpj;

    public Juridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "cnpj: " + this.cnpj;
    }
}
