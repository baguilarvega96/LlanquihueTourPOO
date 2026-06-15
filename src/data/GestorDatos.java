package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Clase encargada de leer los datos desde el archivo tours.txt
public class GestorDatos {

    // Método que lee el archivo y retorna una lista de tours
    public ArrayList<Tour> leerTours(String rutaArchivo) {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            // Lee el archivo línea por línea
            while ((linea = br.readLine()) != null) {

                // Separa los datos usando punto y coma
                String[] datos = linea.split(";");

                if (datos.length == 3) {
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    // Crea un objeto Tour con los datos leídos
                    Tour tour = new Tour(nombre, tipo, precio);

                    // Agrega el objeto al ArrayList
                    listaTours.add(tour);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el precio: " + e.getMessage());
        }

        return listaTours;
    }
}