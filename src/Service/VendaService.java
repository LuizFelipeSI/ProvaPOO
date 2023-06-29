package Service;


import Models.Venda;
import Views.Menu;

import java.util.ArrayList;

public class VendaService {

    private static ArrayList<Venda> vendas = new ArrayList<>();

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }

    public void gerarRelatorio() {
        System.out.println("venda total: " + String.format("%.2f", Venda.vendaTotal));
        System.out.println("valor médio por venda: " + String.format("%.2f", Venda.vendaTotal / vendas.size()));
        Menu menu = new Menu();
        menu.menu();
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(ArrayList<Venda> vendas) {
        VendaService.vendas = vendas;
    }
}
