package model;

// Subclase que representa una excursión cultural
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural() {
    }

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Excursion cultural: " + getNombre() +
                ", duracion: " + getDuracionHoras() + " horas" +
                ", lugar historico: " + lugarHistorico);
    }
    @Override
    public String toString() {
        return "ExcursionCultural{" +
                "nombre='" + getNombre() + '\'' +
                ", duracionHoras=" + getDuracionHoras() +
                ", lugarHistorico='" + lugarHistorico + '\'' +
                '}';
    }
}