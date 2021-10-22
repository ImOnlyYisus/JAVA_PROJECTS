
package jesus;

/**
 *
 * @author jesus
 */
public class Ej13 {
    public static void main(String[] args) {
        /*
        13.- Modifica el programa del ejercicio 11 para que se vea el código numérico (número entero) de cada una de las letras.
        */
        
        char unicodeZ = 'Z';
        char unicodeA = 'A';
        do{
            System.out.println((int)unicodeA);
            unicodeA++;
        }while(unicodeA<=unicodeZ);
    }
}
