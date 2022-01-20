package Ejercicios;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Escribe un programa que muestre cada elemento de un array de enteros y sume todos sus elementos.
        // Instancia e inicializa el array en el programa, sin leer nada por teclado, con los siguientes
        // valores {1, 2, 3, 4, 5, 6}.
        int[] arrayNumeros ={1,2,3,4,5,6};

        for (int i = 0; i <arrayNumeros.length ; i++) {
            System.out.println(arrayNumeros[i]);
        }
    }
}
