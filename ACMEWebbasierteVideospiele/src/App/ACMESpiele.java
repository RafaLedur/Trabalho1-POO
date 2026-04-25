package App;

import dados.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ACMESpiele {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void executar() {
        Scanner in = new Scanner(System.in);
        int opt = -1;

        while (opt != 0) {
            System.out.println("\n[1] Cadastrar cliente individual");
            System.out.println("[2] Cadastrar cliente corporativo");
            System.out.println("[0] Sair");
            System.out.print("Opcao: ");

            opt = in.nextInt();

            switch (opt) {
                case 1:
                    cadastrarClienteCPF(in);
                    break;
                case 2: 
                    cadastrarClienteCNPJ(in);
                    break;
                case 0: 
                    System.out.println("Aplicação encerrada");
                default:
                    System.out.println("Opção inválida");
            }
        }
    }


    public boolean clienteExiste(int numero) {
        for (Cliente c : clientes) {
            if (c.getNumero() == numero) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarClienteCPF(Scanner in) {
        System.out.print("Numero: ");
        int numero = in.nextInt();

        if (clienteExiste(numero)) {
            System.out.println("Erro: numero ja cadastrado.");
            return;
        }

        System.out.print("Nome: ");
        String nome = in.nextLine();

        System.out.print("Email: ");
        String email = in.nextLine();

        System.out.print("CPF: ");
        String cpf = in.nextLine();

        Individual cli = new Individual(numero, nome, email, cpf);
        clientes.add(cli);

        System.out.println("Cliente cadastrado: " + cli.descrever());
    }

    public void cadastrarClienteCNPJ(Scanner in) {
        System.out.print("Numero: ");
        int numero = in.nextInt();

        if (clienteExiste(numero)) {
            System.out.println("Erro: numero ja cadastrado.");
            return;
        }

        System.out.print("Nome: ");
        String nome = in.nextLine();
        in.nextLine();

        System.out.print("Email: ");
        String email = in.nextLine();

        System.out.print("CNPJ: ");
        String cnpj = in.nextLine();

        System.out.println("Nome Fantasia: ");
        String nomeF = in.nextLine();
       

        Corporativo cli = new Corporativo(numero, nome, email, cnpj, nomeF);
        clientes.add(cli);

        System.out.println("Cliente cadastrado: " + cli.descrever());
    }
}