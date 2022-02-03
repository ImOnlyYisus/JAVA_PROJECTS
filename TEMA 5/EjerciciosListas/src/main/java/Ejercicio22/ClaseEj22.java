package Ejercicio22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ClaseEj22 {
    private ArrayList<Integer> lista;

    public ClaseEj22() {
        lista= new ArrayList<>();
    }

    public ClaseEj22 (int tamaño){
        Random rd = new Random();
        lista = new ArrayList<>();
        for (int i = 0; i <tamaño ; i++) {
            Integer aux= rd.nextInt(91)+10;
            lista.add(aux);
        }
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void imprimirValores(){
        lista.forEach((valor)-> System.out.print(valor+ " - "));
    }

    public int imprimirSumaPar(){
        int suma = 0;
        for (int i = 0; i <lista.size() ; i++) {
            if((lista.get(i)%2)==0){
                suma+=lista.get(i);
            }
        }
        return suma;
    }

    public int imprimirSumaImpar(){
        int suma = 0;
        for (int i = 0; i <lista.size() ; i++) {
            if((lista.get(i)%2)!=0){
                suma++;
            }
        }
        return suma;
    }

    public int devolverElementoMayor(){
        int numeroMayor=Integer.MIN_VALUE;
        for (int i = 0; i < lista.size() ; i++) {
            if(lista.get(i)>numeroMayor){
                numeroMayor=lista.get(i);
            }
        }
        return numeroMayor;
    }

    public int devolverElementoMenor(){
        int numeroMayor=Integer.MAX_VALUE;
        for (int i = 0; i < lista.size() ; i++) {
            if(lista.get(i)<numeroMayor){
                numeroMayor=lista.get(i);
            }
        }
        return numeroMayor;
    }

    public int tamañoDeLista(){
        return lista.size();
    }

    public void borrarPosicion(int posicion){
        lista.remove(posicion);
    }

    public void borrarSegunElValor(Object valor){
        lista.remove(valor);
    }

    public void modificarSegunPosicion(int posicion, int valor){
        lista.set(posicion, valor);
    }
}
