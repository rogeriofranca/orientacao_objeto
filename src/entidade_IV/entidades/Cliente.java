package entidade_IV.entidades;

import entidade_IV.enums.TipoConta;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private Enum<TipoConta>tipoConta;
    private String numeroConta;
    private String codigoAgencia;

    public Cliente() {
    }

    public Cliente(Enum<TipoConta> tipoConta, String numeroConta, String codigoAgencia) {
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.codigoAgencia = codigoAgencia;
    }

    public Cliente(String nome,
                   LocalDate dataNascimento,
                   String endereco,
                   String telefone,
                   Enum<TipoConta> tipoConta,
                   String numeroConta,
                   String codigoAgencia) {
        super(nome, dataNascimento, endereco, telefone);
        this.tipoConta = tipoConta;
        this.numeroConta = numeroConta;
        this.codigoAgencia = codigoAgencia;
    }

    public Enum<TipoConta> getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(Enum<TipoConta> tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(String codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    @Override
    public String toString() {
        return "Cliente{" + "\n" +
                "tipoConta = " + tipoConta + "\n" +
                "numeroConta = " + numeroConta + "\n" +
                "codigoAgencia = " + codigoAgencia + "\n" +
                "} " + super.toString();
    }
}
