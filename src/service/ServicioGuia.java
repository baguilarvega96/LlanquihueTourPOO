package service;

import model.GuiaTuristico;

import java.util.ArrayList;

// Clase que contiene operaciones de búsqueda y filtrado para guías turísticos
public class ServicioGuia {

    // Muestra todos los guías turísticos registrados
    public void mostrarGuias(ArrayList<GuiaTuristico> guias) {
        System.out.println("=== LISTA COMPLETA DE GUIAS TURISTICOS ===");

        for (GuiaTuristico guia : guias) {
            System.out.println(guia);
        }
    }

    // Filtra guías por especialidad
    public void filtrarPorEspecialidad(ArrayList<GuiaTuristico> guias, String especialidad) {
        System.out.println("\n=== GUIAS CON ESPECIALIDAD: " + especialidad.toUpperCase() + " ===");

        for (GuiaTuristico guia : guias) {
            if (guia.getEspecialidad().equalsIgnoreCase(especialidad)) {
                System.out.println(guia);
            }
        }
    }

    // Filtra guías según años mínimos de experiencia
    public void filtrarPorExperiencia(ArrayList<GuiaTuristico> guias, int aniosMinimos) {
        System.out.println("\n=== GUIAS CON " + aniosMinimos + " O MAS ANIOS DE EXPERIENCIA ===");

        for (GuiaTuristico guia : guias) {
            if (guia.getAniosExperiencia() >= aniosMinimos) {
                System.out.println(guia);
            }
        }
    }
}
