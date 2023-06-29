package entidade_III.entidades;

import entidade_IV.entidades.Aluno;

import java.util.List;

public class Escola {
    private List<Funcionario>funcionarios;
    private List<Aluno>alunos;
    private String nome;
    private Integer inep;
    private Integer qtdSalas;
    private String endereco;
    private double receitaMes;
    private boolean temQuadra;
    @Deprecated
    public Escola() {
    }

    public Escola(List<Funcionario> funcionarios,
                  List<Aluno> alunos,
                  String nome,
                  Integer inep,
                  Integer qtdSalas,
                  String endereco,
                  double receitaMes,
                  boolean temQuadra) {
        this.funcionarios = funcionarios;
        this.alunos = alunos;
        this.nome = nome;
        this.inep = inep;
        this.qtdSalas = qtdSalas;
        this.endereco = endereco;
        this.receitaMes = receitaMes;
        this.temQuadra = temQuadra;

    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getInep() {
        return inep;
    }

    public void setInep(Integer inep) {
        this.inep = inep;
    }

    public Integer getQtdSalas() {
        return qtdSalas;
    }

    public void setQtdSalas(Integer qtdSalas) {
        this.qtdSalas = qtdSalas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getReceitaMes() {
        return receitaMes;
    }

    public void setReceitaMes(double receitaMes) {
        this.receitaMes = receitaMes;
    }

    public boolean isTemQuadra() {
        return temQuadra;
    }

    public void setTemQuadra(boolean temQuadra) {
        this.temQuadra = temQuadra;
    }

    @Override
    public String toString() {
        return "entidade_III.Escola{" +"\n"+
                "funcionarios = " + funcionarios + "\n"+
                " alunos = " + alunos + "\n"+
                " nome = " + nome + "\n" +
                " inep = " + inep + "\n" +
                " qtdSalas = " + qtdSalas + "\n"+
                " endereco = " + endereco + "\n"+
                " receitaMes = " + receitaMes + "\n"+
                " temQuadra = " + temQuadra +
                '}';
    }
}
