package arrays;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[] arrayString = {"h","d","g","f","k"};
        String[] arrayString2 = {"h","a","g","f","k"};

//        ordenarArray(arrayString);
//        System.out.println(buscarLetraBS(arrayString,"a"));
        System.out.println(esIgualCadena(arrayString,arrayString2));

    }

    private static void ordenarArray(String[] array){ //ORDENAR
        Arrays.sort(array);
    }

    private static int buscarLetraBS(String[] array,String letra){
        //Tiene que estar ordenado previamente para hacer binarySearch
        int busqueda = Arrays.binarySearch(array,letra);
        return busqueda; // -1 es que no esta la letra

    }

    private static boolean esIgualCadena(String[] cadena1, String[] cadena2){
        return Arrays.equals(cadena1,cadena2);
    }


}
