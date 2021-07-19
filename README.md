<h1>Kanterita Java-Api-Rest</h1>

Este programa API-REST permite dar solucion a la problematica de pedidos de un Restarante mediante peticiones http para:
* Registrar un nuevo detalle a una orden existente.
* Visualizar todos los detalles de una orden.
* Eliminar los detalles de una orden
* Actualizar los datos del Usuario

<h1>Usar el proyecto</h1>

* Para usar el proyecto se lo debe clonar o descargar en .zip luego abrir el proyecto con cualquier IDE de desarrollo compatible con el lenguaje de programacion JAVA. Se debe tener instalada la libreria [Lombok](https://projectlombok.org/), la cual permite optimizar codigo evitando declarar los setters, gettets y constructores de la clase.
* Creamos una base de datos en mysql con el nombre kanterita.
* En la carpeta resources del proyectoa abrimos el archivo application.properties y procedemos a cambiar las credenciales como usuario y contraseña como se muestra a continuacion
  * spring.datasource.url=jdbc:mysql://127.0.0.1:3306/kanterita?serverTimezone=UTC
  * spring.datasource.username=root
  * spring.datasource.password=
  * spring.jpa.hibernate.ddl-auto=update
* En caso de tener corriendo la base de datos se debe cambiar el puerto
* Una vez instalada la libreria necesaria, procedemos a ejecutar el programa principal.
* El programa se ejecuta en http://localhost:8080.

<h1>Peticiones</h1>

Para hacer las pruebas de las peticiones se puede utilizar [Postman](https://www.postman.com/) copiamos la direccion http://localhost:8080 
<h3>Peticiones Get</h3>

* http://localhost:8080/orders devuelve todas las ordenes que se encuentren registradas
* http://localhost:8080/orders/{id} devuelve la orden con el id enviado 
* http://localhost:8080/orders/{id}/details devuelve todas los detalles del orden con el id enviado
* http://localhost:8080/orders/details devuelve todos los detalles registrados

<h3>Peticiones Post</h3>

* http://localhost:8080/orders inserta una nueva orden a la base de datos 
* http://localhost:8080/orders/{id}/details inserta un nuevo detalle a la orden con el id enviado

<h1>Configuracion de CORS</h1>

Para realizar las configuraciones de CORS solo nos dirigimos al archivo principal del proyecto RestaurantApplication.java y se procede a modificar las peticiones permitidas, los metodos, las direcciones validas y la configuracion de los headers
