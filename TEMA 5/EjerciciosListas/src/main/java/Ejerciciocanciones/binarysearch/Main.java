package Ejerciciocanciones.binarysearch;

public class Main {
    public static void main(String[] args) {
        ListaReproducion spotify = new ListaReproducion();

        spotify.grabarCancion(new Cancion("Melendrill",2,"Sykobeats",2021));
        spotify.grabarCancion(new Cancion("Feel good",3,"Gorillaz",2017));
        spotify.grabarCancion(new Cancion("Sientelo",3,"Mandragora",2018));
        spotify.grabarCancion(new Cancion("Follow you",4,"Bring me the horizon",2018));
        spotify.grabarCancion(new Cancion("Eastwest",3,"Gorillaz",2016));

        System.out.println("Spotify tiene la playlist innactiva?->" + spotify.estaVacia());
        System.out.println("PLAY LIST ["+spotify.numeroCanciones()+" canciones]");
        ListaReproducion.imprimirLista(spotify);

        spotify.eliminarCancion(new Cancion("Sientelo",0,"Mandragora",0));
        System.out.println("\nPLAY LIST ["+spotify.numeroCanciones()+" canciones]");
        ListaReproducion.imprimirLista(spotify);

        spotify.cambiarCancion(2,new Cancion("Eastwest",0,"Gorillaz",0));
        System.out.println("\nPLAY LIST ["+spotify.numeroCanciones()+" canciones]");
        ListaReproducion.imprimirLista(spotify);

        int indiceCancion = spotify.buscarCancion(new Cancion("Melendrill",0,"Sykobeats",0));
        System.out.println("\nLa cancion esta en la posicion:"+ indiceCancion);

        System.out.println("\nLa cancion de la posicion:"+spotify.escucharCancion(indiceCancion).getNombre());

        spotify.eliminarCancion(indiceCancion);
        System.out.println("\nPLAY LIST ["+spotify.numeroCanciones()+" canciones]");
        ListaReproducion.imprimirLista(spotify);



    }
}
