package ui;

import data.GestorServicios;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        System.out.println("=== AGENCIA LLANQUIHUE TOUR ===");
        System.out.println("Demostracion de jerarquia de clases con herencia simple\n");

        GestorServicios gestorServicios = new GestorServicios();

        gestorServicios.mostrarServicios();
    }
}