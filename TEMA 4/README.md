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
  |  	| En la propia <br>clase 	| Paquete 	| Subclase<br>(mismo paq.) 	| Subclase<br>(dif. paq.) 	| Todos 	|
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
#### Referencia a null
Una referencia a un objeto puede no tener asignada una instancia. Esto puede ocurrir porque se ha declarado el objeto pero no se ha instanciado, es decir no se ha creado un objeto con el operador new. Existe un valor especial, llamado null que indica que un objeto no se ha instanciado.
~~~java
Vehiculo vehiculo1; 

// el objeto vehiculo1 se declara pero no se instancia

// la instancia se crea utilizando el operador new
Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "León", "Negro",80.0);

if (vehiculo1 == null) {
  System.out.print("vehiculo1 es una referencia null")
}
if (vehiculo2 != null) { 
  System.out.print("vehiculo2 está instanciado")
}

~~~

#### Referencia a otros objetos (alias)
Un objeto puede tener varias referencias o nombres. Un alias es otro nombre que referencia al mismo objeto. Un alias es una referencia más al mismo espacio de memoria del objeto original. Por ejemplo, si se crea el objeto  vehiculo1 y  después  se  declara  otro  objeto  vehiculo3 y  a continuación se asigna la referencia de vehiculo1 a vehiculo3, entonces vehiculo3 es un alias de vehiculo1. Esto significa que el espacio de memoria de vehiculo1 y vehiculo3 es el mismo.
~~~java
Vehiculo vehiculo1 = new Vehiculo("2345 JVM", "SEAT", "León", "Negro",80.0);
Vehiculo vehiculo2 = vehiculo2; //Alias, este objeto apunta a la misma direcion de memoria que vehiculo1

//Si modificamos algo de vehiculo1
vehiculo1.setMarca("MERCEDES");
System.out.print(vehiculo1);
System.out.print(vehiculo2); //Al ser un alias tambien cambiaría su valor

//Si modificamos algo del vehiculo2
vehiculo2.setMarca("RENAULT");
System.out.print(vehiculo2);
System.out.print(vehiculo1);
//Cambiaría el valor del objeto principal, ya que esta apuntando al mismo espacio de memoria
~~~
> **Consejo**: para poder copiar un objeto si que sea un alias deberemos crear un objeto nuevo y asignarle los mismo valores.

#### Ciclo de vida de un objeto
El ciclo de vida de un objeto empieza por su **declaración**, su **instanciación** y su **uso** en un programa Java hasta que finalmente **desaparece**.
Cuando un objeto deja de ser utilizado, Java libera la memoria asignada al objeto y la reutiliza. Java cuenta con un sistema recolector de basura que se encarga de liberar los objetos y los espacios de memoria que ocupan cuando éstos dejan de ser utilizados en un programa.

## Atributos
Los atributos son los elementos que almacenan el estado de un objeto. Se definen de la misma forma que las variables, pero dentro del bloque de la clase.
Existen dos tipos de atributos: 
* **Los atributos de clase**: existen siempre, no hace falta la instanciacion de un objeto para ser llamados. Se declaran utilizando _**static**_
  ~~~java
  public class Vehiculo{
    public static numeroVehiculos=0; //Un atributo que almacena cuantos coches han sido instanciados
  }

  //En el main para llamarlo no hace falta crear un nuevo objeto
  System.out.print(Vehiculo.numeroVehiculos);
  ~~~
* **Los atributos de objeto**: existen siempre y cuando el ciclo de vida del objeto permanezca, se crean con la instanciacion del objeto. Estos atributos no tienen una palabra reservada.
  ~~~java
  public class Vehiculo{
    public String marca = "Mercedes";
  }

  //En el main para llamarlo hace falta instanciar un nuevo objeto
  Vehiculo v1 = new Vehiculo();
  System.out.print(v1.marca);
  ~~~

> Los atributos puedes darles o no valor, en el caso de que no se de valor se declaran por defecto, es decir objetos en null, int,double,float... en 0 y boolean en false

