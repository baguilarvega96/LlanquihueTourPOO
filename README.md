# Llanquihue Tour POO

## Descripción del proyecto

Este proyecto corresponde a una actividad formativa de Programación Orientada a Objetos en Java.

El sistema permite leer información de tours turísticos desde un archivo de texto llamado `tours.txt`. Cada línea del archivo contiene los datos de un tour separados por punto y coma. Luego, el programa crea objetos de la clase `Tour`, los almacena en un `ArrayList`, muestra todos los tours registrados y filtra los tours de tipo gastronómico.

## Estructura del proyecto

```text
LlanquihueTourPOO/
├── resources/
│   └── tours.txt
├── src/
│   ├── data/
│   │   └── GestorDatos.java
│   ├── model/
│   │   └── Tour.java
│   └── ui/
│       └── Main.java
└── README.md
```

## Archivo de datos

El archivo `tours.txt` contiene información de tours turísticos con el siguiente formato:

```text
nombre;tipo;precio
```

Ejemplo:

```text
Ruta Gastronomica;gastronomico;25000
```

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` esté dentro de la carpeta `resources`.
3. Ejecutar la clase `Main.java`, ubicada en el paquete `ui`.
4. El programa mostrará todos los tours disponibles y luego filtrará los tours de tipo gastronómico.

## Clase principal

La clase principal que se debe ejecutar es:

```text
src/ui/Main.java
```

## Funcionalidades implementadas

* Lectura de datos desde un archivo `.txt`.
* Separación de datos mediante `.split(";")`.
* Creación de objetos de la clase `Tour`.
* Almacenamiento de objetos en un `ArrayList`.
* Recorrido de la colección.
* Filtrado de tours según su tipo.
* Visualización de resultados en consola.
