# TEMA 2 (Estructura y elementos de un programa)

## - ESTRUCTURA DE UN PROGRAMA JAVA
- **Comentarios**
~~~java
//Esto es un comentario de línea

/*
Esto es un comentario de varias líneas
*/
~~~

- **Definicion de la clase**
~~~java
public class HolaMundo {
    ...
}
~~~
- **Definición del metodo main()**
~~~java
public class HolaMundo {
    public static void main (String[] args) { 
        //Codigo para ejecutar
    }
}
~~~
_Un atajo de teclado para definir el metodo main() en **Netbean** es **[psvm + Tab]**_

- **Sentencia o código para ejecutar**
Va dentro del metodo main():
~~~java
public class HolaMundo {
    public static void main (String[] args) { 
        System.out.println("Hola Mundo");
    }
}
~~~

<br>

## - VARIABLES Y TIPOS DE PRIMITIVOS
Para declarar una variable en **JAVA**, debemos indicar el tipo de variable y el nombre para asignarle.
Podemos inicializarla cuando la creemos o a lo largo del programa.
- **Variable y incialización**
~~~java
int var1 = 10; //Declaración y incialización en una misma línea

double var2; //Declaración de la variable
var2 = 30.2; //Inicializacion de la variable
~~~

- **CamelCase**
CamelCase es el conjunto de normas que debemos llevar para asignar los nombres a nuestas variables:
     - Los **nombres de variables y métodos** empiezan con minúsculas. Si se trata de un nombre compuesto cada palabra debe empezar con mayúscula y no se debe utilizar el guión bajo para separar las palabras. _calcularSueldo, setNombre, getNombre_
    - Los  **nombres  de  clases**  empiezan  siempre  con  mayúsculas. _PerimetroCircunferencia, Profesor, Alumno_
    - Los **nombres de constantes** se escriben en mayúsculas. Para nombres compuestos se  utiliza  el  guión  bajo  para  separar  las  palabras. _PI,  MINIMO,  MAXIMO o  TOTAL_ELEMENTOS_
    
<br> 

- **Tipos primitivos**
    - **Números enteros** (int, long, short y byte)
    - **Números reales** (float y double)
    - **Cáracteres** (char)
    - **Booleano** (true y false)

|  Tipo             |  Descripción              |  Valor mínimo y máximo                               |
|-------------------|---------------------------|------------------------------------------------------|
| Byte - 8bits      | Entero con signo          | -128 a 127                                           |
| Short – 16 bits   | Entero con signo          | -32768 a 32767                                       |
| Int – 32 bits     | Entero con signo          | -2147483648 a 2147483647                             |
|  Long – 64 bits   |  Entero con signo         | -922117036854775808L a +922117036854775807L          |
|  Float – 32 bits  |  Real de precisión simple | ±3.40282347e+38F a ±1.40239846e-45F                  |
|  Double – 64 bits |  Real de precisión doble  | ±1.7976931348623157e+309 a ±4.94065645841246544e-324 |
| char - 16 bits    | Caracteres Unicode        | \u0000 a \uFFFF                                      |
| boolean - 1 bit   | Valores lógicos           | true, false                                          |

<br>

_**Resumen:**_
````java
int variableTipoInt = 2;
short variableTipoShort = 3;
long variableTipoLong = 24_000_000L; //Las "_" es para visibilidad de un numero grande
byte variableTipoByte = 14;

float variableTipoFloat = 14.5f;
double variableTipoDouble = 13.8;

boolean variableTipoBoolean = true;

char variableTipoChar = a;
````

- **Caracteres especiales**

|  Carácter |  Significado               |
|-----------|----------------------------|
| \b        | Retroceso                  |
| \t        | Tabulador                  |
| \n        | Salto de línea             |
| \r        | Salto de línea             |
| \"        | Carácter comilla doble     |
| \'        | Carácter comilla simple    |
| \\        | Carácter barra hacia atrás |

_**Ejemplos:**_
~~~java
String texto = “Hola”;
System.out.println(texto + “\b”); // Hol
	
String texto = “Hola”;
System.out.println(“\t” + texto); // [TAB]Hola

String texto = “Hola\nAdios”;
System.out.println(texto); //Hola 
                            Adios
~~~

- **Concatenación**
Para concatenar en **Java**, es decir poder juntar variables y texto por decirlo de una manera, se utilizan **"+"**.
_Ejemplo:_
~~~java
public class EdadPersona {
    public static void main (String[] args) {
        int edadPersona = 15;
        String nombrePersona = "Pablo";
        System.out.println("La edad de " + nombrePersona + "es de -->" + edadPersona);
    }
}
~~~
>Con **System.out.println()** o **System.out.print()** podemos sacar el texto por consola, la diferencia es que uno imprime y luego hace un salto de línea, y el otro no hace el salto de línea

