# TEMA 2 (Estructura y elementos de un programa)

## - ESTRUCTURA DE UN PROGRAMA JAVA
- **Comentarios**
~~~
//Esto es un comentario de línea

/*
Esto es un comentario de varias líneas
*/
~~~

- **Definicion de la clase**
~~~
public class HolaMundo {
    ...
}
~~~
- **Definición del metodo main()**
~~~
public class HolaMundo {
    public static void main (String[] args) { 
        //Codigo para ejecutar
    }
}
~~~
_Un atajo de teclado para definir el metodo main() en **Netbean** es **[psvm + Tab]**_

- **Sentencia o código para ejecutar**
Va dentro del metodo main():
~~~
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
~~~
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
````
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
~~~
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
~~~
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
~~~
String precio = “Total: $“ + (3+2+1);
System.out.println(precio);  // Total: $6
~~~

