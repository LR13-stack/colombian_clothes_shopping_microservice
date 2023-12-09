# Microservicio de Compras
## Detalles
- **Lenguaje de programación:** Java 17
- **Framework:** Spring Boot 2.5.2
- **Base de datos:** MySQL
- **Nombre de la base de datos:** colombian-clothes-shopping // **Importante crearla y luego ejecutar Spring Boot**

## HTTP Métodos para el recurso Proveedor
### GET

#### Obtener todos los proveedores
- url: "http://localhost:8080/supplier"

#### Obtener un proveedor por Id
- url: "http://localhost:8080/supplier/{id}"

### POST
#### Crear un proveedor
- url: "http://localhost:8080/supplier"
- body: *JSON*
```json
{
	"businessName": "Nike",
	"ruc": "01234567890",
	"address": "Lima",
	"email": "nike@prueba.com",
	"phone": "123456789"
}
```

### PUT
#### Actualizar un proveedor
- url: "http://localhost:8080/supplier/{id}"
- body: *JSON*
```json
{
	"businessName": "Nike",
	"ruc": "01234567890",
	"address": "Trujillo",
	"email": "nike@prueba.com",
	"phone": "123456789"
}
```

### DELETE
#### Eliminar un proveedor
- url: "http://localhost:8080/supplier/{id}"