package data;

import model.Direccion;
import model.GuiaTuristico;
import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Clase encargada de leer datos desde archivos externos
public class GestorDatos {

    // Método que lee el archivo tours.txt y retorna una lista de tours
    public ArrayList<Tour> leerTours(String rutaArchivo) {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 3) {
                    String nombre = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    Tour tour = new Tour(nombre, tipo, precio);
                    listaTours.add(tour);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo de tours: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el precio del tour: " + e.getMessage());
        }

        return listaTours;
    }

    // Método que lee el archivo guias.txt y retorna una lista de guías turísticos
    public ArrayList<GuiaTuristico> leerGuias(String rutaArchivo) {

        ArrayList<GuiaTuristico> listaGuias = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 7) {
                    String nombre = datos[0];
                    String rut = datos[1];
                    String telefono = datos[2];
                    String ciudad = datos[3];
                    String region = datos[4];
                    String especialidad = datos[5];
                    int aniosExperiencia = Integer.parseInt(datos[6]);

                    Direccion direccion = new Direccion(ciudad, region);

                    GuiaTuristico guia = new GuiaTuristico(
                            nombre,
                            rut,
                            telefono,
                            direccion,
                            especialidad,
                            aniosExperiencia
                    );

                    listaGuias.add(guia);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo de guías: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir los años de experiencia: " + e.getMessage());
        }

        return listaGuias;
    }
}