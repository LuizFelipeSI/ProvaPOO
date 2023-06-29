package Service;

import Models.Pessoa;

import java.util.ArrayList;

public class ClienteService {

    private static ArrayList<Pessoa> clientes = new ArrayList<>();

    public void adicionarCliente(Pessoa cliente) {
        clientes.add(cliente);
    }

    public static ArrayList<Pessoa> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Pessoa> clientes) {
        ClienteService.clientes = clientes;
    }
}
