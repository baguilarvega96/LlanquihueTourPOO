package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Ruta del archivo que contiene los datos
        String rutaArchivo = "resources/tours.txt";

        // Se crea el gestor de datos
        GestorDatos gestorDatos = new GestorDatos();

        // Se leen los tours desde el archivo y se guardan en un ArrayList
        ArrayList<Tour> tours = gestorDatos.leerTours(rutaArchivo);

        // Recorrido: mostrar todos los tours
        System.out.println("=== LISTA COMPLETA DE TOURS ===");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        // Filtrado: mostrar solo los tours de tipo gastronomico
        System.out.println("\n=== TOURS DE TIPO GASTRONOMICO ===");

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("gastronomico")) {
                System.out.println(tour);
            }
        }
    }
}