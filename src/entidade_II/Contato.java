package entidade_II;
public class Contato {
   private String nome_Contato;
   private String telefone_Contato;
   private String endereco_Contato;
   private String email_Contato;
   private String descricao_Contato;
   public Contato(){
   }

   public Contato(String nome_Contato,
                  String telefone_Contato,
                  String endereco_Contato,
                  String email_Contato,
                  String descricao_Contato) {
       this.nome_Contato = nome_Contato;
       this.telefone_Contato = telefone_Contato;
       this.endereco_Contato = endereco_Contato;
       this.email_Contato = email_Contato;
       this.descricao_Contato = descricao_Contato;
   }

    public String getNome_Contato() {
        return nome_Contato;
    }

    public void setNome_Contato(String nome_Contato) {
        this.nome_Contato = nome_Contato;
    }

    public String getTelefone_Contato() {
        return telefone_Contato;
    }

    public void setTelefone_Contato(String telefone_Contato) {
        this.telefone_Contato = telefone_Contato;
    }

    public String getEndereco_Contato() {
        return endereco_Contato;
    }

    public void setEndereco_Contato(String endereco_Contato) {
        this.endereco_Contato = endereco_Contato;
    }

    public String getEmail_Contato() { return email_Contato;
    }

    public void setEmail_Contato(String email_Contato) {
        this.email_Contato = email_Contato;
    }

    public String getDescricao_Contato() {
        return descricao_Contato;
    }

    public void setDescricao_Contato(String descricao_Contato) {
        this.descricao_Contato = descricao_Contato;
    }

    @Override
    public String toString() {                     //  + "\n"+ (PULAR LINHA).
        return "Contato {" + "\n"+
                " nome_Contato = " + nome_Contato + "\n"+
                " telefone_Contato = " + telefone_Contato + "\n" +
                " endereco_Contato = " + endereco_Contato + "\n" +
                " email_Contato = " + email_Contato + "\n" +
                " descricao_Contato = " + descricao_Contato + "\n" +
                '}';
    }
}




