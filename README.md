# LlanquihueTourPOO

## Descripción del proyecto

Este proyecto corresponde a un prototipo básico desarrollado en Java para la agencia de turismo Llanquihue Tour. Su propósito es representar personas vinculadas a la organización, como clientes y guías turísticos, aplicando principios de programación orientada a objetos.

## Estructura del proyecto

El proyecto está organizado en dos paquetes principales:

- `model`: contiene las clases del dominio del sistema.
- `app`: contiene la clase principal `Main`, desde donde se ejecuta el programa.

## Clases implementadas

### Direccion
Representa la dirección de una persona. Contiene calle, ciudad y región.

### Persona
Clase base que contiene atributos comunes como nombre, RUT, teléfono y dirección.

### Cliente
Clase que hereda de Persona y agrega información propia de un cliente, como número de cliente y preferencia turística.

### GuiaTuristico
Clase que hereda de Persona y agrega datos específicos del guía, como especialidad y años de experiencia.

## Principios de POO aplicados

- Encapsulamiento mediante atributos privados.
- Uso de constructores.
- Métodos getters y setters.
- Herencia entre Persona, Cliente y GuiaTuristico.
- Composición entre Persona y Direccion.
- Sobrescritura del método `toString()`.

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que las clases estén dentro de los paquetes `model` y `app`.
3. Ejecutar la clase `Main`.
4. Revisar la salida por consola.

## Autor

Nombre del estudiante: Byron Aguilar  
Asignatura: Desarrollo Orientado a Objetos I  
Semana: 3