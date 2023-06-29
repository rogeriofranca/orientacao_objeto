package entidade;

import java.time.LocalDate;

public class Carro {
    //Atributos = private int nome;
    //Construtor = public nome da classe (){} alt + insert
    //Construtor com argumentos
    //getts e settes
    //toString
    //Instanciar, criar um filho, o objeto na classe main
    //imprimir o objeto inteiro, um atributo gett, mudar o valor de um atributo sett

    private Integer quantDePortas = 0;
    private Integer quantDeAcentos = 0;
    private String corDoCarro = " ";
    private String fabricanteDoCarro = " ";
    private double valorDoCarro = 0d;// zero(valor) d  (double).
    private boolean temGnv = false; // normalmente começa com false
    private LocalDate dataDoContrato = LocalDate.now();

    public Carro() {
    }

    public Carro(Integer quantDePortas,
                 Integer quantDeAcentos,
                 String corDoCarro,
                 String fabricanteDoCarro,
                 double valorDoCarro,
                 boolean temGnv) {
        this.quantDePortas = quantDePortas;
        this.quantDeAcentos = quantDeAcentos;
        this.corDoCarro = corDoCarro;
        this.fabricanteDoCarro = fabricanteDoCarro;
        this.valorDoCarro = valorDoCarro;
        this.temGnv = temGnv;
    }

    public Carro(Carro entidade) {
        this.quantDePortas = entidade.getQuantDePortas();
        this.quantDeAcentos = entidade.getQuantDeAcentos();
        this.corDoCarro = entidade.getCorDoCarro();
        this.fabricanteDoCarro = entidade.getFabricanteDoCarro();
        this.valorDoCarro = entidade.getValorDoCarro();
        this.temGnv = entidade.isTemGnv();
    }

    public Integer getQuantDePortas() {
        return quantDePortas;
    }

    public void setQuantDePortas(Integer quantDePortas) {
        this.quantDePortas = quantDePortas;
    }

    public Integer getQuantDeAcentos() {
        return quantDeAcentos;
    }

    public void setQuantDeAcentos(Integer quantDeAcentos) {
        this.quantDeAcentos = quantDeAcentos;
    }

    public String getCorDoCarro() {
        return corDoCarro;
    }

    public void setCorDoCarro(String corDoCarro) {
        this.corDoCarro = corDoCarro;
    }

    public String getFabricanteDoCarro() {
        return fabricanteDoCarro;
    }

    public void setFabricanteDoCarro(String fabricanteDoCarro) {
        this.fabricanteDoCarro = fabricanteDoCarro;
    }

    public double getValorDoCarro() {
        return valorDoCarro;
    }

    public void setValorDoCarro(double valorDoCarro) {
        this.valorDoCarro = valorDoCarro;
    }

    public boolean isTemGnv() {
        return temGnv;
    }

    public void setTemGnv(boolean temGnv) {
        this.temGnv = temGnv;
    }

    public LocalDate getDataDoContrato() {
        return dataDoContrato;
    }

    public void setDataDoContrato(LocalDate dataDoContrato) {
        this.dataDoContrato = dataDoContrato;
    }
// METODOS: LIGAR, DESLIGAR, ACELERAR, FREIAR, ESTACIONADO,

    public void ligarCarro() {
        System.out.println("Carro Ligado: ");
    }
    public void desligarCarro() {
        System.out.println("Carro Desligado ");
    }
    public void acelerarCarro() {

        System.out.println("Acelerar o Carro ");
    }
    public void freiarCarro() {
        System.out.println("Freiar o Carro ");
    }
    public void carroEstacionado() {
        System.out.println("Carro Estacionado ");
    }

















    public static void main(String[] args) {
        /*Carro meuCarro = new Carro(5, 7, "branca", "fiat", 45000.0, true);
        System.out.println(" meuCarro "+ meuCarro.toString() );

        meuCarro.setCorDoCarro("Preta");
        meuCarro.setValorDoCarro(100000.0);
        meuCarro.setQuantDeAcentos(4);

        int portas = meuCarro.getQuantDePortas();
        String fabricante = meuCarro.getFabricanteDoCarro();
        boolean gnv = meuCarro.isTemGnv();
        System.out.println("Número de portas: "+portas+", Fabricante: "+fabricante+", Possui Gnv: "+gnv);
        System.out.println("Número de acentos: "+meuCarro.getQuantDeAcentos()+", Valor do carro: "+meuCarro.getValorDoCarro()+", Cor do carro : "+meuCarro.getCorDoCarro());

        //
       Carro meuCarro2 = new Carro(meuCarro);
       */
       Carro golJean = new Carro(3, 5, "azul", "Wolks", 1000.0, false);
       golJean.carroEstacionado();
       golJean.ligarCarro();
       golJean.acelerarCarro();
       golJean.freiarCarro();
       golJean.carroEstacionado();
    }


    @Override
    public String toString() {
        return "Carro{" +
                "quantDePortas=" + quantDePortas + "\n"+ // "\n" PULA A LINHA
                ", quantDeAcentos=" + quantDeAcentos + "\n"+
                ", corDoCarro='" + corDoCarro + '\'' + "\n"+
                ", fabricanteDoCarro='" + fabricanteDoCarro + '\'' + "\n"+
                ", valorDoCarro=" + valorDoCarro + "\n"+
                ", temGnv=" + temGnv + "\n"+
                ", dataDoContrato=" + dataDoContrato + "\n"+
                '}';
    }
}