package entitys;

public class Endereco {
    private String rua;
    private String cidade;
    private String cep;
    private Long numeroCasa;

    public Endereco() {
    }

    public Endereco(String rua, String cidade, String cep, long numeroCasa) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.numeroCasa = numeroCasa;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public long getNumeroCasa() {
        return numeroCasa;
    }

}
