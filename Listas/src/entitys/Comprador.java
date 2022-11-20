package entitys;

import java.util.ArrayList;
import java.util.List;

public class Comprador {

    private String nome;
    private String cpf;
    private Endereco endereco;
    private Double dinheiro;
    private Integer idComprador;
    private List<Livros> livrosComprados = new ArrayList<>();

    public Comprador() {
    }

    public Comprador(String nome, String cpf, Endereco endereco, Double dinheiro, Integer idComprador) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dinheiro = dinheiro;
        this.idComprador = idComprador;
    }

    public Integer getIdComprador() {
        return idComprador;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public List<Livros> getLivrosComprados() {
        return livrosComprados;
    }

    public void comprar(Livros livros, int idLivro) {

        if (livros.getPreco() > this.getDinheiro()) {
            System.out.println("Você não possuí dinheiro suficiente para comprar este item!");
            System.out.println(
                    "Faltam " + (livros.getPreco() - this.getDinheiro()) + " para comprar o livro");
        } else {
            livrosComprados.add(livros);

            System.out.println();

            System.out.println("Você comprou o livro " + (livros.getTitulo()));
            System.out.println("Livros comprados até o momento:");

            for (int i = 0; i < livrosComprados.size(); i++) {
                System.out.println(livrosComprados.get(i).getTitulo());
            }
        }

    }

}