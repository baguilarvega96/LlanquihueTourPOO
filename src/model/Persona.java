package model;

// Clase base que representa a una persona vinculada a la agencia
public class Persona {

    private String nombre;
    private String rut;
    private String telefono;
    private Direccion direccion;

    public Persona() {
    }

    public Persona(String nombre, String rut, String telefono, Direccion direccion) {
        setNombre(nombre);
        setRut(rut);
        setTelefono(telefono);
        setDireccion(direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (rut == null || rut.trim().isEmpty()) {
            this.rut = "Sin RUT";
        } else {
            this.rut = rut;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            this.telefono = "Sin telefono";
        } else {
            this.telefono = telefono;
        }
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        if (direccion == null) {
            this.direccion = new Direccion("Sin ciudad", "Sin region");
        } else {
            this.direccion = direccion;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}