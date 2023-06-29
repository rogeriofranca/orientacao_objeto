package entidade_III.entidades;

public class Funcionario extends Pessoa {
    private String funcao;
    private double salario;
    private int cargaHoraria;
    private boolean temDependentes;

    @Deprecated
    public Funcionario() {
    }

    public Funcionario(String funcao, double salario, int cargaHoraria, boolean temDependentes) {
        this.funcao = funcao;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.temDependentes = temDependentes;
    }

    public Funcionario(String nome, Integer matricula, String funcao, double salario, int cargaHoraria, boolean temDependentes) {
        super(nome, matricula);
        this.funcao = funcao;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.temDependentes = temDependentes;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isTemDependentes() {
        return temDependentes;
    }

    public void setTemDependentes(boolean temDependentes) {
        this.temDependentes = temDependentes;
    }

    @Override
    public String toString() {
        return "Funcionario{" +"\n"+
                "funcao='" + funcao +"\n"+
                ", salario=" + salario +"\n"+
                ", cargaHoraria=" + cargaHoraria +"\n"+
                ", temDependentes=" + temDependentes +"\n"+
                "} " + super.toString();
    }
}

