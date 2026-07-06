package model;

// Superclase que representa un servicio turistico general
public class ServicioTuristico {

    private String nombre;
    private int duracionHoras;

    public ServicioTuristico() {
    }

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    // Metodo base que sera sobrescrito por las subclases
    public void mostrarInformacion() {
        System.out.println("Servicio turistico: " + nombre +
                ", duracion: " + duracionHoras + " horas");
    }

    @Override
    public String toString() {
        return "ServicioTuristico{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                '}';
    }
}