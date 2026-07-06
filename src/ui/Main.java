package ui;

import data.GestorServicios;
import model.ServicioTuristico;

import java.util.List;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        System.out.println("=== AGENCIA LLANQUIHUE TOUR ===");
        System.out.println("Aplicando polimorfismo y colecciones genericas\n");

        GestorServicios gestorServicios = new GestorServicios();

        // Se obtiene una lista de tipo ServicioTuristico
        // Esta lista contiene objetos de distintas subclases
        List<ServicioTuristico> servicios = gestorServicios.obtenerServicios();

        // Se recorre la coleccion aplicando polimorfismo
        gestorServicios.mostrarServicios(servicios);
    }
}