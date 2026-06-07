package app;

import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;

public class Main {
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Av. Los Volcanes 859", "Llanquihue", "Los Lagos");
        Direccion direccion2 = new Direccion("Calle Puerto Varas 442", "Puerto Varas", "Los Lagos");
        Direccion direccion3 = new Direccion("Ruta Lago Llanquihue 966", "Frutillar", "Los Lagos");

        Cliente cliente1 = new Cliente(
                "Byron Aguilar",
                "20.377.690-2",
                "+56 9 6180 2714",
                direccion1,
                1001,
                "Paseos lacustres"
        );

        Cliente cliente2 = new Cliente(
                "Francesco Tossi",
                "15.987.654-3",
                "+56 9 3563 2785",
                direccion2,
                1002,
                "Rutas gastronómicas"
        );

        GuiaTuristico guia1 = new GuiaTuristico(
                "Alberto Campos",
                "18.456.789-1",
                "+56 9 9687 5539",
                direccion3,
                "Excursiones culturales",
                8
        );

        System.out.println("=== Sistema Llanquihue Tour ===");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(guia1);
    }
}