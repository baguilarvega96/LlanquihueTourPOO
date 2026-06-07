# 🧠 Actividad Semana 3 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto

- **Nombre completo:** Byron Aguilar
- **Sección:** 004A
- **Carrera:** Analista Programador
- **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a un prototipo básico desarrollado en Java para la agencia de turismo **Llanquihue Tour**.

El objetivo del sistema es representar personas vinculadas a la organización, como clientes y guías turísticos, aplicando principios de programación orientada a objetos, tales como encapsulamiento, composición, herencia y reutilización de clases.

El sistema permite modelar información común de una persona, asociarla a una dirección y diferenciar roles específicos dentro de la agencia.

---

## 🧱 Estructura general del proyecto

```text
src/
├── app/        # Clase principal con el método main
│   └── Main.java
│
└── model/      # Clases del dominio del sistema
    ├── Persona.java
    ├── Direccion.java
    ├── Cliente.java
    └── GuiaTuristico.java
```
---

## 🧩 Clases implementadas

#### Persona
Clase base del sistema. Contiene atributos comunes como nombre, RUT, teléfono y dirección.

#### Direccion
Clase que representa la dirección de una persona, considerando calle, ciudad y región.

#### Cliente
Clase que hereda de Persona. Agrega atributos propios como número de cliente y preferencia turística.

#### GuiaTuristico
Clase que hereda de Persona. Agrega atributos como especialidad y años de experiencia.

#### Main
Clase principal ubicada en el paquete app. Permite crear objetos y mostrar la información por consola.

---

## 🧱 Principios de programación orientada a objetos aplicados

- Encapsulamiento mediante atributos privados.
- Uso de constructores.
- Métodos getters y setters.
- Herencia entre Persona, Cliente y GuiaTuristico.
- Composición entre Persona y Direccion.
- Sobrescritura del método toString().
- Organización del código en paquetes.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
Repositorio GitHub : Git clone https://github.com/baguilarvega96/LlanquihueTourPOO.git
```
---

Fecha de entrega:   📅  07.06.2026

