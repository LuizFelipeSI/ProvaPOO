package Views;

import Service.VendaService;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("---------------------");
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Cadastrar venda");
        System.out.println("3 - Gerar relatório");
        System.out.println("0 - Sair");
        System.out.println("---------------------");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            ClienteView cliente = new ClienteView();
            cliente.cadastrarCliente();
        } else if (opcao == 2) {
            VendaView venda = new VendaView();
            venda.cadastrarVenda();
        } else if(opcao == 3) {
            VendaService venda = new VendaService();
            venda.gerarRelatorio();
        } else if(opcao == 0) {

        }
    }
}
