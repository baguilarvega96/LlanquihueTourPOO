package model;

// Clase que representa a un guia turistico de la agencia
public class GuiaTuristico extends Persona {

    private String especialidad;
    private int aniosExperiencia;

    public GuiaTuristico() {
    }

    public GuiaTuristico(String nombre, String rut, String telefono, Direccion direccion,
                         String especialidad, int aniosExperiencia) {
        super(nombre, rut, telefono, direccion);
        setEspecialidad(especialidad);
        setAniosExperiencia(aniosExperiencia);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.trim().isEmpty()) {
            this.especialidad = "Sin especialidad";
        } else {
            this.especialidad = especialidad;
        }
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        if (aniosExperiencia < 0) {
            this.aniosExperiencia = 0;
        } else {
            this.aniosExperiencia = aniosExperiencia;
        }
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" +
                "nombre='" + getNombre() + '\'' +
                ", rut='" + getRut() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", direccion=" + getDireccion() +
                ", especialidad='" + especialidad + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                '}';
    }
}