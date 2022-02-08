package Ejercicios;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Ejercicio23 {
    /*
    Se desea manejar dos listas (ArrayList) de Integer. La cantidad de elementos de la lista 1 debe ser un número aleatorio entre 5 y 15. La cantidad de elementos
    de la lista 2 debe ser un número aleatorio entre 10 y 20. El rango de los números que serán agregados a la lista DEBE estar entre 50 y 100. Se pide construir
    una aplicación en Java que permita cumplir con la siguiente funcionalidad:

       - Imprimir las listas que han sido generadas. Usa for-each.
       - Crear una tercera lista que contenga los elementos que están en la lista 1 y NO ESTÁN en la lista 2
       - Imprimir la tercera lista.
       - Crear una cuarta lista que contenga los elementos de la lista 1 que son pares y los elementos de la lista 2 que son impares
       - Imprimir la cuarta lista. Usa una expresión lambda.

     */
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = generarLista1();
        ArrayList<Integer> lista2 = generarLista2();
        printList(lista1);
        System.out.println("\n");
        printList(lista2);
        System.out.println("\n");
        ArrayList<Integer> lista3= listaDeNumerosRestantes(lista1,lista2);
        printList(lista3);
        System.out.println("\n");
        ArrayList<Integer> lista4= listaParesImpares(lista1,lista2);
        printList(lista4);
    }

    private static ArrayList<Integer> generarLista1(){
        Random rd = new Random();
        ArrayList<Integer> lista1= new ArrayList<>();

        for (int i = 0; i <rd.nextInt(16)+5 ; i++) {
            lista1.add(i, rd.nextInt(101)+50);
        }
        return lista1;
    }

    private static ArrayList<Integer> generarLista2(){
        Random rd = new Random();
        ArrayList<Integer> lista2= new ArrayList<>();

        for (int i = 0; i <rd.nextInt(21)+10 ; i++) {
            lista2.add(i, rd.nextInt(101)+50);
        }
        return lista2;
    }

    private static void printList(ArrayList<Integer> lista){
        System.out.print("[");
        lista.forEach((valor)-> System.out.print(valor+", "));
        System.out.println("]");
    }

    private static ArrayList<Integer> listaDeNumerosRestantes(ArrayList<Integer> lista1,ArrayList<Integer>lista2){
        ArrayList<Integer> lista3 = new ArrayList<>();

        for (int i = 0; i <lista1.size() ; i++) {
            if(!lista2.contains(lista1.get(i))){
                lista3.add(lista1.get(i));
            }
        }

        return lista3;
    }

    private static ArrayList<Integer> listaParesImpares(ArrayList<Integer> lista1,ArrayList<Integer>lista2){
        ArrayList<Integer> lista4 = new ArrayList<>();
        for (int i = 0; i <lista1.size() ; i++) {
            if(lista1.get(i)%2==0){
                lista4.add(lista1.get(i));
            }
        }

        for (int i = 0; i <lista2.size() ; i++) {
            if(lista2.get(i)%2!=0){
                lista4.add(lista2.get(i));
            }
        }

        return lista4;
    }
}
