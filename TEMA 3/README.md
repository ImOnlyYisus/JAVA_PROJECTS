# TEMA 3 (Estructuras de control)

## Estructura de selección

* ### **Estructura if**

    La **estructura if** se denomina estructura de selección única porque ejecuta un bloque de sentencias **sólo cuando se cumple la condición del if**. Si la **condición es verdadera se ejecuta el bloque** de sentencias. Si la condición es **falsa, el flujo del programa continúa** en la sentencia inmediatamente **posterior al if**.

    La sentencia if tiene la siguiente sintaxis:
    ~~~java
    if (condicion) {
        bloque-de-sentencias
    }
    ~~~
    ~~~java
    if (calificacion == 10) {  //Solo se ejecutaria la el sout si la calificacion es igual a 10
	    System.out.println("Matrícula de Honor");
    }
    ~~~

* ### **Estructura if else**

    Si **se cumple la condición**, **se ejecuta el bloque de sentencias asociado al if**. Si la **condición no se cumple**, entonces se **ejecuta el bloque de sentencias asociado al else**.

    Una sentencia if-else tiene la siguiente sintaxis:
    ~~~java
    if (condicion) {
        bloque-de-sentencias-if
    }
    else {
        bloque-de-sentencias-else
    }
    ~~~
    ~~~java
    if (numero % 2 == 0){  //Se ejecutará solo si el numero es par, en el otro caso se ejecuta el else
        System.out.println("El número es par");
    }
    else{
        System.out.println("El número es impar");
    }
    ~~~
    > Se puede poner obviar los **"{}"**, es decir:
    >~~~java
    >if(condicion)
    >    System.out.println(...);
    >else
    >    System.out.println(...);
    >~~~

    **Ejemplo uso if-else:**
        <br>
        _Comprobar la entrada a una atracción de un parque, se pide que la edad supere los 16 años y que la altura sea minimo 1,50m._
    ~~~java
    if(edad>16 && altura>=1.50){ //Solo si cumple esos requisitos podrá entrar
        System.out.println("Acceso permitido");
    }
    else{
        System.out.println("Acceso denegado");
    }
    ~~~

* ### **Estructura if else if**

    La estructura **if-else-if** se puede aplicar en los mismos casos en que se utiliza un  if-else anidado. Esta estructura permite escribir de  forma abreviada las condiciones de un if-else anidado.

    Una sentecia if-else-if tiene la siguiente sintaxis:
    ~~~java
    if (condicion-1) {
        bloque-de-sentencias-condicion-1
    } else if (condicion-2) {
        bloque-de-sentencias-condicion-2
    } else {
        bloque-de-sentencias-else
    }
    ~~~

    **Ejemplo uso if-else-if:**
    Por ejemplo para calificaciones:
    ~~~java
    if (calificacion == 10) { 
	    System.out.println("Matrícula de Honor");
    } 
    else if (calificacion == 9)  { 
	    System.out.println("Sobresaliente");
    } 
    else if (calificacion >= 7) { 
	    System.out.println("Notable");
    } 
    else if (calificacion == 6) { 
	    System.out.println("Bien");
    } 
    else if (calificacion == 5) {
        System.out.println("Aprobado");
    } 
    else { 
	    System.out.println("Suspenso");
    }
    ~~~

* ### **El operador condicional (ternario)**

    El **operador condicional ( ?: )** se relaciona con la **estructura if-else**. Es el único operador de Java que utiliza tres operandos. El **primer operando es una condición lógica**, el **segundo es el valor que toma la expresión** cuando la condición es **true** y el **tercero es el valor** que toma la expresión cuando la condición es **false**.

    El operador condicional tiene la siguiente sintaxis:
    ~~~java
    condicion-logica ? valor-si-verdadero : valor-si-falso;

    //Es lo mismo que utilizar if-else, en este caso sería
    if(condcion-logica)
        valor-si-verdadero;
    else
        valor-si-falso;
    ~~~
    >La **condición lógica** también se puede expresar entre **paréntesis**:
    >>~~~java
    >>(condicion-logica)? valor-si-verdadero : valor-si-falso;
    >>~~~

    **Ejemplo uso operador condicional (ternario):**
    ~~~java
    int edad = 16; //Declaracion de variables
    String txt;

    txt = (edad >= 18) ? "Mayor de edad" : "Menor de edad"; //Condicion ser mayor o igual a 18 años

    System.out.print(txt); //Resultado = Menor de edad
    ~~~

* ### **Estructura switch**
    La **estructura switch** es una **estructura de selección múltiple** que permite seleccionar un bloque de sentencias entre varios casos. En cierto modo, es parecido a una estructura de if-else anidados. La diferencia está en que la selección del bloque de sentencias depende de la evaluación de una expresión que se **compara por igualdad con cada uno de los casos**.

    La estructura **switch** consta de una expresión y una serie de etiquetas case y una opción _**default**_. La sentencia _**break**_ indica el final de la ejecución del switch.

    Una sentencia switch tiene la siguiente sintaxis:
    ~~~java
    switch (expresion) {
	    case valor-1:
		bloque-de-sentencias-1;
            break;

	    case valor-2:
		bloque-de-sentencias-2;
		break;

 	    case valor-3: 
		bloque-de-sentencias-3;
		break;

	    default:
		bloque-de-sentencias-default;		
		break;
    }
    ~~~
    Por ejemplo, las calificaciones del ejemplo de antes se podrían poner de la siguiente forma:
    ~~~java
    switch (calificacion) {
        case 0: 
        case 1: 
        case 2: 
        case 3:
        case 4:   //Si la calificacion es igual a (0,1,2,3,4) esta Suspenso
            System.out.println("Suspenso");
            break;

        case 5:   //Si la calificacion es igual a 5 esta Aprobado
            System.out.println("Aprobado");
            break;

        case 6:   //Si la calificacion es igual a 6 es un Bien
            System.out.println("Bien");
            break;

        case 7:
        case 8:   //Si la calificacion es igual a 7 o 8 es Notable
            System.out.println("Notable");
            break;

        case 9:   //Si la calificacion es igual a 9 esta Sobresaliente
            System.out.println("Sobresaliente");        
            break;

        case 10:  //Si la calificacion es igual a 10 esta Matricula
            System.out.println("Matrícula”); 
            break;

        default:  //Si la calificacion es distinto a lo anterior
            System.out.println("No presentado");
            break;
    }
        

    ~~~