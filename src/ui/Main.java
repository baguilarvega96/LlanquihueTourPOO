package ui;

import data.GestorDatos;
import data.GestorEntidades;
import data.GestorServicios;
import exception.RutInvalidoException;
import model.ColaboradorExterno;
import model.Direccion;
import model.GuiaTuristico;
import model.Tour;
import model.Vehiculo;
import utils.ValidadorRut;

import javax.swing.JOptionPane;
import java.util.ArrayList;

// Clase principal del programa
public class Main {

    public static void main(String[] args) {

        // Demostración de polimorfismo con servicios turísticos
        mostrarServiciosTuristicos();

        // Crea el gestor de entidades
        GestorEntidades gestorEntidades =
                new GestorEntidades();

        // Crea el lector de archivos externos
        GestorDatos gestorDatos =
                new GestorDatos();

        // Carga los datos desde archivos .txt
        ArrayList<GuiaTuristico> guias =
                gestorDatos.leerGuias(
                        "resources/guias.txt"
                );

        ArrayList<Tour> tours =
                gestorDatos.leerTours(
                        "resources/tours.txt"
                );

        // Agrega los guías a la colección polimórfica
        for (GuiaTuristico guia : guias) {

            gestorEntidades.agregarEntidad(
                    guia
            );
        }

        // Inicia la interfaz gráfica
        iniciarMenu(
                gestorEntidades,
                guias,
                tours
        );
    }

    // Muestra servicios mediante polimorfismo
    private static void mostrarServiciosTuristicos() {

        System.out.println(
                "=== AGENCIA LLANQUIHUE TOUR ==="
        );

        System.out.println(
                "Aplicando polimorfismo y colecciones genéricas\n"
        );

        GestorServicios gestorServicios =
                new GestorServicios();

        gestorServicios.mostrarServicios(
                gestorServicios.obtenerServicios()
        );
    }

    // Menú principal de la aplicación
    private static void iniciarMenu(
            GestorEntidades gestorEntidades,
            ArrayList<GuiaTuristico> guias,
            ArrayList<Tour> tours) {

        int opcion;

        do {

            String menu = """
                    === LLANQUIHUE TOUR ===

                    1. Registrar guía turístico
                    2. Registrar vehículo
                    3. Registrar colaborador externo
                    4. Mostrar todas las entidades
                    5. Mostrar guías cargados desde archivo
                    6. Mostrar tours cargados desde archivo
                    7. Buscar guía por RUT
                    8. Filtrar guías por especialidad
                    0. Salir

                    Ingrese una opción:
                    """;

            String entrada =
                    JOptionPane.showInputDialog(
                            null,
                            menu,
                            "Sistema Llanquihue Tour",
                            JOptionPane.QUESTION_MESSAGE
                    );

            if (entrada == null) {

                opcion = 0;

            } else {

                try {

                    opcion = Integer.parseInt(
                            entrada.trim()
                    );

                } catch (NumberFormatException error) {

                    opcion = -1;
                }
            }

            switch (opcion) {

                case 1:

                    registrarGuia(
                            gestorEntidades,
                            guias
                    );

                    break;

                case 2:

                    registrarVehiculo(
                            gestorEntidades
                    );

                    break;

                case 3:

                    registrarColaborador(
                            gestorEntidades
                    );

                    break;

                case 4:

                    mostrarEntidades(
                            gestorEntidades
                    );

                    break;

                case 5:

                    mostrarGuias(
                            guias
                    );

                    break;

                case 6:

                    mostrarTours(
                            tours
                    );

                    break;

                case 7:

                    buscarGuiaPorRut(
                            guias
                    );

                    break;

                case 8:

                    filtrarGuiasPorEspecialidad(
                            guias
                    );

                    break;

                case 0:

                    JOptionPane.showMessageDialog(
                            null,
                            "Programa finalizado."
                    );

                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Ingrese una opción válida.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
            }

        } while (opcion != 0);
    }

