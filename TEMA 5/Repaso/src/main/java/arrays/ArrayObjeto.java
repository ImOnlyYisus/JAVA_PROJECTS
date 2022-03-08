package arrays;

import java.util.Arrays;

public class ArrayObjeto {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Paco", 17, "a1"),
                new Persona("Ramon", 23, "a2"),
                new Persona("Ramon", 18, "a2"),
                new Persona("Juan", 34, "a1")
        };

        imprimirDatos(personas);
        System.out.println();
        ordenarPersonas(personas);
        imprimirDatos(personas);


    }

    private static void ordenarPersonas(Persona[] personas){
        Arrays.sort(personas);
    }

    private static void imprimirDatos(Persona[] personas){
        for (int i = 0; i <personas.length ; i++) {
            System.out.println(personas[i]);
        }
    }

}
