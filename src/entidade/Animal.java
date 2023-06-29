package entidade;

import java.time.LocalDate;

public class Animal {

    private String tipoDeAnimal = " ";
    private String nomeDoAnimal = " ";
    private Integer quantDePatas = 0;
    private double valorDoAnimal = 0d;
    private double alturaDoAnimal = 0d;
    private char sexo = 'M';
    private LocalDate dataDoPedido = LocalDate.now();

    public Animal() {
    }

    public Animal(String tipoDeAnimal,
                  String nomeDoAnimal,
                  Integer quantDePatas,
                  double valorDoAnimal,
                  double alturaDoAnimal,
                  char sexo) {

        this.tipoDeAnimal = tipoDeAnimal;
        this.nomeDoAnimal = nomeDoAnimal;
        this.quantDePatas = quantDePatas;
        this.valorDoAnimal = valorDoAnimal;
        this.alturaDoAnimal = alturaDoAnimal;
        this.sexo = sexo;
    }

    public Animal(Animal animal) {  // OBS: Variavel livro está representando a entidade Livro: lembre do scanner Pai e Filho
        this.tipoDeAnimal = animal.tipoDeAnimal;
        this.nomeDoAnimal = animal.nomeDoAnimal;
        this.quantDePatas = animal.quantDePatas;
        this.valorDoAnimal = animal.valorDoAnimal;
        this.alturaDoAnimal = animal.alturaDoAnimal;
        this.sexo = animal.sexo;

    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public Integer getQuantDePatas() {
        return quantDePatas;
    }

    public void setQuantDePatas(Integer quantDePatas) {
        this.quantDePatas = quantDePatas;
    }

    public double getValorDoAnimal() {
        return valorDoAnimal;
    }

    public void setValorDoAnimal(double valorDoAnimal) {
        this.valorDoAnimal = valorDoAnimal;
    }

    public double getAlturaDoAnimal() {
        return alturaDoAnimal;
    }

    public void setAlturaDoAnimal(double alturaDoAnimal) {
        this.alturaDoAnimal = alturaDoAnimal;
    }


    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataDoPedido() {
        return dataDoPedido;
    }

    public void setDataDoPedido(LocalDate dataDoPedido) {
        this.dataDoPedido = dataDoPedido;
    }
       //  METODOS  // INICIO
    public void correr(String nome) {
        System.out.println("Animal Correndo: "+nome);
    }
    public void comer(String nome) {
        System.out.println("Animal Comendo: "+nome);
    }
    public void dormir(String nome) {
        System.out.println("Animal Dormindo: "+nome);
    }
    public void trepar(String nome) {
        System.out.println("Animal Trepando: "+nome);
    }
    public void voar(String nome) {
        System.out.println("Animal Voando: "+nome);
    }    //  METODOS FINAL

    @Override
    public String toString() {
        return "Animal{" +
                "tipoDeAnimal = " + tipoDeAnimal + "\n" +
                ", nomeDoAnimal = " + nomeDoAnimal + "\n" +
                ", quantDePatas = " + quantDePatas + "\n" +
                ", valorDoAnimal = " + valorDoAnimal + "\n" +
                ", alturaDoAnimal = " + alturaDoAnimal + "\n" +
                ", sexo = " + sexo + "\n" +
                ", dataDoPedido = " + dataDoPedido +
                '}';
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Cachorro", "Rex", 4, 200.0, 25, 'M');
        System.out.println("Animal" + animal1);

        Animal animal2 = new Animal("Gato", "Shaft", 4, 101.0, 30, 'F');
        System.out.println("Animal" + animal2);


        System.out.println(animal1.getTipoDeAnimal());
        System.out.println(animal2.getTipoDeAnimal());

        animal1.setTipoDeAnimal("Cat");
        animal2.setTipoDeAnimal("Dog");

        System.out.println(animal1.getTipoDeAnimal());
        System.out.println(animal2.getTipoDeAnimal());

       animal1.setSexo('B');
       animal2.setSexo('2');

        System.out.println(animal1.getSexo());
        System.out.println(animal2.getSexo());

        Animal cachorro = new Animal("Alemão", "Bad", 4, 25.0, 20,'m');
        Animal peixe = new Animal("Peixe", "Japones", 0, 12.0, 3,'f');
        Animal ave = new Animal("Canário", "BILL", 2, 90.0, 10,'m');
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        cachorro.comer(cachorro.getNomeDoAnimal());
        ave.voar(ave.getNomeDoAnimal());
        peixe.trepar(peixe.getNomeDoAnimal());
    }





}