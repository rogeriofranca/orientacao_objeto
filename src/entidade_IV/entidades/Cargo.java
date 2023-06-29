package entidade_IV.entidades;

import java.util.UUID;

public class Cargo {
    private UUID idCargo = UUID.randomUUID();
    private String nome;

    public Cargo() {
    }

    public Cargo(String nome) {
        this.nome = nome;
    }

    public UUID getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(UUID idCargo) {
        this.idCargo = idCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cargo{" + "\n" +
                "idCargo = " + idCargo + "\n" +
                "nome = " + nome + "\n" +
                '}';
    }
}
