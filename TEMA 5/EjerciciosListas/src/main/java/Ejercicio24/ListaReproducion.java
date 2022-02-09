package Ejercicio24;

import java.util.ArrayList;

public class ListaReproducion {
    private ArrayList<Cancion> listaReproducion;

    public ListaReproducion() {
        this.listaReproducion = new ArrayList<>();
    }

    //Numero canciones
    public int numeroCanciones() {
        return listaReproducion.size();
    }

    //Si esta vacia
    public boolean estaVacia() {
        return listaReproducion.isEmpty();
    }

    //Escuchar la cancion, devuelve la cancion que se encuentra en la posicion indicada
    public Cancion escucharCancion(int posicion) {
        Cancion cancionEncontrada = null;

        if (listaReproducion.size()>= posicion) {
            cancionEncontrada = listaReproducion.get(posicion);
        }

        return cancionEncontrada;
    }

    //Cambiar de posicion la Cancion indicada
    public boolean cambiarCancion(int posicion, Cancion cancion) {
        if (posicion <= listaReproducion.size()) {
            if (listaReproducion.indexOf(cancion) != -1) {
                int indiceAntiguo=listaReproducion.indexOf(cancion);
                listaReproducion.remove(indiceAntiguo);
                listaReproducion.add(posicion, cancion);
                return true;
            }
        }
        return false;
    }

    //Grabar cancion
    public boolean grabarCancion(Cancion cancion) {
        if (listaReproducion.add(cancion)) {
            return true;
        }
        return false;
    }

    //Eliminar la cancion pasando indice
    public boolean eliminarCancion(int indice) {
        if (listaReproducion.size()>=indice) {
            listaReproducion.remove(indice);
            return true;

        }
        return false;
    }

    //Elimina la cancion pasando Cancion
    public boolean eliminarCancion(Cancion cancion){
        return (listaReproducion.remove(cancion));
    }

    //Metodo que imprime los nombres de las canciones de la lista que le pasemos
    public static void imprimirLista(ListaReproducion tmp){
        if(!tmp.listaReproducion.isEmpty()){
            tmp.listaReproducion.forEach(cancion-> System.out.println(cancion.getNombre()));
        }
    }

    //Metodo que busca la posicion de la cancion que le pases
    public int buscarCancion(Cancion c){
        if(listaReproducion.indexOf(c)!=1){
            return listaReproducion.indexOf(c);
        }

        return -1;
    }


}
