package properties;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitys.Comprador;
import entitys.Endereco;
import entitys.Livros;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá comprador, primeiro precisamos fazer o seu cadastro..");
        System.out.println();

        System.out.print("Insira seu Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.next();

        System.out.print("Id: ");
        int id = sc.nextInt();

        System.out.print("CEP: ");
        String cep = sc.next();

        sc.nextLine();

        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Número da casa: ");
        long numeroCasa = sc.nextLong();

        System.out.print("Quantidade de dinheiro: ");
        double dinheiro = sc.nextDouble();

        Endereco endereco = new Endereco(rua, rua, cep, numeroCasa);
        Comprador comprador = new Comprador(nome, cpf, endereco, dinheiro, id);

        List<Livros> list = new ArrayList<>();

        System.out.println();

        System.out.print("Quantidade de livros que irá adicionar: ");
        int qtdLivros = sc.nextInt();

        for (int i = 0; i < qtdLivros; i++) {

            System.out.println("Livro " + (i + 1) + "#:");

            sc.nextLine();
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Id Livro: ");
            int idLivro = sc.nextInt();

            while (Livros.contemId(list, idLivro)) {
                System.out.print("Id já existe, tente novamente: ");
                idLivro = sc.nextInt();
            }

            list.add(new Livros(titulo, autor, preco, idLivro));

            System.out.println();
        }

        System.out.println("Livros disponíveis para compra:");

        for (Livros livros : list) {
            System.out.println(livros);
        }

        System.out.println();

        System.out.print("Deseja comprar algum livro? S/N: ");
        String resp = sc.next().toUpperCase();

        if (resp.equals("S")) {
            sc.nextLine();
            System.out.println("Qual o Id do livro que deseja comprar? ");
            int idLivro = sc.nextInt();

            Livros result = list.stream().filter(x -> x.getIdLivro() == idLivro)
                    .findFirst().orElse(null);

            if (Livros.contemLivro(list, idLivro)) {
                comprador.comprar(result, idLivro);
            }

        } else {
            System.out.println("Ok, encerrando programa..");
            System.exit(0);
        }
        sc.close();
    }

}