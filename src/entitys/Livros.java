package entitys;

import java.util.List;

public class Livros {

    private String titulo;
    private String autor;
    private Double preco;
    private Integer idLivro;

    public Livros() {
    }

    public Livros(String titulo, String autor, Double preco, Integer idLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getIdLivro() {
        return idLivro;
    }

    public static boolean contemLivro(List<Livros> listLivros, String titulo) {
        Livros result = listLivros.stream().filter(x -> x.getTitulo() == titulo).findFirst().orElse(null);
        return result != null;
    }

    public static boolean contemId(List<Livros> listLivros, int id) {
        Livros result = listLivros.stream().filter(x -> x.getIdLivro() == id).findFirst().orElse(null);
        return result != null;
    }

    @Override
    public String toString() {
        return idLivro + ", " +
                titulo + ", " +
                autor + ", " +
                preco;
    }

}