## - OPERADORES
- **Operadores Aritmeticos**

|  Operador |  Operación aritmética                      |
|-----------|--------------------------------------------|
| +         | Suma de números y concatenación de cadenas |
| -         | Resta                                      |
| *         | Producto                                   |
| /         | División                                   |
| %         | Módulo o resto                             |

_Ejemplo:_
~~~java
String precio = “Total: $“ + (3+2+1);
System.out.println(precio);  // Total: $6
~~~

- **Operadores aritméticos unarios y compuestos**

|  Operador |  Operación |  Equivale a |
|-----------|------------|-------------|
| ++        | a++        | a = a + 1   |
| --        | a--        | a = a - 1   |
| +=        | a+=b       | a = a + b   |
| -=        | a-=b       | a = a - b   |
| *=        | a*=b       | a = a * b   |
| /=        | a/=b       | a = a / b   |
| %=        | a%=b       | a = a % b   |

La siguiente tabla muestra ejemplos de uso de los operadores unarios y de los operadores compuestos o de asignación.

|  Expresión |  Equivale a |  Significado                                |
|------------|-------------|---------------------------------------------|
| x++        | x = x + 1   | Suma 1 al valor de x                        |
| x+=5       | x = x + 5   | Suma 5 al valor de x                        |
| y-=2       | y = y - 2   | Resta 2 al valor de y                       |
| z*=10      | z = z * 10  | Multiplica por 10 el valor de z             |
| a/=b       | a = a / b   | Divide a entre b                            |
| c%=3       | c = c % 3   | Calcula  el  módulo  de  c dividido entre 3 |

<BR>

- **Operadores de relación**
Los operadores de relación permiten comparar dos o más valores.

|  Operador |  Significado  |  Ejemplo   |
|-----------|---------------|------------|
| ==        | Igual         | nota == 10 |
| <         | Menor que     | nota < 5   |
| >         | Mayor que     | nota > 9   |
| <=        | Menor o igual | nota <= 7  |
| >=        | Mayor o igual | nota >= 5  |
| !=        | Distinto de   | nota != 0  |

<BR>

- **Operadores lógicos o booleanos**
Java utiliza tres operadores lógicos: el **O lógico (disyunción)**, el **Y lógico (conjunción)** y la **negación**.

    * La **negación (!)** devuelve true si el operando es false.

    * El **Y lógico (&&)** devuelve false si uno de los operandos es false.

    * El **O lógico (||)** devuelve true si uno de los operandos es true.

> ###  Orden de precedencia de los operadores
>> La siguiente tabla muestra el orden de prioridad de los operadores. Indica qué operador se aplica primero en una expresión.
>> |  Operador        |  Descripción                                     |
>> |------------------|--------------------------------------------------|
>> | ++ -- !          | Operadores unarios, negación                     |
>> | * / %            | Producto, división, módulo                       |
>> | + -              | Suma, resta                                      |
>> | < > <= >=        | Menor, mayor, menor o igual, mayor igual         |
>> | == !=            | Igual, diferente                                 |
>> | &&               | Operador lógico AND                              |
>> | \|\|             | Operador lógico OR                               |
>> | ?                | Operador condicional ternario ?                  |
>> | = += -= *= /= %= | Asignación y operadores combinados de asignación |

## - Expresiones aritmético-lógicas
Una expresión aritmético-lógica devuelve un valor lógico verdadero o falso. En este tipo de expresiones se utilizan operadores aritméticos, operadores relacionales y de igualdad. Por ejemplo, una expresión lógica puede ser:
~~~java
(10 – 2) > (5 – 3)
~~~
Por ejemplo, la expresión **3 + 5 < 5 * 2 || 3 > 8 && 7 > 6 – 2** se evalúa en el orden siguiente.

Primero se evalúan las expresiones aritméticas y se obtiene la expresión lógica **8 < 10 || 3 > 8 && 7 > 4**. A continuación se evalúan los operadores relacionales y se obtiene **true || false && true**. Ahora se evalúa el operador Y lógico con los operandos **false && true** y **se obtiene false**. Por último, se evalúa el operador O lógico con los operandos **true || false** y **se obtiene true**, el valor final de la expresión.

## - Conversión de tipos
Habrán casos en los que tendremos que convertir la variable en otro tipo para sacar el resultado correcto, por ejemplo:

_Ver exactamente cuanto dinero se lleva cada persona_
~~~java
int personas = 23;
int dinero = 200_000;

int dineroPorPersona = dinero/personas; 
//Estamos dividiendo int/int por lo que la parte decimal no la obtendremos
//Resultado del programa = 8695
~~~

Para solucionar ese problema podemos hacer tres cosas:
* **Conversión explicita**
~~~java
int personas = 23;
int dinero = 200_000;

