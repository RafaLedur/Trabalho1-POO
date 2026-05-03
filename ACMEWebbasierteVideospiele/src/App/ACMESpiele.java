package App;

import dados.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ACMESpiele {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Jogo> jogo = new ArrayList<>();

    public void executar() {
        Scanner in = new Scanner(System.in);
        int opt = -1;

        while (opt != 0) {
            System.out.println("\n[1] Cadastrar cliente individual");
            System.out.println("[2] Cadastrar cliente corporativo");
            System.out.println("[3] Cadastrar jogo ");
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
                case 3:
                    cadastraJogo(in);
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

    public boolean jogoExiste(int numero){
        for(Jogo j : jogo){
            if(j.getCodigo() == numero){
                return true;
            }
        }
        return false;
    }
    public boolean categoriaExiste(String cat){
    for (Categoria c : Categoria.values()) {
        if (c.name().equalsIgnoreCase(cat)) {
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
        in.nextLine();

        System.out.print("Email: ");
        String email = in.nextLine();
        in.nextLine();

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
        in.nextLine();

        System.out.print("CNPJ: ");
        String cnpj = in.nextLine();

        System.out.println("Nome Fantasia: ");
        String nomeF = in.nextLine();
       

        Corporativo cli = new Corporativo(numero, nome, email, cnpj, nomeF);
        clientes.add(cli);

        System.out.println("Cliente cadastrado: " + cli.descrever());
    }

    public void cadastraJogo(Scanner in){
        System.out.print("Código: ");
        int cod = in.nextInt();

        if (jogoExiste(cod)) {
            System.out.println("Erro: erro-codigo repetido.");
            return;
        }
        System.out.print("Nome: ");
        String nome = in.nextLine();
        in.nextLine();

        System.out.print("Ano: ");
        int ano = in.nextInt();
        in.nextLine();

        System.out.print("Valor minuto: ");
        double vMin = in.nextDouble();
        in.nextLine();

        System.out.print("Categoria: ");
        String cat = in.nextLine();
        in.nextLine();

        if (!categoriaExiste(cat)) {
        System.out.println("erro-categoria inexistente.");
        return;
        }
        Categoria categoria = Categoria.valueOf(cat.toUpperCase());

            System.out.println(cod+ ";" +nome+ ";" +ano+ ";" +vMin+ ";" +cat);
        
        Jogo j = new Jogo(cod, nome, ano, vMin, categoria);
        jogo.add(j);
       
    }
}