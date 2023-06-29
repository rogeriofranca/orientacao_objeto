package entidade;

import java.time.LocalDate;

public class Livro {
    private String nomeDoLivro = " ";
    private String autorDoLivro = " ";
    private String nomeDaEditora = " ";
    private Integer quantDeFolhas = 0;
    private Integer dataDaPublicacao = 0;
    private double valorDoLivro = 0d;
    private boolean entregamEmTodoBrasil = false;
    private LocalDate dataDoPedido = LocalDate.now();

    public Livro() {
    }

    public Livro(String nomeDoLivro,
                 String autorDoLivro,
                 String nomeDaEditora,
                 Integer quantDeFolhas,
                 Integer dataDaPublicacao,
                 double valorDoLivro,
                 boolean entregamEmTodoBrasil) {
        this.nomeDoLivro = nomeDoLivro;
        this.autorDoLivro = autorDoLivro;
        this.nomeDaEditora = nomeDaEditora;
        this.quantDeFolhas = quantDeFolhas;
        this.dataDaPublicacao = dataDaPublicacao;
        this.valorDoLivro = valorDoLivro;
        this.entregamEmTodoBrasil = entregamEmTodoBrasil;
    }

    public Livro(Livro livro) {// Variavel livro está representando a entidade Livro: lembra do scanner
        this.nomeDoLivro = livro.nomeDoLivro;
        this.autorDoLivro = livro.autorDoLivro;
        this.nomeDaEditora = livro.nomeDaEditora;
        this.quantDeFolhas = livro.quantDeFolhas;
        this.dataDaPublicacao = livro.dataDaPublicacao;
        this.valorDoLivro = livro.valorDoLivro;
        this.entregamEmTodoBrasil = livro.entregamEmTodoBrasil;
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getAutorDoLivro() {
        return autorDoLivro;
    }

    public void setAutorDoLivro(String autorDoLivro) {
        this.autorDoLivro = autorDoLivro;
    }

    public String getNomeDaEditora() {
        return nomeDaEditora;
    }

    public void setNomeDaEditora(String nomeDaEditora) {
        this.nomeDaEditora = nomeDaEditora;
    }

    public Integer getQuantDeFolhas() {
        return quantDeFolhas;
    }

    public void setQuantDeFolhas(Integer quantDeFolhas) {
        this.quantDeFolhas = quantDeFolhas;
    }

    public Integer getDataDaPublicacao() {
        return dataDaPublicacao;
    }

    public void setDataDaPublicacao(Integer dataDaPublicacao) {
        this.dataDaPublicacao = dataDaPublicacao;
    }

    public double getValorDoLivro() {
        return valorDoLivro;
    }

    public void setValorDoLivro(double valorDoLivro) {
        this.valorDoLivro = valorDoLivro;
    }

    public boolean isEntregamEmTodoBrasil() {
        return entregamEmTodoBrasil;
    }

    public void setEntregamEmTodoBrasil(boolean entregamEmTodoBrasil) {
        this.entregamEmTodoBrasil = entregamEmTodoBrasil;
    }

    public LocalDate getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(LocalDate dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }

    //METODO É IGUAL A AÇÃO,(EXECUÇÃO).

    public void CalcularValorTotalDaCompra(int quantLivros, double valorDoLivro) {
        System.out.println("O valor total da compra: R$" + quantLivros * valorDoLivro);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeDoLivro='" + nomeDoLivro + "\n"+ // pular a linha  "\n"
                ", autorDoLivro='" + autorDoLivro + "\n"+
                ", nomeDaEditora='" + nomeDaEditora + "\n"+
                ", quantDeFolhas=" + quantDeFolhas + "\n"+
                ", dataDaPublicacao=" + dataDaPublicacao + "\n"+
                ", valorDoLivro=" + valorDoLivro + "\n"+
                ", entregamEmTodoBrasil=" + entregamEmTodoBrasil + "\n"+
                ", dataDoPedido=" + dataDoPedido +
                '}';
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("jardim das aflições", "Olavo de carvalho",
                "Vide", 464, 1995, 100.0,
                true);// acima foi criada uma instância

        Livro livro2 = new Livro("um Dia Em Arraial", "os Loucos",
                "madame", 10000, 10,
                1101.0, true);

       Livro livro3 = new Livro("Praia Grande", "os Caras",
                "Belezinha", 1000, 5,
                222.0, false);

       Livro livro4 = new Livro(livro2);


        System.out.println("livro1: "+livro1);
        System.out.println("livro3: Nome do Livro"+livro3.getNomeDoLivro()+"Numero de Pag"+livro3.getQuantDeFolhas()+"Entrgam em todo o brasil"+livro3.isEntregamEmTodoBrasil());
        livro2.setValorDoLivro(10.0);
        System.out.println("Novo valor do Livro2: "+ livro2.getValorDoLivro());
        livro4.CalcularValorTotalDaCompra(10, livro4.valorDoLivro);


    }

}
