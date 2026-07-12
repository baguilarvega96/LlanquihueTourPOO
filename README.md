# Llanquihue Tour POO

## Descripción del proyecto

Este proyecto corresponde a la actividad de la Semana 8 de la asignatura Desarrollo Orientado a Objetos I.

El sistema representa el funcionamiento de la agencia turística Llanquihue Tour y permite administrar diferentes entidades relacionadas con sus operaciones.

Durante esta etapa se incorporó una interfaz común llamada `Registrable`, implementada por las clases `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno`.

Las entidades son almacenadas dentro de una colección genérica de tipo `ArrayList<Registrable>` y son identificadas durante la ejecución mediante el operador `instanceof`.

El sistema incluye una interfaz gráfica desarrollada mediante `JOptionPane`, que permite ingresar y visualizar diferentes tipos de entidades.

## Funcionalidades

El programa permite:

- Registrar guías turísticos.
- Registrar vehículos.
- Registrar colaboradores externos.
- Almacenar diferentes tipos de objetos en una colección común.
- Diferenciar los objetos utilizando `instanceof`.
- Mostrar información mediante el método `mostrarResumen()`.
- Visualizar las entidades registradas mediante una interfaz gráfica.
- Mantener las funcionalidades desarrolladas durante las semanas anteriores.

## Interfaz utilizada

### Registrable

La interfaz `Registrable` define el siguiente método:

```java
String mostrarResumen();