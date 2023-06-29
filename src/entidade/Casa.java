package entidade;

import java.time.LocalDate;
public class Casa {
    private Integer quantPortas = 1; // valores inteiros
    private Integer quantJanelas = 1;
    private Integer quantComodos = 1;
    private String corDaParedeExterna = ""; // textos
    private Double valorDaCasa = 0d; // valor casas decimais
    private boolean temVaranda = false; // falsssssssso ou veerrrdadeiiroo
    private LocalDate dataDeCadastro = LocalDate.now(); // informa a data da criação

    public Casa() {
    }

    public Casa(Integer quantPortas,
                Integer quantJanelas,
                Integer quantComodos,
                String corDaParedeExterna,
                Double valorDaCasa,
                boolean temVaranda)

    {
        this.quantPortas = quantPortas;
        this.quantJanelas = quantJanelas;
        this.quantComodos = quantComodos;
        this.corDaParedeExterna = corDaParedeExterna;
        this.valorDaCasa = valorDaCasa;
        this.temVaranda = temVaranda;
    }

    public Casa(Casa entidade) {
        this.quantPortas = entidade.getQuantPortas();
        this.quantJanelas = entidade.getQuantJanelas();
        this.quantComodos = entidade.getQuantComodos();
        this.corDaParedeExterna = entidade.getCorDaParedeExterna();
        this.valorDaCasa = entidade.getValorDaCasa();
        this.temVaranda = entidade.isTemVaranda();
        this.dataDeCadastro = entidade.getDataDeCadastro();
    }

    public Integer getQuantPortas() {
        return quantPortas;
    }

    public Integer getQuantJanelas() {
        return quantJanelas;
    }

    public Integer getQuantComodos() {
        return quantComodos;
    }

    public String getCorDaParedeExterna() {
        return corDaParedeExterna;
    }

    public Double getValorDaCasa() {
        return valorDaCasa;
    }

    public boolean isTemVaranda() {
        return temVaranda;
    }

    public LocalDate getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setQuantPortas(Integer quantPortas) {
        this.quantPortas = quantPortas;
    }

    public void setQuantJanelas(Integer quantJanelas) {
        this.quantJanelas = quantJanelas;
    }

    public void setQuantComodos(Integer quantComodos) {
        this.quantComodos = quantComodos;
    }

    public void setCorDaParedeExterna(String corDaParedeExterna) {
        this.corDaParedeExterna = corDaParedeExterna;
    }

    public void setValorDaCasa(Double valorDaCasa) {
        this.valorDaCasa = valorDaCasa;
    }

    public void setTemVaranda(boolean temVaranda) {
        this.temVaranda = temVaranda;
    }

    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public static void main(String[] args) {
        Casa casaDoRogerio = new Casa(2, 4, 12, "marfim", 100000.0, true);
        System.out.println(" casaDoRogerio " +casaDoRogerio );

        int portas = casaDoRogerio.getQuantPortas();
        System.out.println(portas);

        casaDoRogerio.setQuantPortas(4);
        System.out.println(casaDoRogerio.getQuantPortas());

        Casa casaDoJean = new Casa( 3, 4, 6, "azul", 101010101.0, false);
        System.out.println(" Casa do Jean " +casaDoJean );

        Casa casa2 = new Casa(casaDoRogerio);
        System.out.println(" casa2 "+casa2);

        Casa casa3 = new Casa(casa2);
        System.out.println(" casa3 "+casa2);
    }

    @Override
    public String toString() { // ALT INSERT
        return "Casa{" +
                "quantPortas=" + quantPortas +
                ", quantJanelas=" + quantJanelas +
                ", quantComodos=" + quantComodos +
                ", corDaParedeExterna='" + corDaParedeExterna + '\'' +
                ", valorDaCasa=" + valorDaCasa +
                ", temVaranda=" + temVaranda +
                '}';
    }
}
