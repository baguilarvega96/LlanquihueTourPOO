package model;

public class GuiaTuristico extends Persona {
    private String especialidad;
    private int aniosExperiencia;

    public GuiaTuristico(String nombre, String rut, String telefono, Direccion direccion,
                         String especialidad, int aniosExperiencia) {
        super(nombre, rut, telefono, direccion);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Guía Turístico {" +
                super.toString() +
                ", Especialidad: " + especialidad +
                ", Años de Experiencia: " + aniosExperiencia +
                "}";
    }
}
