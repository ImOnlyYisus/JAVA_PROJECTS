package recursividad.palindromo;

import java.util.stream.Stream;

public class IterativaPalindromo {
    public static String palabra="holaaloh";

    public static boolean esPalindromo(){
        String palabraReverse = "";
        for (int i = palabra.length()-1; i >=0 ; i--) {
            palabraReverse+=palabra.charAt(i);
        }

        return palabraReverse.equalsIgnoreCase(palabra);
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo());
    }


}
