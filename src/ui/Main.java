package ui;

import data.GestorDatos;
import model.GuiaTuristico;
import model.Tour;
import service.ServicioGuia;

import java.util.ArrayList;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Rutas de los archivos
        String rutaTours = "resources/tours.txt";
        String rutaGuias = "resources/guias.txt";

        // Se crea el gestor de datos
        GestorDatos gestorDatos = new GestorDatos();

        // Se cargan los datos desde los archivos a colecciones ArrayList
        ArrayList<Tour> tours = gestorDatos.leerTours(rutaTours);
        ArrayList<GuiaTuristico> guias = gestorDatos.leerGuias(rutaGuias);

        // Mostrar todos los tours
        System.out.println("=== LISTA COMPLETA DE TOURS ===");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        // Filtrar tours de tipo gastronomico
        System.out.println("\n=== TOURS DE TIPO GASTRONOMICO ===");

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("gastronomico")) {
                System.out.println(tour);
            }
        }

        // Se crea el servicio para trabajar con guías turísticos
        ServicioGuia servicioGuia = new ServicioGuia();

        // Mostrar todos los guías
        servicioGuia.mostrarGuias(guias);

        // Buscar guías por especialidad
        servicioGuia.filtrarPorEspecialidad(guias, "gastronomico");

        // Buscar guías con 5 o más años de experiencia
        servicioGuia.filtrarPorExperiencia(guias, 5);
    }
}