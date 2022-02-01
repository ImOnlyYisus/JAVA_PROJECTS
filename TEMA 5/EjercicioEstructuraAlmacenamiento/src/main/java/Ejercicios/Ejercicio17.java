package Ejercicios;

import java.util.Arrays;
import java.util.Locale;

public class Ejercicio17 {
    /*
    Implementa un programa que lea un String, lo pase a minúscula, lo introduzca en un array de caracteres y ordene dicho array siguiendo el orden Unicode (a<b<c<d...).
     */
    public static void main(String[] args) {
        String cadenaTexto = "Mi nombre es paco";
        char[] arrayChars= generarArrayChar(cadenaTexto);
        System.out.println(Arrays.toString(arrayChars));
        ordenarArray(arrayChars);
        System.out.println(Arrays.toString(arrayChars));
    }

    private static char[] generarArrayChar(String cadenaTexto){
        String cadenaTextoNueva = cadenaTexto.toLowerCase();
        cadenaTextoNueva = cadenaTextoNueva.replaceAll("\\s","");

        char [] arrayChar = new char[cadenaTextoNueva.length()];

        for (int i = 0; i <cadenaTextoNueva.length() ; i++) {
            arrayChar[i] = cadenaTextoNueva.charAt(i);
        }

        return arrayChar;
    }

    private static void ordenarArray(char [] array){
        Arrays.sort(array);
    }
}
