package App;
import dados.Cliente;
import dados.Contrato;
import dados.Individual;
import dados.Corporativo;
import dados.Jogo;
import dados.Categoria;
import java.util.ArrayList;
import java.util.Scanner;

public class ACMESpiele{
    private ArrayList<Cliente> clientes;
    private Scanner in;
        public ACMESpiele(){
            in = new Scanner(System.in);
            this.clientes  = new ArrayList<Cliente>();
        }
        public void executar(){
        int opt = 0;
        while(opt == 0){
            System.out.println("[1] Casatrar cliente individual: ");
            opt = in.nextInt();
            in.nextLine();
            System.out.println("[2] Cadastrar cliente corporativo: ")
            opt = in.nextInt();
            in.nextLine();
        }
        switch(opt){
            case 1:
            if(clientes.verify == false){
            System.out.println("erro-numero repetido");
        }else{
            System.out.println("digite o seu numero: ");
            int num = in.nextInt();
            in.nextLine();
            System.out.println("digite o seu nome: ");
            String nome = in.nextLine();
            in.nextLine();
            System.out.println("digite o seu email: ");
            String email = in.nextLine();
            in.nextLine();
            System.out.println("digite o seu cpf: ");
            int cpf = in.nextInt();
            in.nextLine();
        }
        Individual cliente = new Individual(num, nome, email, cpf);
        clientes.add(cliente);
        System.out.println("cliente cadastrado: " +num+ ";" +nome+ ";" +email+ ";" +cpf);


        case 2:
            if(clientes.verify == false){
            System.out.println("erro-numero repetido");
        }else{
            System.out.println("digite o seu numero: ");
            int num = in.nextInt();
            in.nextLine();
            System.out.println("digite o seu nome: ");
            String nome = in.nextLine();
            in.nextLine();
            System.out.println("digite o seu email: ");
            String email = in.nextLine();
            in.nextLine();
            System.out.println("digite o seu cnpj: ");
            String cnpj = in.nextLine();
            in.nextLine();
            System.out.println("digite o seu nome fantasia: ");
            String nomeF = in.nextLine();
            in.nextLine();
        }
        Corporativo cliente = new Corporativo(num, nome, email, cnpj, nomeF);
        clientes.add(cliente);
        System.out.println("cliente cadastrado: " +num+ ";" +nome+ ";" +email+ ";" +cnpj+ ";" +nomeF);
        } 
        }

    }



