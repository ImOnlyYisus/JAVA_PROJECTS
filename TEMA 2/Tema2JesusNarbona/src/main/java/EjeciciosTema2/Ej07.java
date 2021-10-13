
package EjeciciosTema2;

/**
 *
 * @author jesus
 */
public class Ej07 {
    //Main para ejecutar
    public static void main(String[] args) {
        //Codigo para ejecucion
        
        //a.- Declara e inicializa tres variables int en la misma instrucción (a=1, b=2, c=3).
            int a = 1, b = 2, c = 3;
            
        //b.- Declara e inicializa tres variables double en la misma instrucción (d=4.5, e=5.7, f=6.9).
            double d = 4.5, e = 5.7, f = 6.9;
        
        //c.- Muestra las variables en dos líneas, la primera línea mostrará las variables tipo entero y la segunda línea mostrará las variables tipo double.
            //Utilizo println para saltar la linea o podria utilizar \n para hacer un salto de linea en print
            System.out.println("VARIABLES TIPO ENTERO:" + a + "," + b + "," + c);
            System.out.println("VARIABLES TIPO DOUBLE:" + d + "," + e + "," + f + "\n"); //Salto de linea para visibilidad
            
        //d.- Realiza los siguiente intercambios de valores: en b guarda c, en c guarda a, en a guarda b. Muestra por pantalla el resultado.
            //Muestro los valores anteriores
                System.out.println("VALORES ANTIGUOS:");
                System.out.println("B: " + b + "\tC: " + c + "\tA: " + a);
            //Intercambio valores en el orden sugerido
                b = c;
                c = a;
                a = b;
            //Muestro el cambio
                System.out.println("VALORES NUEVOS:");
                System.out.println("B: " + b + "\tC: " + c + "\tA: " + a + "\n"); //Salto de linea para visibilidad
        
        //e.- Realiza los siguiente intercambios de valores: en e guarda f, en f guarda d, en d guarda e. Muestra por pantalla el resultado.
            //Muestro los valores anteriores
                System.out.println("VALORES ANTIGUOS:");
                System.out.println("F: " + f + "\tD: " + d + "\tE: " + e);
            //Intercambio valores en el orden sugerido
                e = f;
                f = d;
                d = e;
            //Muestro el cambio
                System.out.println("VALORES NUEVOS:");
                System.out.println("F: " + f + "\tD: " + d + "\tE: " + e + "\n"); //Salto de linea para visibilidad
                
    }
}
