package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;
import java.util.List;

// Clase encargada de almacenar y gestionar las entidades de la agencia
public class GestorEntidades {

    private final ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    // Agrega una entidad a la colección
    public void agregarEntidad(Registrable entidad) {

        if (entidad != null) {
            entidades.add(entidad);
        }
    }

    // Retorna una copia de las entidades registradas
    public List<Registrable> getEntidades() {

        return new ArrayList<>(entidades);
    }

    // Recorre la colección y diferencia los objetos utilizando instanceof
    public String obtenerResumenEntidades() {

        if (entidades.isEmpty()) {
            return "No existen entidades registradas.";
        }

        StringBuilder resumen = new StringBuilder();

        resumen.append("=== ENTIDADES REGISTRADAS ===\n\n");

        for (Registrable entidad : entidades) {

            if (entidad instanceof GuiaTuristico) {

                GuiaTuristico guia = (GuiaTuristico) entidad;

                resumen.append("Tipo detectado: Guía turístico\n");
                resumen.append("Especialidad: ")
                        .append(guia.getEspecialidad())
                        .append("\n");

            } else if (entidad instanceof Vehiculo) {

                Vehiculo vehiculo = (Vehiculo) entidad;

                resumen.append("Tipo detectado: Vehículo\n");
                resumen.append("Capacidad: ")
                        .append(vehiculo.getCapacidadPasajeros())
                        .append(" pasajeros\n");

            } else if (entidad instanceof ColaboradorExterno) {

                ColaboradorExterno colaborador =
                        (ColaboradorExterno) entidad;

                resumen.append("Tipo detectado: Colaborador externo\n");
                resumen.append("Empresa: ")
                        .append(colaborador.getEmpresa())
                        .append("\n");
            }

            resumen.append(entidad.mostrarResumen());
            resumen.append("\n\n");
        }

        return resumen.toString();
    }

    // Retorna la cantidad total de entidades
    public int obtenerCantidadEntidades() {

        return entidades.size();
    }
}