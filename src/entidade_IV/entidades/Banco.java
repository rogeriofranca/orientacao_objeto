package entidade_IV.entidades;

import java.util.List;

public class Banco {
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private String nome;
    private String url;
    private String codBanco;
    private boolean multinacional;

    @Deprecated
    public Banco() {
    }

    public Banco(List<Funcionario> funcionarios,
                 List<Cliente> clientes,
                 String nome,
                 String url,
                 String codBanco,
                 boolean multinacional) {
        this.funcionarios = funcionarios;
        this.clientes = clientes;
        this.nome = nome;
        this.url = url;
        this.codBanco = codBanco;
        this.multinacional = multinacional;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(String codBanco) {
        this.codBanco = codBanco;
    }

    public boolean isMultinacional() {
        return multinacional;
    }

    public void setMultinacional(boolean multinacional) {
        this.multinacional = multinacional;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "funcionarios = " + funcionarios +"\n"+
                " clientes = " + clientes +"\n"+
                " nome = " + nome +"\n"+
                " url = " + url +"\n"+
                " codBanco = " + codBanco +"\n"+
                " multinacional = " + multinacional +"\n"+
                '}';
    }
}






