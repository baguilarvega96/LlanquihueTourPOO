package model;

public class Cliente extends Persona {
    private int numeroCliente;
    private String preferenciaTuristica;

    public Cliente(String nombre, String rut, String telefono, Direccion direccion,
                   int numeroCliente, String preferenciaTuristica) {
        super(nombre, rut, telefono, direccion);
        this.numeroCliente = numeroCliente;
        this.preferenciaTuristica = preferenciaTuristica;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getPreferenciaTuristica() {
        return preferenciaTuristica;
    }

    public void setPreferenciaTuristica(String preferenciaTuristica) {
        this.preferenciaTuristica = preferenciaTuristica;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                super.toString() +
                ", Número Cliente: " + numeroCliente +
                ", Preferencia Turística: " + preferenciaTuristica +
                "}";
    }
}
