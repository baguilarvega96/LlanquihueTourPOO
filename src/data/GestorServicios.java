package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

// Clase encargada de crear servicios turísticos de prueba
public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Ruta de Sabores del Lago",
                4,
                5
        );

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Experiencia Gastronómica Frutillar",
                3,
                4
        );

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Paseo por Lago Llanquihue",
                2,
                "Lancha turística"
        );

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Navegación Puerto Varas",
                3,
                "Catamarán"
        );

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Tour Patrimonial Frutillar",
                3,
                "Teatro del Lago"
        );

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Recorrido Histórico Llanquihue",
                2,
                "Casas patrimoniales"
        );

        System.out.println("=== SERVICIOS TURISTICOS DISPONIBLES ===");

        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}