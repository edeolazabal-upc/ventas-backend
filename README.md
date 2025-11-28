# ventas-backend (Spring Boot, Maven, PostgreSQL, Swagger)

Estructura mínima y comandos para levantar y desplegar.

## Construir y ejecutar local
mvn clean package
java -jar target/ventas-backend-0.0.1-SNAPSHOT.jar

## Docker (local)
docker build -t ventas-backend .
docker run -e PORT=8080 -p 8080:8080 ventas-backend

## RENDER
- Crear servicio Postgres en Render y copiar credenciales.
- Crear Web Service tipo Docker y configurar variables de entorno:
  POSTGRES_HOST, POSTGRES_PORT, POSTGRES_DB, POSTGRES_USER, POSTGRES_PASSWORD
- Render ejecutará Dockerfile y arrancará la app.
