package Ejercicio25;

import java.util.ArrayList;

public class Pila {
    private int tamañoPila;
    private ArrayList<Character> pila;

    public Pila(int tamañoPila) {
        this.tamañoPila = tamañoPila;
        pila=new ArrayList<>();
    }

    public int getTamañoPila() {
        return tamañoPila;
    }

    public void setTamañoPila(int tamañoPila) {
        this.tamañoPila = tamañoPila;
    }

    //apilar elemento (en inglés push), lo inserta donde proceda.
    public void pushElement(char c){
        if(!isFull()){
            pila.add(c);
        }
    }

    //desapilar (en inglés pop), que saca el elemento que toque.
    public void popElement(){
        if(!isEmpty()){
            pila.remove(0);
        }
    }

    //Saber si la pila está vacía.
    public boolean isEmpty(){
        return pila.isEmpty();
    }

    //Saber si la pila está llena.
    public boolean isFull(){
        return (numberElements()==tamañoPila);
    }

    //Saber el número de elementos actual de la pila.
    public int numberElements(){
        return pila.size();
    }

    //Mostrar los elementos de la pila.
    public void printElements(){
        pila.forEach(c -> {
            System.out.println("["+c+"]");
        });
    }

    //rellenar (char[] array), que recibe un array de letras y almacena en la pila los char que hay en el array. La pila
    //se ajusta su tamaño según el número de elementos que tenga el array.
    public void rellenarPila(char[] array){
        pila.clear();
        this.tamañoPila = array.length;

        for (int i = 0; i <array.length ; i++) {
            pushElement(array[i]);
        }
    }

    //char[] sacarElementos(), saca los elementos de la pila y los devuelva en un array de char. La pila queda vacía.
    public


}
