# Microservicio de Compras
## Descripción
Este microservicio se encarga de gestionar las compras de los productos de la empresa: *Colombian Clothes*.

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