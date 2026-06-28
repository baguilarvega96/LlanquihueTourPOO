# Llanquihue Tour POO

## Descripción del proyecto

Este proyecto corresponde a la actividad de Semana 6 de Desarrollo Orientado a Objetos I.

El objetivo de esta semana es implementar una jerarquía de clases con herencia simple para representar distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

El sistema utiliza una superclase llamada `ServicioTuristico`, que contiene atributos comunes como el nombre del servicio y la duración en horas. A partir de esta clase se crean subclases especializadas que representan servicios turísticos específicos, como rutas gastronómicas, paseos lacustres y excursiones culturales.

## Objetivo de la Semana 6

El objetivo principal es aplicar los conceptos de:

* Herencia simple.
* Atributos heredados.
* Uso de `super(...)` en constructores.
* Sobrescritura del método `toString()`.
* Organización modular por paquetes.
* Creación de instancias de prueba.
* Visualización de resultados por consola.

## Estructura del proyecto

```text
LlanquihueTourPOO/
├── src/
│   ├── data/
│   │   └── GestorServicios.java
│   ├── model/
│   │   ├── ServicioTuristico.java
│   │   ├── RutaGastronomica.java
│   │   ├── PaseoLacustre.java
│   │   └── ExcursionCultural.java
│   └── ui/
│       └── Main.java
└── README.md
```

## Clases creadas

### `ServicioTuristico`

Es la superclase del sistema. Contiene los atributos comunes para todos los servicios turísticos:

* `nombre`
* `duracionHoras`

También incluye constructor, getters, setters y método `toString()`.

### `RutaGastronomica`

Es una subclase de `ServicioTuristico`.

Agrega el atributo específico:

* `numeroDeParadas`

Utiliza `super(...)` para reutilizar los atributos de la superclase y sobrescribe el método `toString()` para mostrar la información completa.

### `PaseoLacustre`

Es una subclase de `ServicioTuristico`.

Agrega el atributo específico:

* `tipoEmbarcacion`

Utiliza `super(...)` en su constructor y sobrescribe el método `toString()`.

### `ExcursionCultural`

Es una subclase de `ServicioTuristico`.

Agrega el atributo específico:

* `lugarHistorico`

También utiliza `super(...)` en el constructor y sobrescribe el método `toString()`.

### `GestorServicios`

Clase ubicada en el paquete `data`.

Su función es crear instancias de prueba de las subclases:

* Dos objetos de `RutaGastronomica`.
* Dos objetos de `PaseoLacustre`.
* Dos objetos de `ExcursionCultural`.

Luego muestra todos los servicios por consola.

### `Main`

Clase principal ubicada en el paquete `ui`.

Desde esta clase se ejecuta el programa, se instancia `GestorServicios` y se muestran los servicios turísticos disponibles.

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Ir a la clase principal:

```text
src/ui/Main.java
```

3. Ejecutar el método `main`.
4. El programa mostrará por consola los servicios turísticos creados:

* Rutas gastronómicas.
* Paseos lacustres.
* Excursiones culturales.

## Resultado esperado en consola

```text
=== AGENCIA LLANQUIHUE TOUR ===
Demostracion de jerarquia de clases con herencia simple

=== SERVICIOS TURISTICOS DISPONIBLES ===
RutaGastronomica{...}
RutaGastronomica{...}
PaseoLacustre{...}
PaseoLacustre{...}
ExcursionCultural{...}
ExcursionCultural{...}
```

## Conceptos aplicados

* Programación Orientada a Objetos.
* Herencia simple.
* Superclase.
* Subclases.
* Uso de `super(...)`.
* Sobrescritura de métodos.
* Método `toString()`.
* Organización por paquetes.
* Ejecución desde una clase principal.