    // Registra un nuevo guía turístico
    private static void registrarGuia(
            GestorEntidades gestorEntidades,
            ArrayList<GuiaTuristico> guias) {

        String nombre = pedirTexto(
                "Ingrese el nombre del guía:"
        );

        if (nombre == null) {
            return;
        }

        String rut = pedirRut(
                "Ingrese el RUT del guía:"
        );

        if (rut == null) {
            return;
        }

        String telefono = pedirTexto(
                "Ingrese el teléfono del guía:"
        );

        if (telefono == null) {
            return;
        }

        String ciudad = pedirTexto(
                "Ingrese la ciudad:"
        );

        if (ciudad == null) {
            return;
        }

        String region = pedirTexto(
                "Ingrese la región:"
        );

        if (region == null) {
            return;
        }

        String especialidad = pedirTexto(
                "Ingrese la especialidad:"
        );

        if (especialidad == null) {
            return;
        }

        Integer experiencia = pedirNumero(
                "Ingrese los años de experiencia:",
                0
        );

        if (experiencia == null) {
            return;
        }

        Direccion direccion =
                new Direccion(
                        ciudad,
                        region
                );

        GuiaTuristico guia =
                new GuiaTuristico(
                        nombre,
                        rut,
                        telefono,
                        direccion,
                        especialidad,
                        experiencia
                );

        // Agrega el guía a ambas colecciones
        gestorEntidades.agregarEntidad(
                guia
        );

        guias.add(
                guia
        );

        JOptionPane.showMessageDialog(
                null,
                "Guía turístico registrado correctamente."
        );
    }

    // Registra un vehículo
    private static void registrarVehiculo(
            GestorEntidades gestorEntidades) {

        String patente = pedirTexto(
                "Ingrese la patente:"
        );

        if (patente == null) {
            return;
        }

        String marca = pedirTexto(
                "Ingrese la marca:"
        );

        if (marca == null) {
            return;
        }

        String modelo = pedirTexto(
                "Ingrese el modelo:"
        );

        if (modelo == null) {
            return;
        }

        Integer capacidad = pedirNumero(
                "Ingrese la capacidad de pasajeros:",
                1
        );

        if (capacidad == null) {
            return;
        }

        Vehiculo vehiculo =
                new Vehiculo(
                        patente,
                        marca,
                        modelo,
                        capacidad
                );

        gestorEntidades.agregarEntidad(
                vehiculo
        );

        JOptionPane.showMessageDialog(
                null,
                "Vehículo registrado correctamente."
        );
    }

    // Registra un colaborador externo
    private static void registrarColaborador(
            GestorEntidades gestorEntidades) {

        String nombre = pedirTexto(
                "Ingrese el nombre del colaborador:"
        );

        if (nombre == null) {
            return;
        }

        String rut = pedirRut(
                "Ingrese el RUT del colaborador:"
        );

        if (rut == null) {
            return;
        }

        String telefono = pedirTexto(
                "Ingrese el teléfono:"
        );

        if (telefono == null) {
            return;
        }

        String empresa = pedirTexto(
                "Ingrese el nombre de la empresa:"
        );

        if (empresa == null) {
            return;
        }

        String servicio = pedirTexto(
                "Ingrese el servicio prestado:"
        );

        if (servicio == null) {
            return;
        }

        ColaboradorExterno colaborador =
                new ColaboradorExterno(
                        nombre,
                        rut,
                        telefono,
                        null,
                        empresa,
                        servicio
                );

        gestorEntidades.agregarEntidad(
                colaborador
        );

        JOptionPane.showMessageDialog(
                null,
                "Colaborador registrado correctamente."
        );
    }

