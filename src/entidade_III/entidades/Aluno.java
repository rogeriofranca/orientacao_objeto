package entidade_IV.entidades;

import entidade_III.entidades.Pessoa;
import entidade_III.enums.Turma;

public class Aluno extends Pessoa {

    private Enum<Turma> nomeTurma = Turma.TURMA_A;
    private String serie;

    public Aluno(Enum<Turma> nomeTurma, String serie) {
        this.nomeTurma = nomeTurma;
        this.serie = serie;
    }

    public Aluno(String nome, Integer matricula, Enum<Turma> nomeTurma, String serie) {
        super(nome, matricula);
        this.nomeTurma = nomeTurma;
        this.serie = serie;
    }

    public Enum<Turma> getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(Enum<Turma> nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Aluno{" +"\n"+
                "nomeTurma = " + nomeTurma +"\n"+
                ", serie = " + serie + "\n" +
                "} " + super.toString();
    }
}

