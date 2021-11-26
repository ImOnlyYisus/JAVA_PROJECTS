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

    ## Estructura de repetición

    * ### **Bucle while**
        La estructura de repetición while repite el bloque de sentencias mientras la condición del while es verdadera.

        ~~~java
        inicialización;

        while (condición) { 
            bloque-de-sentencias; actualizacion;

        }
        ~~~
        Un ejemplo puede ser imprimir numero del 1 al 10:

        ~~~java
        int numero=0;

        while (numero>=10) { //Condicion que el numero al incrementarse sea 10
            System.out.println(numero);
            System.out.println(",”);
            numero++; //Se incrementa el valor
        }
        ~~~

    * ### **Bucle do while**
        La estructura de repetición do-while ejecuta el bloque de sentencias al menos una vez. Después comprueba la condición y repite el bloque de sentencias mientras la condición es verdadera.

        ~~~java
        inicialización;

        do{ 
            bloque-de-sentencias; actualizacion;

        }while(condicion);
        ~~~
        Un ejemplo puede ser pedir al usuario para acceder a un menu:
        >Se suele utilizar para menu, ya que do while primero hace y luego comprueba la condicion del while

        ~~~java
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Calcular el área de un Cuadrado");
            System.out.println("2. Calcular el área de un Triángulo");
            System.out.println("3. Calcular el área de un Círculo");
            System.out.println("4. Finalizar");

            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
        } while(opcion!=4); //Mientras no pulse el 4 se va a repetir el codigo de dentro
        ~~~

    * ### **Bucle for**
        La estructura de repetición for repite el bloque de sentencias mientras la condición  del  for es  verdadera.  Un  for es  un  caso  particular  de  la estructura while. Solo se debe utilizar cuando se sabe el número de veces que se debe repetir el bloque de sentencias.

        ~~~java
        for (inicialización; condición; actualización) {

            bloque-de-sentencias;

        }
        ~~~

        Un ejemplo al igual que el anterior imprimir numeros de 1 al 10:
        >**for** se suele utilizar cuando sabes cuantas vueltas va dar el bucle

        ~~~java
        for(int i=0; i<=10; i++) { 
        //Se declara la variable, se hace la condicion y se incrementa
            System.out.println(i);
            System.out.println(",”);

        }
        ~~~

  ## Estructura de excepciones
    
  - ### **Try Catch**
    Son situaciones anómalas producidas durante la ejecución de un programa.
    La forma en la que el programador gestione la excepción es lo que se conoce como tratamiento de excepciones o manejo de errores.
    Cuando se produce una excepción pueden ocurrir tres cosas:
    La excepción se captura mediante bloques try{} catch{} y se gestionan las instrucciones en función del error producido.
    La excepción se lanza mediante la instrucción throws en el método que se produce.
    El programa termina al producirse el error porque la excepción ni se captura ni se lanza.

    Estructura try catch:
  ~~~java
  try{
    (bloque de codigo para comprobar)
  }catch(expcepcion que quieres controlar){
    (bloque de codigo si entra dentro del error captado)
  }
  ~~~
  
  ~~~java
  Scanner sc = new Scanner(System.in)
  boolean esCorrecto = true;
  
  do{ //Se va a repetir hasta que el caracter introducido por Scanner sea correcto
    esCorrecto = true;
    try{
        int numero = sc.nextInt();
    }catch(InputMismatchException ime){
        System.out.println("Ha ocurrido un error al introducir un numero");
        esCorrecto=!esCorrecto;
    }
  } while(!esCorrecto);
  ~~~