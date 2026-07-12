package model;

// Clase que representa un vehiculo utilizado por la agencia
public class Vehiculo implements Registrable {

    private String patente;
    private String marca;
    private String modelo;
    private int capacidadPasajeros;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo,
                    int capacidadPasajeros) {
        setPatente(patente);
        setMarca(marca);
        setModelo(modelo);
        setCapacidadPasajeros(capacidadPasajeros);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            this.patente = "Sin patente";
        } else {
            this.patente = patente;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            this.marca = "Sin marca";
        } else {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            this.modelo = "Sin modelo";
        } else {
            this.modelo = modelo;
        }
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        if (capacidadPasajeros < 1) {
            this.capacidadPasajeros = 1;
        } else {
            this.capacidadPasajeros = capacidadPasajeros;
        }
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo: " + marca + " " + modelo
                + " | Patente: " + patente
                + " | Capacidad: " + capacidadPasajeros + " pasajeros";
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                '}';
    }
}