package Executaveis;

import Models.Fisica;
import Models.Juridica;
import Models.Venda;
import Service.VendaService;
import Views.Menu;

public class Principal {

    public static void main(String[] args) {

        /*Fisica f = new Fisica("luiz", 25, "12652844660");
        System.out.println("cliente cadastratado." + "\n");
        Juridica j = new Juridica("joão", 27, "254699845469");
        System.out.println("cliente cadastratado." + "\n");

        Venda v = new Venda(f, "margarina", 2.50, 6);
        System.out.println("venda cadastratado." + "\n");
        Venda v2 = new Venda(j, "garfo", 4.30, 2);
        System.out.println("venda cadastratado." + "\n");
        Venda v3 = new Venda(f, "coca-cola" , 6.00, 3);
        System.out.println("venda cadastratado." + "\n");

        VendaService servico = new VendaService();

        servico.adicionarVenda(v);
        servico.adicionarVenda(v2);
        servico.adicionarVenda(v3);

        System.out.println("gerando relatório:" + "\n");
        servico.gerarRelatorio();*/

        Menu menu = new Menu();
        menu.menu();
    }
}
