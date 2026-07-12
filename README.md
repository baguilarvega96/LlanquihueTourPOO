# Llanquihue Tour POO

## Descripción del proyecto

Este proyecto corresponde a la actividad de la Semana 8 de la asignatura Desarrollo Orientado a Objetos I.

El sistema representa el funcionamiento de la agencia turística Llanquihue Tour y permite administrar distintas entidades relacionadas con sus operaciones.

Durante esta etapa se incorporó la interfaz `Registrable`, implementada por las clases `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno`.

Las entidades se almacenan en una colección genérica de tipo `ArrayList<Registrable>` y son identificadas durante la ejecución mediante el operador `instanceof`.

El sistema también incluye una interfaz gráfica desarrollada mediante `JOptionPane`.

## Funcionalidades

El programa permite:

- Registrar guías turísticos.
- Registrar vehículos.
- Registrar colaboradores externos.
- Almacenar distintos tipos de objetos en una colección común.
- Identificar los objetos mediante `instanceof`.
- Mostrar información mediante el método `mostrarResumen()`.
- Visualizar las entidades mediante una interfaz gráfica.
- Mantener las funcionalidades desarrolladas en las semanas anteriores.

## Interfaz utilizada

### Registrable

La interfaz `Registrable` define el siguiente método:

`String mostrarResumen();`

Las clases que implementan esta interfaz son:

- `GuiaTuristico`
- `Vehiculo`
- `ColaboradorExterno`

## Herencia

El proyecto utiliza la superclase `Persona`.

Las siguientes clases heredan de `Persona`:

- `Cliente`
- `GuiaTuristico`
- `ColaboradorExterno`

El proyecto también utiliza la superclase `ServicioTuristico`.

Las siguientes clases heredan de `ServicioTuristico`:

- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`

## Colección de entidades

La clase `GestorEntidades` utiliza una colección:

`ArrayList<Registrable>`

Esta colección permite almacenar objetos pertenecientes a diferentes clases que implementan la interfaz `Registrable`.

La colección se recorre mediante un ciclo `for-each`.

## Uso de instanceof

El operador `instanceof` permite identificar el tipo específico de cada objeto almacenado.

El sistema diferencia entre:

- `GuiaTuristico`
- `Vehiculo`
- `ColaboradorExterno`

Luego aplica una lógica específica según el tipo de entidad detectada.

## Interfaz gráfica

La interfaz gráfica fue desarrollada utilizando `JOptionPane`.

El menú permite:

1. Registrar un guía turístico.
2. Registrar un vehículo.
3. Registrar un colaborador externo.
4. Mostrar las entidades registradas.
0. Salir del programa.

## Clases principales

### Registrable

Interfaz que define el método común `mostrarResumen()`.

### GuiaTuristico

Representa a un guía de la agencia y almacena datos como nombre, especialidad y años de experiencia.

### Vehiculo

Representa un vehículo utilizado por la agencia y almacena patente, marca, modelo y capacidad de pasajeros.

### ColaboradorExterno

Representa a una persona o empresa externa que presta servicios a la agencia.

### GestorEntidades

Administra la colección `ArrayList<Registrable>`, agrega entidades y utiliza `instanceof` para diferenciarlas.

### GestorServicios

Administra la colección de servicios turísticos desarrollada durante la Semana 7.

### Main

Clase ubicada en el paquete `ui`. Ejecuta el sistema, muestra los servicios anteriores e inicia la interfaz gráfica.

## Organización del proyecto

- `app`: contiene una clase principal desarrollada en etapas anteriores.
- `data`: contiene `GestorDatos`, `GestorServicios` y `GestorEntidades`.
- `model`: contiene las clases, superclases e interfaz del sistema.
- `service`: contiene los servicios utilizados por la aplicación.
- `ui`: contiene la clase principal y la interfaz gráfica.
- `resources`: contiene los archivos de datos utilizados por el programa.

## Instrucciones de ejecución

1. Descargar o clonar el repositorio.
2. Abrir el proyecto utilizando IntelliJ IDEA.
3. Esperar a que IntelliJ cargue el proyecto.
4. Abrir el archivo:

`src/ui/Main.java`

5. Ejecutar el método:

`public static void main(String[] args)`

6. Utilizar el menú gráfico para registrar y visualizar las entidades.

## Conceptos aplicados

- Programación Orientada a Objetos.
- Interfaces.
- Herencia.
- Polimorfismo.
- Sobrescritura de métodos.
- Uso de `@Override`.
- Encapsulamiento.
- Colecciones genéricas.
- Uso de `List`.
- Uso de `ArrayList`.
- Ciclo `for-each`.
- Operador `instanceof`.
- Validación de datos.
- Interfaz gráfica mediante `JOptionPane`.
- Organización mediante paquetes.

## Autor

Byron Aguilar

Estudiante de Analista Programador.