double dineroPorPersona = (double) dinero/personas; //Forzamos una variable para convertirla en double
//Importante guardarla en un double, si no, daría un error
//Resultado del programa = 8695.652173913043
~~~

* **Conversión implicita**
Esta conversion consiste en meter primitivos menores en primitivos mayores, es decir:
~~~java
long numero1 = 23; 
//Estamos metiendo dentro de un long un int, al ser el int de 32 bits cabría en un long de 64bits
~~~

## - Entrada de datos por teclado
* **Clase Scanner**
Para utilizar la **clase Scanner** de la API de Java, debemos importarlo **"import java.util.Scanner"**, luego deberemos incializar un objeto **"new Scanner(System.in)"** y por ultimo utilizar los metodos que tiene el objeto para pedir datos, entre ellos **nombreObjeto.nextLine(), nombreObjetoNextInt(), nombreObjetoNextDouble()**...
~~~java
import java.util.Scanner; //Importamos la clase Scanner

public class EntradaDatosTeclado {

    public static void main(String args[])  { 

        // Inicialización de la instancia de Scanner con el flujo de entrada del teclado
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.print("¿Cómo te llamas?");
        String nombre = entradaTeclado.nextLine(); //Lo guardamos en un String que es lo que devuelve


        System.out.print("¿Qué día naciste?");
        int diaNacimiento = entradaTeclado.nextInt(); //Lo guardamos en un Int que es lo que nos devuelve


        System.out.print("¿En qué mes?");
        int mesNacimiento = entradaTeclado.nextInt();


        System.out.print("¿En qué año?");
        int anioNacimiento = entradaTeclado.nextInt();


        System.out.println("Hola " + nombre + ", naciste el " +
        diaNacimiento + "/" + mesNacimiento + "/" + añoNacimiento);
    }
}
~~~

* **Clase JOptionPane**
Esta opcion es mas visual que **Scanner** ya que sale una ventana emergente, para utilizarlo al igual que el anterior hay que importar la clase de la API de Java, **"import javax.swing.JOptionPane"**.
Para utilizarlo tenemos que saber que **todo los datos los devuelve en tipo String**.
~~~java
public class parteBJesusNarbona {
    //Main para ejecucion
    public static void main(String[] args) {
        //Codigo para ejecucion
        /*
            Modifica el ejercicio anterior para que la lectura de datos y la salida por pantalla usen diálogos JOptionPane .
            Además, en esta parte, el número de horas anuales de los máster se debe poder introducir por teclado, también usando
            JOptionPane.
        */
        
        //Problema --> Mirar el numero de profesores que necesita segun los grupos de masteres
        //Resultado --> Decir profesores necesarios
        //Introducir numero de horas y numero de masteres
        //Un profesor 150h max
        
        //Constantes
        final int HORAS_MAXIMA_PROFESOR = 150;
        
        //Pregunto cuantos grupos de masteres hay y lo guardo en una variable
        //Uso JOptionPane.showInputDialog()
        String numeroGruposMasteresString = JOptionPane.showInputDialog(null,"¿Cuantos grupos de masteres se van a impartir?");
        
        //Conversion String a int Integer.parseInt()
        int numeroGruposMasteres = Integer.parseInt(numeroGruposMasteresString);
        
        //Pregunto cuantas duracion tienen los masteres
        //Uso JOptionPane.showInputDialog()
        String horasDuracionMasteresString = JOptionPane.showInputDialog(null,"¿Cauntas horas tienen cada master?");
        
        //Conversion String a double Double.parseDouble()
        double horasDuracionMasteres = Double.parseDouble(horasDuracionMasteresString); 
        //paso a double para ahorar una conversion explicita
        
        //Calculamos el numero de profesores segun sus horas y la duracion del master
        double horasTotalesMasteres = horasDuracionMasteres * numeroGruposMasteres;
        double numeroProfesoresTotales = horasTotalesMasteres / HORAS_MAXIMA_PROFESOR; 
        
        //Mostramos el resultado
        //Uso JOptionPane.showMessageDialog();
        JOptionPane.showMessageDialog(null, "Nº MASTERES: " + numeroGruposMasteres 
                + "\nNº DE HORAS MASTER: " + horasDuracionMasteres 
                + "\nNº DE HORAS MAX. PROFESOR: " + HORAS_MAXIMA_PROFESOR
                + "\n\nTOTAL: " + Math.ceil(numeroProfesoresTotales) + " profesores"); //Math.ceil() para redondear al mayor
        
        //Pruebas realizadas
        //nº masteres 25 y nº horas master 975 --> resultado = 163.0 profesores
        //nº masteres 9  y nº horas master 59 --> resultado = 59.0 profesores
        //nº masteres 15 y nº horas 750 --> resultado =  75.0 profesores
        
    }
}
~~~
