# Parcial2-AREP
ENUNCIADO
La secuencia de Lucas es una secuencia de enteros que lleva el nombre del matemático François Édouard Anatole Lucas (1842-1891), quien estudió tanto esa secuencia como su relación con la secuencia de Fibonacci.

Diseñe, construya y despliegue un aplicación web para investigar la secuencia de Lucas. El programa debe estar desplegado en tres máquinas virtuales de EC2 de AWS como se describe abajo. Las tecnologías usadas en la solución deben ser maven, git, github, maven, sparkjava, html5, y js. No use liberías adicionales.
## **Prerrequisitos**

-   [Git](https://git-scm.com/downloads) - Sistema de control de versiones
-   [Maven](https://maven.apache.org/download.cgi) - Gestor de dependencias
-   [Java 8](https://www.java.com/download/ie_manual.jsp) - Entorno de desarrollo
-   [Intellij Idea](https://www.jetbrains.com/es-es/idea/download/) (Opcional)


## **Instrucciones de ejecución local**

0. Desde cmd clonar el repositorio

```git
git clone https://github.com/CamiloCastiblanco/Parcial2-AREP.git
```


1. Ubicarse en la carpeta Parcial2-AREP y borraremos todas las dependencias y modulos que puedan exisitir de los binarios del proyecto.
```maven
mvn clean install
```

2. Realizamos la compilación y empaquetamiento del proyecto
```maven
mvn package -U
```

3. Ejecutamos el proyecto
```maven
java -cp target/Parcial2-AREP-1.0-SNAPSHOT.jar edu.escuelaing.arep.RestService
```
## Para entrar de manera remota
Se debe descargar la llave que esta dentro de la ubicación del proyecto en la carpeta key, allí se debe abrir un command prompt para luego ejecutar el comando:
```
ssh -i "LucasServices.pem" ec2-user@ec2-3-84-123-30.compute-1.amazonaws.com
```
La  instancia EC2 a la que estamos conectados es a la siguiente:

![image](https://github.com/CamiloCastiblanco/Parcial2-AREP/assets/69698380/82320cf5-cd00-4300-98bd-872aa98be1ea)

Luego de esto se debe entrar a la url:
- [LucasServiceAWS](http://ec2-3-84-123-30.compute-1.amazonaws.com:4567/index.html) - Servicio de Lucas

Y se debería ver algo como esto: 

![image](https://github.com/CamiloCastiblanco/Parcial2-AREP/assets/69698380/c38a28eb-7ea4-42bf-968d-ccf63f070eee)

Probando:

![image](https://github.com/CamiloCastiblanco/Parcial2-AREP/assets/69698380/a1e3634f-4199-4143-b90a-ccb1c236c6aa)

Y así se un JSON que genera el proyecto:

![image](https://github.com/CamiloCastiblanco/Parcial2-AREP/assets/69698380/45aae4c9-0044-444d-b83f-74dd9f51f4e9)



## Video de Funcionamiento
Se debe entrar a la url:
- [Video Funcionalidad](https://drive.google.com/file/d/1p1ejClNdA3thVp6QqDcy3tIdMIHfJ5cx) - Servicio de Lucas 
- [Video Funcionalidad](https://drive.google.com/file/d/1gUxkzhaYFRy5CNgbVoYUrSgmBRX_r0B-/view?pli=1) - Servicio de Lucas JSON 


