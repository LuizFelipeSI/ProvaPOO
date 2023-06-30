package Views;

import Models.Pessoa;
import Models.Venda;
import Service.ClienteService;
import Service.VendaService;

import java.util.Scanner;

public class VendaView {

    Scanner scanner = new Scanner(System.in);
    public void cadastrarVenda() {

        /*ClienteService clientes = new ClienteService();*/
        System.out.println("cliente: ");
        String nome = scanner.next();
        Pessoa pessoa;
        Menu menu = new Menu();

        for(int i = 0; i < ClienteService.getClientes().size(); i++) {
            if(nome.equals(ClienteService.getClientes().get(i).getNome())) {
                pessoa = ClienteService.getClientes().get(i);
                System.out.println("nome do produto: ");
                String nomeProduto = scanner.next();
                System.out.println("valor do produto: ");
                double valor = scanner.nextDouble();
                System.out.println("quantidade: ");
                int quantidade = scanner.nextInt();
                Venda venda = new Venda(pessoa, nomeProduto, valor, quantidade);
                VendaService servico = new VendaService();
                servico.adicionarVenda(venda);
                System.out.println("venda cadastrada");
                menu.menu();
            } else {
                System.out.println("cliente não existe");
                menu.menu();
            }
        }
    }
}
