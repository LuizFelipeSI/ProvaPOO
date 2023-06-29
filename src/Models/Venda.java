package Models;

public class Venda {

    private Pessoa cliente;
    private String nomeProduto;
    private double valor;
    private int quantidade;
    public static double vendaTotal = 0;

    public Venda(Pessoa cliente, String nomeProduto, double valor, int quantidade) {
        this.cliente = cliente;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
        vendaTotal += valor*quantidade;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
