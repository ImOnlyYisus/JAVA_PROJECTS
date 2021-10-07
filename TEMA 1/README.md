# TEMA 1 (Introducción a Java)

_**Java** es un lenguaje de programación desarrollado por **Sun Microsystems**. Fue presentado en la segunda mitad del año 1995 y desde entonces se ha convertido en un lenguaje de programación muy popular. Java es un lenguaje muy valorado porque **los programas Java se pueden ejecutar en diversas plataformas** con  sistemas operativos como **Windows**, **Mac  OS**, **Linux** o **Solaris**._

_**Java** utiliza un entorno de ejecución para los programas compilados, este entorno se denomina **Java Runtime Environment (JRE)** que incluye **la máquina virtual Java (jvm, Java Virtual Machine)**._

* * *

## - INSTALACIÓN DE JDK 11
### UBUNTU
- **ACTUALIZAR REPOSITORIOS**
````
sudo apt update
````
- **INSTALAR PAQUETE JDK 11**
````
sudo apt install default-jdk
````
- _**Para comprobar la versión de compilador y de la JVM**_
````
java -version //JVM

javac -version //Compilador
````

### WINDOWS
- **DESCARGAR JDK 11**
<https://adoptopenjdk.net/index.html>

- _**Para comprobar la versión de compilador y de la JVM**_
````
java -version //JVM

javac -version //Compilador
````

* * *

## - INSTALACION DE IDE O ENTORNO DE DESARROLLO
Aqui podemos usar diversos entornos de desarrollo como **[Visual Studio Code](https://code.visualstudio.com/)**, **[IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/)**, **[Netbeans](https://netbeans.apache.org/download/index.html)**, etc.

En nuestro caso vamos a utilizar **Netbeans**:
 #### Instalacion en windows 🛒
Desde la web de **Netbeans** podemos descargar la ultima versión.
<https://netbeans.apache.org/download/index.html>

<br>

 #### Instalación en Ubuntu 🐧
- **Instalamos el paquete snap**
`````
sudo apt install snap
`````



- **Instalamos netbeans utilizando el administrador de paquetes snap**
`````
sudo snap install netbeans --classic
`````

