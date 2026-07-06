package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

// Clase encargada de gestionar servicios turísticos
public class GestorServicios {

    // Metodo que crea una coleccion polimorfica de servicios turisticos
    public List<ServicioTuristico> obtenerServicios() {

        List<ServicioTuristico> servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                "Ruta de Sabores del Lago",
                4,
                5
        ));

        servicios.add(new RutaGastronomica(
                "Experiencia Gastronomica Frutillar",
                3,
                4
        ));

        servicios.add(new PaseoLacustre(
                "Paseo por Lago Llanquihue",
                2,
                "Lancha turistica"
        ));

        servicios.add(new PaseoLacustre(
                "Navegacion Puerto Varas",
                3,
                "Catamaran"
        ));

        servicios.add(new ExcursionCultural(
                "Tour Patrimonial Frutillar",
                3,
                "Teatro del Lago"
        ));

        servicios.add(new ExcursionCultural(
                "Recorrido Historico Llanquihue",
                2,
                "Casas patrimoniales"
        ));

        return servicios;
    }

    // Metodo que recorre la coleccion aplicando polimorfismo
    public void mostrarServicios(List<ServicioTuristico> servicios) {

        System.out.println("=== SERVICIOS TURISTICOS DISPONIBLES ===");

        for (ServicioTuristico servicio : servicios) {
            servicio.mostrarInformacion();
        }
    }
}