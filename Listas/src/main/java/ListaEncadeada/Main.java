package ListaEncadeada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        boolean rodando = true;
        Scanner in = new Scanner(System.in);
        while (rodando) {
            System.out.println("----------------------------------");
            System.out.println("-------- Lista de Pessoas --------");
            System.out.println("----------------------------------");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Remover Pessoa");
            System.out.println("3 - Listar Pessoas");
            System.out.println("4 - Inserir Pessoas");
            System.out.print("Escolha: ");
            int escolha = in.nextInt();
            String nome = "";
            String cpf = "";

            switch (escolha) {
                case 1:
                    in = new Scanner(System.in);
                    System.out.print("Escreva o nome da pessoa: ");
                    nome = in.nextLine();
                    System.out.print("Escreva o CPF da pessoa: ");
                    cpf = in.nextLine();
                    Pessoa p1 = new Pessoa(nome, cpf);
                    lista.adicionar(p1);
                    break;
                case 2:
                    in = new Scanner(System.in);
                    System.out.print("Escreva o nome da pessoa que deseja remover: ");
                    nome = in.nextLine();
                    if (lista.remover(nome)) {
                        System.out.println("Pessoa removido com sucesso.");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 3:
                    in = new Scanner(System.in);
                    lista.listar();
                    break;
                case 4:
                    in = new Scanner(System.in);
                    System.out.print("Escreva o nome da pessoa: ");
                    nome = in.nextLine();
                    System.out.print("Escreva o CPF da pessoa: ");
                    cpf = in.nextLine();
                    p1 = new Pessoa(nome, cpf);
                    System.out.print("Escreva a posição que deseja inserir: ");
                    int pos = in.nextInt();
                    lista.inserir(p1, pos);
                    break;
                default:
                    System.out.println("Sistema encerrado.");
                    rodando = false;
            }
        }

    }
}