    // Muestra todas las entidades
    private static void mostrarEntidades(
            GestorEntidades gestorEntidades) {

        JOptionPane.showMessageDialog(
                null,
                gestorEntidades.obtenerResumenEntidades(),
                "Entidades registradas",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Muestra los guías cargados desde guias.txt
    private static void mostrarGuias(
            ArrayList<GuiaTuristico> guias) {

        if (guias.isEmpty()) {

            JOptionPane.showMessageDialog(
                    null,
                    "No existen guías registrados."
            );

            return;
        }

        StringBuilder texto =
                new StringBuilder();

        texto.append(
                "=== GUÍAS TURÍSTICOS ===\n\n"
        );

        for (GuiaTuristico guia : guias) {

            texto.append(
                    guia.mostrarResumen()
            );

            texto.append("\nRUT: ")
                    .append(
                            guia.getRut()
                    );

            texto.append("\nCiudad: ")
                    .append(
                            guia.getDireccion().getCiudad()
                    );

            texto.append("\n\n");
        }

        JOptionPane.showMessageDialog(
                null,
                texto.toString(),
                "Guías turísticos",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Muestra los tours cargados desde tours.txt
    private static void mostrarTours(
            ArrayList<Tour> tours) {

        if (tours.isEmpty()) {

            JOptionPane.showMessageDialog(
                    null,
                    "No existen tours cargados."
            );

            return;
        }

        StringBuilder texto =
                new StringBuilder();

        texto.append(
                "=== TOURS DISPONIBLES ===\n\n"
        );

        for (Tour tour : tours) {

            texto.append("Nombre: ")
                    .append(
                            tour.getNombre()
                    );

            texto.append("\nTipo: ")
                    .append(
                            tour.getTipo()
                    );

            texto.append("\nPrecio: $")
                    .append(
                            tour.getPrecio()
                    );

            texto.append("\n\n");
        }

        JOptionPane.showMessageDialog(
                null,
                texto.toString(),
                "Tours cargados desde archivo",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Busca un guía mediante su RUT
    private static void buscarGuiaPorRut(
            ArrayList<GuiaTuristico> guias) {

        String rutBuscado = pedirRut(
                "Ingrese el RUT del guía que desea buscar:"
        );

        if (rutBuscado == null) {
            return;
        }

        String rutLimpioBuscado =
                limpiarRut(
                        rutBuscado
                );

        for (GuiaTuristico guia : guias) {

            String rutLimpioGuia =
                    limpiarRut(
                            guia.getRut()
                    );

            if (rutLimpioGuia.equals(
                    rutLimpioBuscado
            )) {

                String datosGuia =
                        "Nombre: "
                                + guia.getNombre()
                                + "\nRUT: "
                                + guia.getRut()
                                + "\nTeléfono: "
                                + guia.getTelefono()
                                + "\nCiudad: "
                                + guia.getDireccion().getCiudad()
                                + "\nRegión: "
                                + guia.getDireccion().getRegion()
                                + "\nEspecialidad: "
                                + guia.getEspecialidad()
                                + "\nAños de experiencia: "
                                + guia.getAniosExperiencia();

                JOptionPane.showMessageDialog(
                        null,
                        datosGuia,
                        "Guía encontrado",
                        JOptionPane.INFORMATION_MESSAGE
                );

                return;
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "No se encontró un guía con ese RUT.",
                "Resultado de búsqueda",
                JOptionPane.WARNING_MESSAGE
        );
    }

    // Filtra los guías según su especialidad
    private static void filtrarGuiasPorEspecialidad(
            ArrayList<GuiaTuristico> guias) {

        String especialidad = pedirTexto(
                "Ingrese la especialidad que desea buscar:"
        );

        if (especialidad == null) {
            return;
        }

        StringBuilder resultado =
                new StringBuilder();

        resultado.append(
                "=== GUÍAS DE ESPECIALIDAD "
        );

        resultado.append(
                especialidad.toUpperCase()
        );

        resultado.append(" ===\n\n");

        int cantidadEncontrada = 0;

        for (GuiaTuristico guia : guias) {

            if (guia.getEspecialidad()
                    .equalsIgnoreCase(
                            especialidad
                    )) {

                resultado.append(
                        guia.mostrarResumen()
                );

                resultado.append(
                        "\n\n"
                );

                cantidadEncontrada++;
            }
        }

        if (cantidadEncontrada == 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "No se encontraron guías de esa especialidad.",
                    "Resultado del filtro",
                    JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        JOptionPane.showMessageDialog(
                null,
                resultado.toString(),
                "Guías filtrados",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Elimina puntos y guion para comparar RUT
    private static String limpiarRut(
            String rut) {

        return rut
                .replace(".", "")
                .replace("-", "")
                .trim()
                .toUpperCase();
    }

    // Solicita y valida un RUT
    private static String pedirRut(
            String mensaje) {

        while (true) {

            String rut =
                    JOptionPane.showInputDialog(
                            null,
                            mensaje
                    );

            if (rut == null) {
                return null;
            }

            try {

                ValidadorRut.validar(
                        rut
                );

                return rut.trim();

            } catch (
                    RutInvalidoException error) {

                JOptionPane.showMessageDialog(
                        null,
                        error.getMessage(),
                        "RUT inválido",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    // Solicita texto y evita campos vacíos
    private static String pedirTexto(
            String mensaje) {

        while (true) {

            String texto =
                    JOptionPane.showInputDialog(
                            null,
                            mensaje
                    );

            if (texto == null) {
                return null;
            }

            texto = texto.trim();

            if (!texto.isEmpty()) {
                return texto;
            }

            JOptionPane.showMessageDialog(
                    null,
                    "El campo no puede quedar vacío.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // Solicita un número y valida su valor mínimo
    private static Integer pedirNumero(
            String mensaje,
            int valorMinimo) {

        while (true) {

            String entrada =
                    JOptionPane.showInputDialog(
                            null,
                            mensaje
                    );

            if (entrada == null) {
                return null;
            }

            try {

                int numero =
                        Integer.parseInt(
                                entrada.trim()
                        );

                if (numero >= valorMinimo) {
                    return numero;
                }

                JOptionPane.showMessageDialog(
                        null,
                        "El número debe ser igual o mayor a "
                                + valorMinimo + ".",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

            } catch (
                    NumberFormatException error) {

                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un número válido.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}