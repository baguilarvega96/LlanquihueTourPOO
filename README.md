# Llanquihue Tour POO

## Descripción del proyecto

Este proyecto corresponde a una actividad de Programación Orientada a Objetos en Java para la agencia turística Llanquihue Tour.

El sistema permite leer información desde archivos externos de texto, cargar los datos en colecciones dinámicas `ArrayList`, crear objetos a partir de esos datos y mostrar resultados por consola. Además, permite aplicar filtros simples para visualizar tours y guías turísticos según ciertos criterios.

El proyecto trabaja con tours turísticos y guías turísticos vinculados a la operación de la agencia.

## Funcionalidades principales

* Lectura de datos desde archivos `.txt`.
* Separación de datos utilizando `split(";")`.
* Creación de objetos a partir de los datos leídos.
* Almacenamiento de objetos en colecciones `ArrayList`.
* Visualización de todos los tours registrados.
* Filtro de tours por tipo gastronómico.
* Visualización de todos los guías turísticos registrados.
* Filtro de guías turísticos por especialidad.
* Filtro de guías turísticos por años de experiencia.
* Uso de paquetes funcionales para organizar el código.
* Aplicación de Programación Orientada a Objetos.
* Uso de composición entre clases.

## Estructura del proyecto

```text
LlanquihueTourPOO/
├── resources/
│   ├── tours.txt
│   └── guias.txt
├── src/
│   ├── app/
│   │   └── Main.java
│   ├── data/
│   │   └── GestorDatos.java
│   ├── model/
│   │   ├── Direccion.java
│   │   ├── Persona.java
│   │   ├── GuiaTuristico.java
│   │   └── Tour.java
│   ├── service/
│   │   └── ServicioGuia.java
│   └── ui/
│       └── Main.java
└── README.md
```

## Paquetes utilizados

### `model`

Contiene las clases principales del modelo del sistema.

Clases:

* `Direccion`: representa la ciudad y región asociada a una persona.
* `Persona`: clase base para personas vinculadas a la agencia. Contiene nombre, RUT, teléfono y dirección.
* `GuiaTuristico`: representa a un guía turístico. Hereda de `Persona` y agrega especialidad y años de experiencia.
* `Tour`: representa un tour turístico con nombre, tipo y precio.

### `data`

Contiene la clase encargada de leer archivos externos.

Clase:

* `GestorDatos`: lee los archivos `tours.txt` y `guias.txt`, separa los datos con `split(";")`, crea objetos y los almacena en colecciones `ArrayList`.

### `service`

Contiene clases con operaciones del sistema.

Clase:

* `ServicioGuia`: permite mostrar guías turísticos, filtrar por especialidad y filtrar por años de experiencia.

### `ui`

Contiene la clase principal de ejecución del sistema.

Clase:

* `Main`: ejecuta el programa, carga los datos desde los archivos, muestra la información y aplica filtros.

### `app`

Contiene una clase puente para ejecutar el programa desde el paquete principal.

Clase:

* `Main`: redirige la ejecución hacia `ui.Main`.

## Archivos de datos

### `tours.txt`

Formato:

```text
nombre;tipo;precio
```

Ejemplo:

```text
Ruta Gastronomica;gastronomico;25000
```

### `guias.txt`

Formato:

```text
nombre;rut;telefono;ciudad;region;especialidad;aniosExperiencia
```

Ejemplo:

```text
Camila Soto;12345678-9;987654321;Puerto Varas;Los Lagos;gastronomico;5
```

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que los archivos `tours.txt` y `guias.txt` estén dentro de la carpeta `resources`.
3. Ejecutar la clase principal:

```text
src/app/Main.java
```

También se puede ejecutar directamente:

```text
src/ui/Main.java
```

4. El programa mostrará por consola:

    * Lista completa de tours.
    * Tours de tipo gastronómico.
    * Lista completa de guías turísticos.
    * Guías con especialidad gastronómica.
    * Guías con 5 o más años de experiencia.

## Conceptos aplicados

* Programación Orientada a Objetos.
* Encapsulamiento.
* Herencia.
* Composición.
* Constructores.
* Getters y setters.
* Método `toString()`.
* Validaciones básicas.
* Manejo de excepciones con `try-catch`.
* Lectura de archivos.
* Uso de `ArrayList`.
* Organización modular por paquetes.