## Métodos
Los  métodos  son  funciones  que  determinan el  comportamiento de  los objetos. Un objeto se comporta de una u otra forma dependiendo de los métodos de la clase a la que pertenece.
Existen tres tipos de métodos:
* **Constructores**: Como he mencionado antes, permiten instanciar objetos de una clase
* **Métodos de consulta**:sirven para extraer información de los objetos
* **Métodos modificadores**:sirven para modificar el valor de los atributos del objeto y las operaciones definen el comportamiento de un objeto.
~~~java
public class Circulo {
  public static final double PI = 3.1415926536;
  private double radio;

  public Circulo(double radio) { //Metodo modificador, cambia el valor del radio por el pasado por parametro
    this.radio = radio;
  }


  public double getRadio() { //Metodo de consulta, devuelve el radio del objeto
    return this.radio;
  }


  public double calcularPerimetro() { //Metodo de operacion
    return 2 * PI * this.radio;
  }


  public double calcularArea() { //Metodo de operacion
    return PI * this.radio * this.radio;
  }
}
~~~
#### Declaración de métodos
La declaración de un método indica si el método necesita o no argumentos. Los  métodos **‘get’** no tienen argumentos y devuelven un valor, los métodos **‘set’**  necesitan un argumento para indicar el valor del atributo que van a modificar.

El método _**setTarifa(double tarifa)**_ tiene un argumento. El nombre de este parámetro es _**tarifa**_ y su tipo es _**double**_.

Un método se declara con la siguiente sintaxis:
**tipo-de-acceso [static] tipo_devuelto nombre (lista-parametros);**

El **tipo de acceso** puede ser **private, public protected o no especificado**, al igual que en los atributos. No es obligatorio especificarlo.
Si el **método devuelve un valor** se debe indicar su **tipo_devuelto**. Este valor puede ser de un tipo **primitivo** de Java o el **identificador de una clase**

La lista de parámetros puede declarar una o más variables separadas por una coma. El tipo puede ser un tipo primitivo de Java o el identificador de una clase.
#### El valor de retorno
Un método puede devolver un valor. Los métodos que no devuelven un valor se declaran _**void**_, mientras que los métodos que devuelven un valor indican el tipo que devuelven, por ejemplo: _**int, double, char, String o un tipo de objeto**_.
#### Parámetros y argumentos
Los parámetros de un método definen la cantidad y el tipo de dato de los valores que recibe un método para su ejecución. Un método puede tener tantos parámetros como sea necesario.

Por  ejemplo,  el  método  constructor de  la  clase  _**Vehiculo**_ tiene  cinco parámetros, la matrícula, la marca, el modelo, el color del vehículo y su tarifa. Los parámetros _**matricula, marca, modelo y color**_ son de tipo String, _**tarifa**_ es de tipo double.
~~~java
public Vehiculo(String matricula, String marca, String modelo, String color,double tarifa) {

}
~~~

#### Paso de parámetros (por valor y por referencia)
Cuando se invoca un método se hace una copia de los valores de los argumentos en los parámetros. Esto quiere decir que si el método modifica el valor de un parámetro, nunca se modifica el valor original del argumento. Este paso de parámetros se conoce como **paso por valor**. 

Cuando se pasa una referencia a un objeto se crea un nuevo alias sobre el objeto, de manera que esta nueva referencia utiliza el mismo espacio de memoria del objeto original y esto permite acceder al objeto original. Este paso de parámetros se conoce como **paso por referencia**.
Por  ejemplo,  el  método  _**recibirVehiculoAlquilado(Vehiculo v)**_ recibe el parámetro _**v de tipo Vehiculo**_. Si el método modifica el estado del objeto _**v**_, en realidad modifica el estado del objeto original _**vehiculo1**_ que recibe como argumento.

#### Sobrecarga de métodos
La sobrecarga de métodos es útil para que el mismo método opere con parámetros de distinto tipo o que un mismo método reciba una lista de parámetros diferente. Esto quiere decir que puede haber dos métodos con el mismo nombre que realicen dos funciones distintas. La diferencia entre los métodos sobrecargados está en su declaración.
~~~java
public void calcularDinero(double dinero){
  ...
}
public void calcularDinero(){
  ...
}
~~~





