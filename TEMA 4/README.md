# TEMA 4 (Programación orientada a objetos)
Un  programa orientado a  objetos  es,  esencialmente, una  colección de objetos que se crean, interaccionan entre sí y dejan de existir cuando ya no son útiles durante la ejecución de un programa.

Las **características fundamentales de la P.O.O**, también conocidas como “pilares en los que se basa la P.O.O” son:

* **Abstracción.** Mediante la creación de clases, que son los elementos abstractos del programa informático.
Encapsulamiento. Permite ocultar la implementación (cómo es su código) de las clases ofreciendo al programador una serie de funciones para interaccionar con los objetos.
* **Herencia.** Todas las clases Java se estructuran formando jerarquías de clases, en forma de árbol. Esta características permite la reutilización de código. Por ejemplo, imaginemos una clase Cliente, ya implementada. Si quisiéramos crear la clase ClienteVip, podríamos utilizar la clase Cliente y añadir sólo lo referente a ClienteVip. Esta forma de crear nuevas clases a partir de otras es la base de la herencia en Java, ya que unas clases heredan características de otras.
* **Polimorfismo.** Hace referencia a la posibilidad de enviar mensajes sintácticamente iguales a objetos diferentes. No se debe confundir con la sobrecarga de métodos.

Entre las ventajas que aporta este tipo de programación se encuentran:

* **Modularidad.** El código de una clase se puede mantener y reescribir sin tener que tocar el código de otras clases.
* **Reutilización de código.** Podemos hacer uso de clases y objetos diseñados por terceras personas sin saber el código que contienen, haciendo uso de su interfaz.
* **Ocultación de información.** En la POO debemos ocultar los atributos de los objetos y acceder a ellos a través de sus métodos.


##  Clases
Para definir una clase en Java, se utiliza la palabra reservada **class**:
~~~java
/* Esta clase define la figura geométrica círculo */

public class Circulo {  // Declaración de la clase

//Definición de la clase: atributos + métodos

int x;
int y;
int radio;

}
~~~

Una vez creada la clase se pueden crear objetos a partir de ella, a la creacion de objetos se le denomina instanciación.
~~~java
/* Creacion de un objeto tipo Circulo */
Circulo circulo1;

/*Para crear un objeto y asignarlo a un espacio de memoria deberemos de hacer la instanciacion del objeto con el operando new*/
circulo1 = new Circulo(); 
~~~
> el operando **'new'** nos permite crear nuevos objetos, creando asi su propio espacio de memoria


