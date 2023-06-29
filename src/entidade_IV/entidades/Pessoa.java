package entidade_IV.entidades;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private String endereco;
    private String telefone;

    public Pessoa() {   //CONSTRUTOR SEM ARGUMENTO
    }

    public Pessoa(String nome,
                  LocalDate dataNascimento,
                  String endereco,
                  String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome = " + nome + "\n" +
                "dataNascimento = " + dataNascimento + "\n" +
                "endereco = " + endereco + "\n" +
                "telefone = " + telefone + "\n" +
                '}';
    }
}




