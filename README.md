🧠 Proyecto Final: Sistemas Basados en Reglas
🧪 Examen Final – Drools + Spring Boot
Este proyecto consiste en un microservicio desarrollado con Spring Boot, que integra Drools, un motor de reglas de negocio. Su función principal es aplicar descuentos automáticos en compras en línea, según criterios como el tipo de cliente, monto de compra y cantidad de productos.

📦 Requisitos Previos
Asegúrate de contar con lo siguiente antes de iniciar:
springtool, intellij, vscode.

Java 17 ☕

Maven ⚒️


▶️ ¿Cómo lo ejecuto?
Clona el repositorio.

Abre una terminal y corre los siguientes comandos:


mvn clean
mvn install
mvn spring-boot:run
Finalmente, prueba el servicio con Postman, enviando una petición POST con los datos de la compra en formato JSON. La respuesta mostrará los descuentos aplicados automáticamente.
