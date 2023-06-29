package entidade_II;

import java.util.List;

public class Agenda {
    private List<Contato> contatos;
    private String cor_Agenda;
    private Integer quant_Pagina_Agenda;
    private boolean capa_Dura;

    public Agenda() {
    }

    public Agenda(List<Contato> contatos,
                  String cor_Agenda,
                  Integer quant_Pagina_Agenda,
                  boolean capa_Dura) {
        this.contatos = contatos;
        this.cor_Agenda = cor_Agenda;
        this.quant_Pagina_Agenda = quant_Pagina_Agenda;
        this.capa_Dura = capa_Dura;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public String getCor_Agenda() {
        return cor_Agenda;
    }

    public void setCor_Agenda(String cor_Agenda) {
        this.cor_Agenda = cor_Agenda;
    }

    public Integer getQuant_Pagina_Agenda() {
        return quant_Pagina_Agenda;
    }

    public void setQuant_Pagina_Agenda(Integer quant_Pagina_Agenda) {
        this.quant_Pagina_Agenda = quant_Pagina_Agenda;
    }

    public boolean isCapa_Dura() {
        return capa_Dura;
    }

    public void setCapa_Dura(boolean capa_Dura) {
        this.capa_Dura = capa_Dura;
    }

    @Override
    public String toString() {
        return "Agenda{" + "\n" +
                "contatos = " + contatos + "\n" +    //  + "\n"+ (PULAR LINHA).
                "cor_Agenda = " + cor_Agenda + "\n" +
                "quant_Pagina_Agenda = " + quant_Pagina_Agenda + "\n" +
                "capa_Dura = " + capa_Dura +
                '}';
    }
}
