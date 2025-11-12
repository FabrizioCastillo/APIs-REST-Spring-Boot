# TP Programación III - API REST de Productos (UTN)

API REST desarrollada con Spring Boot para la gestión de productos de un e-commerce, como parte del Trabajo Práctico de la materia Programación III de la UTN.

**Nombre:** Fabrizio Castillo
**Legajo:** 52617

---

## 🚀 Tecnologías Utilizadas

* Java 17 
* Spring Boot 3.x 
* Spring Web 
* Spring Data JPA 
* H2 Database (Base de datos en memoria) 
* Spring Validation 
* Springdoc OpenAPI (Swagger)
* Maven 

---

## ⚙️ Instrucciones para Clonar y Ejecutar

1.  Clonar el repositorio:
    ```bash
    git clone [URL_DE_TU_REPOSITORIO_GITHUB]
    ```
2.  Navegar al directorio del proyecto:
    ```bash
    cd productos-api
    ```
3.  Ejecutar el proyecto usando Maven:
    ```bash
    ./mvnw spring-boot:run
    ```
    (Alternativamente, puedes ejecutar la clase `ProductosApiApplication` desde tu IDE favorito).

---

## 🔑 Acceso a la Aplicación 

Una vez que la aplicación esté corriendo, puedes acceder a:

* **Documentación Swagger UI:**
    `http://localhost:8080/swagger-ui/index.html`

* **Consola H2:**
    `http://localhost:8080/h2-console` 

    **Configuración para H2:**
    * **Driver Class:** `org.h2.Driver`
    * **JDBC URL:** `jdbc:h2:mem:productosdb`
    * **User Name:** `sa`
    * **Password:** ``

---

## 📋 Tabla de Endpoints 

| Método | Ruta | Descripción |
| :--- | :--- | :--- |
| `POST` | `/api/productos` | Crea un nuevo producto. |
| `GET` | `/api/productos` | Lista todos los productos.  |
| `GET` | `/api/productos/{id}` | Obtiene un producto por su ID.  |
| `GET` | `/api/productos/categoria/{categoria}` | Filtra productos por categoría. |
| `PUT` | `/api/productos/{id}` | Actualiza un producto completo (por ID).  |
| `PATCH` | `/api/productos/{id}/stock` | Actualiza solo el stock de un producto.  |
| `DELETE` | `/api/productos/{id}` | Elimina un producto por ID.|

---

## 📸 Capturas de Pantalla

*Aquí se adjuntan las capturas de pantalla de las pruebas realizadas, como se solicita en la consigna.*

### 1. Documentación Completa en Swagger UI 

<img width="1305" height="951" alt="image" src="https://github.com/user-attachments/assets/30cbadc4-5ba2-41fa-a270-22f6b914c52d" />


### 2. Prueba Exitosa de POST (Creando Producto) 

<img width="954" height="858" alt="Captura de pantalla 2025-11-12 181319" src="https://github.com/user-attachments/assets/3922dfa5-7d72-4c0f-9e6f-2083bad010cc" />

### 3. Prueba de GET (Listando Productos) 

<img width="1280" height="853" alt="image" src="https://github.com/user-attachments/assets/4a30188d-b8e3-4247-bbe6-6c84bcf1d7dd" />



### 4. Prueba Error 400 (Validación) 
<img width="962" height="448" alt="Captura de pantalla 2025-11-12 181544" src="https://github.com/user-attachments/assets/fff1640d-160f-4384-9eeb-566c1b5f9863" />
<img width="952" height="407" alt="Captura de pantalla 2025-11-12 181558" src="https://github.com/user-attachments/assets/24d7ffab-c416-4f4c-9d71-9462c4089803" />




### 5. Prueba Error 404 (Producto No Encontrado)
<img width="961" height="798" alt="Captura de pantalla 2025-11-12 181728" src="https://github.com/user-attachments/assets/5f00c9e7-c672-490f-8d5c-6c6150cdc11b" />


### 6. Consola H2 con Datos Persistidos 

<img width="885" height="422" alt="Captura de pantalla 2025-11-12 181815" src="https://github.com/user-attachments/assets/16f6e24a-38aa-4e61-8d87-d4e16b37bf1a" />


---

## 💡 Conclusiones Personales 

Este TP fue clave para entender cómo armar una API REST completa. Pude aplicar la arquitectura en capas (Controller, Service, Repository) y comprendí la importancia de usar DTOs para separar la lógica de la base de datos.

Implementar el manejo de excepciones centralizado fue un gran aprendizaje, al igual que las validaciones.

El mayor desafío fue la configuración inicial, especialmente los conflictos de versiones entre Spring Boot y Swagger. Resolverlo fue una lección importante sobre la compatibilidad de dependencias.

Al final, poder probar toda la API en Swagger y ver los datos persistidos en la consola H2 fue muy satisfactorio y me dio una base sólida para futuros proyectos.
