package Ejercicio20;

import java.util.ArrayList;

public class ListaLibros {
    private ArrayList<Libro> lista;

    //Consideramos que se crea una lista y luego se le van añadiendo los valores
    public ListaLibros() {
        this.lista = new ArrayList<>();
    }

    public void insertarLibro(Libro libro) {
        if (libro != null) {
            lista.add(libro);
        }
    }

    public void imprimirLista(){
        lista.forEach((valor)->{
            System.out.println("["+valor+"]");
        });
    }

    public int getNumeroLibros(){
        return lista.size();
    }

    public boolean removeLibro(Libro libro){
        return lista.remove(libro);
    }

    public Libro buscarLibro(String isbn){
        int index=lista.indexOf(new Libro(isbn,"","",0,0));
        if(index!=-1){
            return lista.get(index);
        }

        return null;
    }

    public ArrayList<Libro> buscarLibro(double precio){
        ArrayList<Libro> catalogoBuscado = new ArrayList<>();

        for (int i = 0; i <lista.size() ; i++) {
            if(lista.get(i).getPrecio()==precio){
                catalogoBuscado.add(lista.get(i));
            }
        }

        return catalogoBuscado;
    }

}
