## Calculadora Spring Boot

Este es el backend de una calculadora simple desarrollada con Spring Boot. Proporciona endpoints RESTful para realizar operaciones matemáticas básicas como suma, resta, multiplicación y división.

## Instalación y configuración
Descarga el archivo ZIP.
Abre el proyecto en tu IDE preferido (por ejemplo, IntelliJ IDEA o Eclipse).

## Ejecución
Desde tu IDE, ejecuta la aplicación como una aplicación Spring Boot.

La aplicación se ejecutará en http://localhost:8080.

## Uso
La aplicación backend proporciona los siguientes endpoints:

GET /api/calculator/add: Realiza una suma de dos números. Los parámetros num1 y num2 deben ser proporcionados en la URL.

GET /api/calculator/subtract: Realiza una resta de dos números. Los parámetros num1 y num2 deben ser proporcionados en la URL.

POST /api/calculator/multiply: Realiza una multiplicación de dos números. Los números deben ser proporcionados en el cuerpo de la solicitud como un objeto JSON con las propiedades num1 y num2.

POST /api/calculator/divide: Realiza una división de dos números. Los números deben ser proporcionados en el cuerpo de la solicitud como un objeto JSON con las propiedades num1 y num2.

Puedes utilizar herramientas como Postman o cURL para enviar las solicitudes a estos endpoints y recibir las respuestas correspondientes.

## Autor
Agustín Bartolini