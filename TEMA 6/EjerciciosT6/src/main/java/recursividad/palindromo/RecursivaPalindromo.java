package recursividad.palindromo;

public class RecursivaPalindromo {
    public static String palabra = "holaloh";

    public static boolean esPalindromo(int palabraLong,int numero) {
        if (palabraLong<= palabra.length() || palabraLong>0 || numero>0) {
            if(palabra.charAt(numero)==palabra.charAt(palabraLong)){
                return esPalindromo(palabraLong-1,numero-1);
            }else{
                return false;
            }
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo(palabra.length()));
    }
}
