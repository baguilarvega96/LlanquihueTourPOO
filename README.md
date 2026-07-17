# Llanquihue Tour - Evaluación Final POO

## Descripción del proyecto

Este proyecto corresponde a la Evaluación Final Transversal de la asignatura Desarrollo Orientado a Objetos I.

El sistema representa un prototipo para la agencia turística Llanquihue Tour. Su propósito es organizar información relacionada con guías turísticos, vehículos, colaboradores externos, tours y servicios turísticos.

El proyecto fue desarrollado en Java aplicando programación orientada a objetos, encapsulamiento, composición, herencia, polimorfismo, interfaces, colecciones genéricas, archivos externos y excepciones personalizadas.

## Funcionalidades

El sistema permite:

- Registrar guías turísticos.
- Registrar vehículos.
- Registrar colaboradores externos.
- Mostrar todas las entidades registradas.
- Cargar guías turísticos desde un archivo de texto.
- Cargar tours desde un archivo de texto.
- Buscar un guía turístico mediante su RUT.
- Filtrar guías según su especialidad.
- Validar el formato y dígito verificador del RUT.
- Mostrar distintos tipos de entidades mediante una colección polimórfica.
- Identificar objetos utilizando el operador `instanceof`.
- Utilizar una interfaz gráfica mediante `JOptionPane`.

## Organización del proyecto

El proyecto se encuentra organizado en los siguientes paquetes:

- `app`: contiene una clase puente para ejecutar la aplicación.
- `data`: contiene las clases encargadas de administrar colecciones y leer archivos.
- `exception`: contiene la excepción personalizada para RUT inválido.
- `model`: contiene las clases que representan las entidades del sistema.
- `service`: contiene operaciones de búsqueda y filtrado.
- `ui`: contiene la clase principal y la interfaz gráfica.
- `utils`: contiene la clase utilitaria encargada de validar el RUT.
- `resources`: contiene los archivos de datos externos.

## Clases principales

### Persona

Superclase que contiene los datos comunes de las personas relacionadas con la agencia:

- Nombre.
- RUT.
- Teléfono.
- Dirección.

Las clases `Cliente`, `GuiaTuristico` y `ColaboradorExterno` heredan de `Persona`.

### Direccion

Representa la ciudad y región de una persona.

La relación entre `Persona` y `Direccion` demuestra el principio de composición, porque una persona contiene un objeto de tipo `Direccion`.

### GuiaTuristico

Representa a un guía de la agencia. Contiene su especialidad y años de experiencia.

Hereda de `Persona` e implementa la interfaz `Registrable`.

### Cliente

Representa a un cliente de la agencia.

Hereda de `Persona` y contiene su número de cliente y preferencia turística.

### ColaboradorExterno

Representa a una persona o empresa externa que presta servicios a la agencia.

Hereda de `Persona` e implementa la interfaz `Registrable`.

### Vehiculo

Representa un vehículo utilizado por la agencia.

Contiene patente, marca, modelo y capacidad de pasajeros. También implementa la interfaz `Registrable`.

### ServicioTuristico

Superclase que representa un servicio turístico general.

Las clases `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural` heredan de esta clase y sobrescriben el método `mostrarInformacion()`.

### Tour

Representa un tour cargado desde el archivo `tours.txt`.

Contiene nombre, tipo y precio.

### Registrable

Interfaz que define el método común:

`String mostrarResumen();`

Es implementada por:

- `GuiaTuristico`.
- `Vehiculo`.
- `ColaboradorExterno`.

### GestorEntidades

Administra una colección de tipo:

`ArrayList<Registrable>`

Esta colección permite almacenar objetos de diferentes clases mediante una interfaz común.

La clase utiliza `instanceof` para identificar el tipo real de cada objeto.

### GestorDatos

Lee los archivos externos:

- `resources/guias.txt`
- `resources/tours.txt`

Convierte cada línea de los archivos en objetos Java y los almacena en colecciones `ArrayList`.

### GestorServicios

Crea y recorre una colección polimórfica de tipo:

`List<ServicioTuristico>`

La ejecución de `mostrarInformacion()` depende de la subclase correspondiente.

### ValidadorRut

Clase utilitaria que valida:

- Campos vacíos.
- Formato del RUT.
- Cantidad de dígitos.
- Dígito verificador.

### RutInvalidoException

Excepción personalizada que se genera cuando el RUT ingresado no es válido.

El programa captura esta excepción y muestra el mensaje correspondiente sin cerrar la aplicación.

## Principios de programación orientada a objetos

### Encapsulamiento

Los atributos de las clases se encuentran declarados como `private` y se accede a ellos mediante getters y setters públicos.

### Composición

La clase `Persona` contiene un objeto de tipo `Direccion`.

### Herencia

Se aplican las siguientes jerarquías:

- `Persona` → `Cliente`
- `Persona` → `GuiaTuristico`
- `Persona` → `ColaboradorExterno`
- `ServicioTuristico` → `RutaGastronomica`
- `ServicioTuristico` → `PaseoLacustre`
- `ServicioTuristico` → `ExcursionCultural`

### Polimorfismo

Las subclases de `ServicioTuristico` sobrescriben el método `mostrarInformacion()`.

También se utiliza una colección `ArrayList<Registrable>` para almacenar diferentes tipos de entidades.

### Sobrescritura

Se utiliza la anotación `@Override` en los métodos sobrescritos por las subclases y en los métodos definidos por la interfaz.

## Colecciones y archivos

El proyecto utiliza:

- `ArrayList<GuiaTuristico>`
- `ArrayList<Tour>`
- `ArrayList<Registrable>`
- `List<ServicioTuristico>`

Los archivos externos utilizan el carácter punto y coma como separador.

Ejemplo de un guía:

`Camila Soto;12345678-5;987654321;Puerto Varas;Los Lagos;gastronomico;5`

Ejemplo de un tour:

`Ruta Gastronomica;gastronomico;25000`

## Instrucciones para clonar el proyecto

Ejecutar el siguiente comando:

`git clone https://github.com/baguilarvega96/llanquihue-tour.git`

Después, abrir la carpeta descargada utilizando IntelliJ IDEA.

## Instrucciones de ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que exista un JDK configurado.
3. Abrir el archivo `src/ui/Main.java`.
4. Ejecutar el método `public static void main(String[] args)`.
5. Utilizar el menú gráfico para probar las funcionalidades.

El programa debe ejecutarse desde la carpeta principal del proyecto para encontrar correctamente los archivos ubicados en `resources`.

## Opciones del menú

1. Registrar guía turístico.
2. Registrar vehículo.
3. Registrar colaborador externo.
4. Mostrar todas las entidades.
5. Mostrar guías cargados desde archivo.
6. Mostrar tours cargados desde archivo.
7. Buscar guía por RUT.
8. Filtrar guías por especialidad.
0. Salir.

## Tecnologías utilizadas

- Java.
- IntelliJ IDEA.
- Java Swing mediante `JOptionPane`.
- Git.
- GitHub.
- Archivos de texto `.txt`.

## Autor

Byron Aguilar  
Estudiante de Analista Programador.