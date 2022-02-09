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


}
