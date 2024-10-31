# AREP-PARCIAL2
Arquitectura Empresarial Parcial Segundo Corte

## Nombre: Camilo Murcia Espinosa

En el primer commit se logro implementar los metodos para las busquedas tanto lineal como binaria, se realizo los controladores y su respectivo servicio para realizar las peticiones del Front al Back.
De momento no realiza las peticiones correctamente al controlador y salta error 500.
Se implementa el cambio de puerto para el inicio de la aplicacion con ayuda de SpringBootApplication

Se implementa el algoritmo de RoundRobin para que use un balanceador de carga dependiendo del modulo de la longitud de la lista.

Se generan los respectivos archivos jar que se lograron hasta este punto que es del back tanto controladores como servicios, del front que es la parte del HTML y JavaScript que implementa la pagina, y el servidor proxy que recibe estas peticiones.

Se intenta realizar un intento de despliegue en una instancia de EC2 en AWS, sin embargo no se logra completamente debido a problemas con los puertos al momento de intentar ejecutar el jar dentro de la instancia.


