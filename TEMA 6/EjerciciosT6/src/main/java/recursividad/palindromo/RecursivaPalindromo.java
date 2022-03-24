package recursividad.palindromo;

public class RecursivaPalindromo {
    public static String palabra = "holaloh";

    public static boolean esPalindromo(int inicioPala, int finalPala) {
        if (palabra.charAt(inicioPala)!= palabra.charAt(finalPala)) {
            return false;
        }

        if (inicioPala < finalPala + 1)
            return esPalindromo(inicioPala + 1, finalPala - 1);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(esPalindromo(0, palabra.length()-1));
    }
}
