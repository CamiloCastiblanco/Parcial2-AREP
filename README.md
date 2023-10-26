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
git clone https://github.com/CamiloCastiblanco/Lab4-AREP.git
```


1. Ubicarse en la carpeta AREP-TALLER04 y borraremos todas las dependencias y modulos que puedan exisitir de los binarios del proyecto.
```maven
mvn clean install
```

2. Realizamos la compilación y empaquetamiento del proyecto
```maven
mvn package -U
```

3. Ejecutamos el proyecto
```maven
java -cp target/EciSpringboot-1.0-SNAPSHOT.jar edu.escuelaing.arep.RunMyServer
```
