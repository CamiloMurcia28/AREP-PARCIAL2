# AREP-PARCIAL2
Arquitectura Empresarial Parcial Segundo Corte

## Nombre: Camilo Murcia Espinosa

En el primer commit se logro implementar los metodos para las busquedas tanto lineal como binaria, se realizo los controladores y su respectivo servicio para realizar las peticiones del Front al Back.
De momento no realiza las peticiones correctamente al controlador y salta error 500.
Se implementa el cambio de puerto para el inicio de la aplicacion con ayuda de SpringBootApplication

Se implementa el algoritmo de RoundRobin para que use un balanceador de carga dependiendo del modulo de la longitud de la lista.

Se generan los respectivos archivos jar que se lograron hasta este punto que es del back tanto controladores como servicios, del front que es la parte del HTML y JavaScript que implementa la pagina, y el servidor proxy que recibe estas peticiones.

Se intenta realizar un intento de despliegue en una instancia de EC2 en AWS, sin embargo no se logra completamente debido a problemas con los puertos al momento de intentar ejecutar el jar dentro de la instancia.

![image](https://github.com/user-attachments/assets/2bf933e0-8ed4-4208-85c9-ac6e853be810)

![image](https://github.com/user-attachments/assets/2db9c992-32c3-49e1-b88a-214fc427fa6f)

![image](https://github.com/user-attachments/assets/8221dc3e-2387-45d7-9b61-0914d5b4e940)

![image](https://github.com/user-attachments/assets/86627e7f-cea8-4973-aaba-a6620769c1e0)

![image](https://github.com/user-attachments/assets/ba0febaa-f55b-4422-b61c-7a217834fbb5)

![image](https://github.com/user-attachments/assets/47e5bad2-20db-40d8-94d5-0e0d9dd19eee)

Intento de prueba:
![image](https://github.com/user-attachments/assets/f823ee26-9e47-4029-8049-874450a788fa)

----------------------------------------------------------------------------------------
Trabajo realizado en casa
Se logra corregir los errores de la conexion proxy junto con los modelos de la busqueda lineal y binaria, por lo que se realiza el despliegue en AWS.
Se crean 3 instancias, una para el servidor Proxy, y las 2 restantes para las busquedas respectivamente.

 [DEPLOYMENT VIDEO](https://youtu.be/gA29rbIQc8M)

![image](https://github.com/user-attachments/assets/396ac29a-2c8a-4063-ac87-cc9110e7558c)

 ![image](https://github.com/user-attachments/assets/e1b90038-a3eb-4904-8cca-f9faf6c7b9dc)

 ![image](https://github.com/user-attachments/assets/9675c602-b5ef-4312-ac7f-6b1920bd122e)

![image](https://github.com/user-attachments/assets/48481702-b433-4ed6-a025-efac2415ffdb)

![image](https://github.com/user-attachments/assets/d60b582e-a08f-40fb-a260-184287ae6215)

![Recording 2024-11-01 090213](https://github.com/user-attachments/assets/b0f591c0-67ab-483b-8517-614f0f52ca54)


Deployment Instructions

```bash
git clone https://github.com/CamiloMurcia28/AREP-PARCIAL2
cd AREP-LAB06
mvn clean install
```

AWS Deployment Instuctions

1. Creamos 3 instancias EC2, 1 para el proxy y 2 para el mathserver, todas en el mismo grupo de seguridad y con la misma llave
2. Pasamos los archivos .jar respectivamente segun corrsponda
3. ejecutamos el siguinete comando: 'sudo java -jar nombrearchivo.jar --server.port=9000'
4. ingresamos con el DNS publico de la maquina proxy

