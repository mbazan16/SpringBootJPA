
Este proyecto es un ejemplo de conexion y mapeo de datos JPA con la entidad Departamento.
Únicamente contiene capa DAO y solo se pueden ejecutar los test sobre él.
Utiliza una base de datos en memoria H2 que nos proporciona la dependencia "Spring DevTool"
y con datos iniciales (data.sql).
Para ejecutar con datos iniciales debemos incluir en application.properties:
spring.jpa.defer-datasource-initialization=true
Esta propiedad obliga a Hibernate (proveedor de persistencia de Spring) que genere el esquema de datos
(la base de datos) antes de ejecutar las sentencias SQL de data.sql.