package Views;

import Models.Fisica;
import Models.Juridica;
import Service.ClienteService;

import java.util.Scanner;

public class ClienteView {

    Scanner scanner = new Scanner(System.in);
    public void cadastrarCliente() {

        System.out.println("pessoa física ou jurídica?");
        System.out.println("1 - física");
        System.out.println("2 - jurídica");
        int opcao = scanner.nextInt();
        Menu menu = new Menu();

        if(opcao == 1) {
            System.out.println("nome: ");
            String nome = scanner.next();
            System.out.println("idade: ");
            int idade = scanner.nextInt();
            System.out.println("cpf: ");
            String cpf = scanner.next();
            Fisica fisica = new Fisica(nome, idade, cpf);
            ClienteService cliente = new ClienteService();
            cliente.adicionarCliente(fisica);
            System.out.println("cliente cadastrado");
            menu.menu();
        } else if(opcao == 2) {
            System.out.println("nome: ");
            String nome = scanner.next();
            System.out.println("idade: ");
            int idade = scanner.nextInt();
            System.out.println("cnpj: ");
            String cnpj = scanner.next();
            Juridica juridica = new Juridica(nome, idade, cnpj);
            ClienteService cliente = new ClienteService();
            cliente.adicionarCliente(juridica);
            System.out.println("cliente cadastrado");
            menu.menu();
        }
    }
}
