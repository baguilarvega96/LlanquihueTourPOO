# Llanquihue Tour POO

## Descripción del proyecto

Este proyecto corresponde a la actividad de Semana 7 de Desarrollo Orientado a Objetos I.

El objetivo de esta semana es aplicar polimorfismo y colecciones genéricas dentro del sistema de la agencia Llanquihue Tour. Para ello, se utiliza la jerarquía de clases creada en la semana anterior, compuesta por una superclase `ServicioTuristico` y sus subclases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.

El sistema permite almacenar distintos tipos de servicios turísticos en una misma colección genérica de tipo `List<ServicioTuristico>` y recorrerlos utilizando referencias de la superclase. Cada subclase sobrescribe el método `mostrarInformacion()`, por lo que al recorrer la colección, Java ejecuta automáticamente la versión correspondiente según el tipo real del objeto.

## Objetivo de la Semana 7

Aplicar los siguientes conceptos:

* Polimorfismo.
* Colecciones genéricas.
* Uso de `List<ServicioTuristico>`.
* Sobrescritura de métodos.
* Uso de `@Override`.
* Recorrido de colecciones con `for-each`.
* Organización modular en paquetes.
* Ejecución desde clase principal.

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

## Clases principales

### `ServicioTuristico`

Superclase que contiene los atributos comunes de todos los servicios turísticos:

* `nombre`
* `duracionHoras`

También contiene el método `mostrarInformacion()`, que puede ser sobrescrito por las subclases.

### `RutaGastronomica`

Subclase de `ServicioTuristico`.

Agrega el atributo:

* `numeroDeParadas`

Sobrescribe el método `mostrarInformacion()` para mostrar datos propios de una ruta gastronómica.

### `PaseoLacustre`

Subclase de `ServicioTuristico`.

Agrega el atributo:

* `tipoEmbarcacion`

Sobrescribe el método `mostrarInformacion()` para mostrar datos propios de un paseo lacustre.

### `ExcursionCultural`

Subclase de `ServicioTuristico`.

Agrega el atributo:

* `lugarHistorico`

Sobrescribe el método `mostrarInformacion()` para mostrar datos propios de una excursión cultural.

### `GestorServicios`

Clase ubicada en el paquete `data`.

Crea una colección polimórfica:

```java
List<ServicioTuristico> servicios = new ArrayList<>();
```

Dentro de esta lista se agregan objetos de diferentes subclases:

* `RutaGastronomica`
* `PaseoLacustre`
* `ExcursionCultural`

Luego, recorre la colección con un ciclo `for-each` e invoca el método `mostrarInformacion()` desde una referencia de tipo `ServicioTuristico`.

### `Main`

Clase principal ubicada en el paquete `ui`.

Desde esta clase se ejecuta el programa, se obtiene la lista de servicios turísticos y se muestran los resultados por consola.

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Ir a la clase principal:

```text
src/ui/Main.java
```

3. Ejecutar el método `main`.
4. El programa mostrará por consola los servicios turísticos aplicando polimorfismo.

## Resultado esperado en consola

```text
=== AGENCIA LLANQUIHUE TOUR ===
Aplicando polimorfismo y colecciones genericas

=== SERVICIOS TURISTICOS DISPONIBLES ===
Ruta gastronomica: Ruta de Sabores del Lago, duracion: 4 horas, numero de paradas: 5
Ruta gastronomica: Experiencia Gastronomica Frutillar, duracion: 3 horas, numero de paradas: 4
Paseo lacustre: Paseo por Lago Llanquihue, duracion: 2 horas, tipo de embarcacion: Lancha turistica
Paseo lacustre: Navegacion Puerto Varas, duracion: 3 horas, tipo de embarcacion: Catamaran
Excursion cultural: Tour Patrimonial Frutillar, duracion: 3 horas, lugar historico: Teatro del Lago
Excursion cultural: Recorrido Historico Llanquihue, duracion: 2 horas, lugar historico: Casas patrimoniales
```

## Conceptos aplicados

* Programación Orientada a Objetos.
* Herencia.
* Polimorfismo.
* Superclase.
* Subclases.
* Sobrescritura de métodos.
* Uso de `@Override`.
* Colecciones genéricas.
* Uso de `List`.
* Uso de `ArrayList`.
* Ciclo `for-each`.
* Organización por paquetes.