* ### Elementos de una clase
  #### Atributos
  La información de un objeto se almacena en atributos. Los atributos pueden ser de tipos primitivos de Java o de tipo objeto.

  ~~~java
    public class Vehiculo {
        String matricula; 	
        String marca; 	
        String modelo; 	
        String color; 	
        double tarifa;
        boolean disponible;
        /*Tambien se puede poner otro objeto como atributo*/
        Puerta puerta;
    }
  ~~~

  #### Métodos
  Además de  definir los  atributos de  un  objeto, es  necesario definir los métodos que determinan su comportamiento. Existe un método especial en todas las clases denominado **constructor** que se encarga de “crear” objetos en una clase.

  ~~~java
    public class Vehiculo {
        String matricula; 	
        String marca; 	
        String modelo; 	
        String color; 	
        double tarifa;
        boolean disponible;

        // el método constructor parametrizado de la clase Vehiculo 
        public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
            this.matricula = matricula; this.marca = marca; 
            this.modelo = modelo; this.color = color; 
            this.tarifa = tarifa;
            this.disponible = false;
        }
        // el método constructor por defecto de la clase Vehiculo
        public Vehiculo(){
        }
    }
  ~~~
  > **this** Hace refencia a los atributos de la clase, es para indicar que this.modelo es el atributo declarado en la clase

  Para utilizar un constructuor parametrizado sería tal que así:
  > Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0;
  
  Las clases por defecto **"POJO"** **Plain Old Java Object** deberían tener un **constructor por defecto** y otro **parametrizado**, y los **metodos getters y setters**.

  Los metodos **getters** y **setters** son metodos que nos permiten modificar los valores de los atributos sin acceder directamente a ellos, es decir, si tenemos un atributo en privado no podremos acceder desde el propio objeto a ese atributo, tendríamos que hacerlo desde los metodos getter y setter.
  > Este es un principio de la **POO**, **la ocultacion de datos**

  <br>

  Basandonos en la clase del ejemplo anterior:
  ~~~java
    Vehiculo vehiculo= new Vehiculo();
    vehiculo.modelo = "Seat"; /*No podríamos acceder ya que el atributo esta en private*/
    vehiculo.setModelo("Seat"); /*Así sería la forma correcta de cambiar el valor del atributo modelo del vehiculo*/
  ~~~

  Los metodos getter y setter no son mas que:
  ~~~java
    public String getModelo(){
        return this.modelo; //Devuelve el valor del atributo modelo
    }

    public void setModelo(String modelo){
        this.modelo = modelo; //Le cambia el valor al atributo modelo por el parametro que le pasemos
    }
  ~~~

  <br>

  Tambien podríamos crear diferentes tipos de metodos, basandonos en lo siguiente:
  * **Visibilidad**, se refiere a la visibilidad de llamada respecto al objeto
  * **Valor de retorno**, se indica el tipo de valor que vamos a devolver
  * **Parametros**, los parametros o variables auxiliares que le pasamos al metodo
  ~~~java
    /*
    public, private, protected o default sería la visibilidad
    void es el valor de retorno, en este caso void no devuelve nada
    numero es el parametro pasado en el metodo
    */
    public void imprimirPorConsola(int numero){
        System.out.println(numero);
    }
  ~~~
  **Tabla de visibilidad**:
  |  	| En la propia <br>clase 	| Paquete 	| Subclase<br>(mismo paq.) 	| Subclase<br>(dif. paq.) 	| Total 	|
  |---	|---	|---	|---	|---	|---	|
  | public 	| + 	| + 	| + 	| + 	| + 	|
  | protected 	| + 	| + 	| + 	| + 	|  	|
  | no modifier / default 	| + 	| + 	| + 	|  	|  	|
  | private 	| + 	|  	|  	|  	|  	|

##  Objetos
Un  objeto  se  compone  de  **atributos**  y  **métodos**, y es accesible mediante su identificador. Por lo tanto un objeto tiene las siguientes características:

* **Identidad**. Cada objeto es único y diferente, y se accede a él mediante su nombre o identificador. Por ejemplo, vehiculo1 y vehiculo2 son identificadores.
* **Estado**. Vendrá determinado por los valores de los atributos del objeto. Por ejemplo vehiculo1 tiene como estado matricula “4050 ABJ”, marca “VW”, modelo “GTI”, etc.
* **Comportamiento**. Son los métodos (funciones) que realiza dicho objeto. Para vehiculo1 el comportamiento viene definido por los métodos get, set y su constructor. 

El siguiente código Java crea el objeto vehiculo1 y muestra su matrícula y su tarifa. A continuación modifica la tarifa a 90.0 euros y la muestra de nuevo.
~~~java
Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW","GTI", "Blanco",100.0);

System.out.println("Matricula: " + vehiculo1.getMatricula()); 
System.out.println("Tarifa: " + vehiculo1.getTarifa());

vehiculo1.setTarifa(90.0); 
System.out.println("Matricula: " + vehiculo1.getMatricula()); 
System.out.println("Tarifa: " + vehiculo1.getTarifa());

/*
Output:
Matrícula     : 4050 ABJ 
Tarifa        : 100.0
Matrícula     : 4050 ABJ 
Tarifa        : 90.0
*/
~~~

pagina 12