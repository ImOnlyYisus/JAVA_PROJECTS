
package jesus;

/**
 *
 * @author jesus
 */
public class Ej11 {
    public static void main(String[] args) {
        /*
            11.- Implementa un programa Java que permita visualizar todas las letras mayúsculas, desde la 'A' hasta la 'Z', usando un do – while.
        */
        
        // 65 a 90 A-Z en la tabla ASCII
        
        char unicodeZ = 'Z';
        char unicodeA = 'A';
        do{
            System.out.println(unicodeA);
            unicodeA++;
        }while(unicodeA<=unicodeZ);
    }
}
