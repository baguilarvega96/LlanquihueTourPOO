package model;

// Subclase que representa un paseo lacustre
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre() {
    }

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Paseo lacustre: " + getNombre() +
                ", duracion: " + getDuracionHoras() + " horas" +
                ", tipo de embarcacion: " + tipoEmbarcacion);
    }
    @Override
    public String toString() {
        return "PaseoLacustre{" +
                "nombre='" + getNombre() + '\'' +
                ", duracionHoras=" + getDuracionHoras() +
                ", tipoEmbarcacion='" + tipoEmbarcacion + '\'' +
                '}';
    }
}