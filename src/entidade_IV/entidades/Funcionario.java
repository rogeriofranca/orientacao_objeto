package entidade_IV.entidades;

import entidade_IV.enums.Setor;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private Cargo cargo;
    private Enum<Setor> setor;
    private Integer matricula;
    private double salario;
    private boolean falaIngles;

    @Deprecated
    public Funcionario() {
    }

    public Funcionario(Cargo cargo,
                       Enum<Setor> setor,
                       Integer matricula,
                       double salario,
                       boolean falaIngles) {
        this.cargo = cargo;
        this.setor = setor;
        this.matricula = matricula;
        this.salario = salario;
        this.falaIngles = falaIngles;
    }

    public Funcionario(String nome,
                       LocalDate dataNascimento,
                       String endereco,
                       String telefone,
                       Cargo cargo,
                       Enum<Setor> setor,
                       Integer matricula,
                       double salario,
                       boolean falaIngles) {
        super(nome, dataNascimento, endereco, telefone);
        this.cargo = cargo;
        this.setor = setor;
        this.matricula = matricula;
        this.salario = salario;
        this.falaIngles = falaIngles;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Enum<Setor> getSetor() {
        return setor;
    }

    public void setSetor(Enum<Setor> setor) {
        this.setor = setor;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFalaIngles() {
        return falaIngles;
    }

    public void setFalaIngles(boolean falaIngles) {
        this.falaIngles = falaIngles;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "\n" +
                "cargo = " + cargo + "\n" +
                "setor = " + setor + "\n" +
                "matricula = " + matricula + "\n" +
                "salario = " + salario + "\n" +
                "falaIngles = " + falaIngles + "\n" +
                "} " + super.toString();
    }
}
