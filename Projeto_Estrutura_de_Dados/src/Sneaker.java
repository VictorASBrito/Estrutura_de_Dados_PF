public class Sneaker {
    private int id;
    private String nome;
    private double peso;
    private String descricao;
    private double valor;
    private double valorVenda;
    private double valorLucro;
    private double percentualLucro;
    private Fabricante fabricante;

    public Sneaker(int id, String nome, double peso, String descricao, double valor, double valorVenda,
            Fabricante fabricante) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.descricao = descricao;
        this.valor = valor;
        this.valorVenda = valorVenda;
        this.valorLucro = valorVenda - valor;
        this.percentualLucro = (valorLucro / valor) * 100;
        this.fabricante = fabricante;
    }

    public Sneaker(int id, String nome, String descricao, double valor, Fabricante fabricante) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.fabricante = fabricante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorLucro() {
        return valorLucro;
    }

    public void setValorLucro(double valorLucro) {
        this.valorLucro = valorLucro;
    }

    public double getPercentualLucro() {
        return percentualLucro;
    }

    public void setPercentualLucro(double percentualLucro) {
        this.percentualLucro = percentualLucro;
    }

}
