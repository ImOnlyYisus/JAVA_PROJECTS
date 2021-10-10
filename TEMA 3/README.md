# TEMA 3 (Estructuras de control)

## Estructura de selección

* **Estructura if**
La **estructura if** se denomina estructura de selección única porque ejecuta un bloque de sentencias **sólo cuando se cumple la condición del if**. Si la **condición es verdadera se ejecuta el bloque** de sentencias. Si la condición es **falsa, el flujo del programa continúa** en la sentencia inmediatamente **posterior al if**.

    <br>

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

* **Estructura if else**
Si **se cumple la condición**, **se ejecuta el bloque de sentencias asociado al if**. Si la **condición no se cumple**, entonces se **ejecuta el bloque de sentencias asociado al else**.

    <br>

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
    _Comprobar la entrada a una atracción de un parque, se pide que la edad supere los 16 años y que la altura sea minimo 1,50m._
    ~~~java
    if(edad>16 && altura>=1.50){ //Solo si cumple esos requisitos podrá entrar
        System.out.println("Acceso permitido");
    }
    else{
        System.out.println("Acceso denegado");
    }
    ~~~