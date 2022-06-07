# TEMA 5 (Programación orientada a objetos)

### Arrays
Java proporciona una estructura de almacenamiento denominada array que permite almacenar muchos tipos primitivos u objetos de la misma clase e identificarlos con el mismo nombre.
La declaración de un array tiene la siguiente sintaxis:
~~~java
/*
tipo-o-clase[] identificador-array;

o

tipo-o-clase identificador-array[];
*/

int[] numeros = new int[3];
Vehiculos[] listaVehiculos = new int[3];
~~~

>**Consejo:** tambien se puede declarar **'int numeros[]'**, aunque la mejor forma es la anterior
>**Mucho ojo con los corchetes, indican que es un array!!**

Para declarar un array debemos de pasarle el tamaño de objetos que contendrá.
Es decir, si queremos almacenar 10 numeros tendriamos que crear un array de tamaño 10:
~~~java
int[] numeros = new int[10]; //--> aqui indicamos la cantidad de elementos que va a guardar
~~~

Para darle valores al array deberemos acceder a sus posiciones, es decir, imaginemos que tenemos una pila dividida en 10 posiciones, cada posicion va a contener un valor:
| Index 	| 0 	| 1 	| 2 	| 3 	| 4 	| 5 	| 6 	| 7 	| 8 	| 9 	|
|---	|---	|---	|---	|---	|---	|---	|---	|---	|---	|---	|
| Values 	| a 	| b 	| c 	| d 	| e 	| f 	| g 	| h 	| i 	| j 	|

>**Indices**: son las posiciones de acceso de un array
>**Valores**: son los valores que contienen en cada indice
>Viendo el ejemplo de la tabla, en la posicion o indice 0 tendríamos el valor de 'a', en el indice 1 valor de 'b'... asi hasta la ultima posicion que seria 9 con el valor de 'j'
>>**MUCHO CUIDADO!!** si nos fijamos bien el array es de tamaño diez, pero el ultimo indice no es 10, es 9 debido a que en los arrays los indices siempre empiezan por 0

En el codigo la tabla anterior sería de tal forma:
~~~java
char[] listaLetras = new char[10]; //Le indicamos que va a contener 10 letras, por lo que el tamaño será de diez

//Para dar valores
listaLetras[0] = 'a'; //Accedemos a la posicion que queramos y le damos el valor que queramos
listaLetras[1] = 'b';
listaLetras[2] = 'c';
listaLetras[3] = 'd';
listaLetras[4] = 'e';
listaLetras[5] = 'f';
listaLetras[6] = 'g';
listaLetras[7] = 'h';
listaLetras[8] = 'i';
listaLetras[8] = 'j';

//Para imprimir
System.out.print(listaLetras[0]) //Accedemos a la posicion que queremos mostrar, en este caso 0

//Imprimos todos los valores con un bucle
//Entrará en el bucle siempre que i sea < a 10
for(int i=0; i<listaLetras.length; i++){
    System.out.print(listaLetras[i])
}
~~~

>Si nos fijamos hemos utilizado **listaLetras.length** que nos devuelve el tamaño del array, **length** es un metodo que tiene la clase Arrays y nos permite ver el tamaño del array y operar segun necesitemos.

Otra forma de declarar y dar valor a las variables es directamente pasar el array cuando lo creamos:
~~~java
char[] listaLetras = {'a','b','c','d','e','f','h','i','j'}
~~~

#### Excepciones comunes cuando trabajamos con Arrays
Java cuando opera con arrays guarda exclusivamente en memoria solo los espacios que necesite, es decir si el array es de tamaño 10 solo va a guardar 10 espacios para asignarle un valor.
En el caso de que accedamos a una posicion inexistente Java nos soltará una excepción **ArrayIndexOutOfBoundsException**. Esto se solucionaría mendiante un uso correcto de bucles y condiciones, intentando que nunca pueda acceder a **-1** y **array.legth + 1**

#### Ordenación de Arrays
Una de las operaciones más comunes con arrays es la ordenación de sus elementos. Un algoritmo de ordenación clasifica un conjunto de datos de forma ascendente o descendente, según un criterio.
Hay muchos tipos de algoritmos de ordenación entre los mas comunes están **BubbleSort** y **QuickSort**.
>Página interesante que muestra como funcionan los algoritmos de ordenacion paso por paso, https://visualgo.net/en/sorting

Java utiliza en su metodo **sort**, **quickSort** que basicamente el algoritmo que realiza es dividir recurvisamente el array en partes iguales, indicando un elemento de inicio, fin y un pivote (o comodín) que nos permitira segmentar nuestra lista. Una vez dividida, lo que hace, es dejar todos los mayores que el pivote a su derecha y todos los menores a su izq.

#### Busqueda binaria
La busqueda de un elemento es lo mas común en arrays, podríamos hacerlo manualmente con un bucle y buscar el elemento que queramos, aunque Java incorpora un metodo que trabaja con mucha eficiencia el cual es **binarySearch**.
BinarySearch requiere que el Array este si o si ordenado para poder buscar correctamente.
El algoritmo que utiliza binarySearch es separar la lista en dos mitades, y compará la ultima posición de la primera parte para ver si es mas grande o mas chico, en el caso de que sea mas chico descarta la segunda lista, en el otro caso descarta la primera, asi continuamente quitandose del medio mucha cantidad de informacion por comparar.

#### Metodos de Arrays
La clase Arrays contiene muchos metodos que nos son utiles a la hora de operar con ellos.
>Vease la API de java con todos los metodos, https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

### Arrays multidimensionales (Mátrices)

