
package jesus;

/**
 *
 * @author jesus
 */
public class Ej10 {
    public static void main(String[] args) {
        /*
            10.- Implementa un programa Java que permita visualizar todas las letras minúsculas, desde la 'a' hasta la 'z', usando un for.
        */
        
        //97 a 122 es de la a-z en la tabla ASCII
        
//        final int unicodeZ = 122 ;
//        
//        for(int unicodeA = 97; unicodeA<=unicodeZ; unicodeA++){
//            System.out.println((char)unicodeA);
//        }
        
        final char z = 'z' ;
        
        for(char a = 'a'; a<=z; a++){
            System.out.println(a);
        }
    }
}
