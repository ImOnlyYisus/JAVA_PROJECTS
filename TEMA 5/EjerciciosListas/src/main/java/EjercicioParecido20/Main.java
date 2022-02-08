package EjercicioParecido20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //CARTELERAS
        Cartelera cineEstepona = new Cartelera();
        Cartelera cinePalmones = new Cartelera();

        //AÑADO PELICULAS
        //Estepona
        cineEstepona.insertPelicula(new Peliculas("Spiderman no way home", "Español", "Jon Watts", "Accion"));
        cineEstepona.insertPelicula(new Peliculas("Spiderman no way home", "Ingles", "Jon Watts", "Accion"));
        cineEstepona.insertPelicula(new Peliculas("Spiderman no way home", "Frances", "Jon Watts", "Accion"));

        cineEstepona.insertPelicula(new Peliculas("DJango Unchained", "Español", "Quentin Tarantino", "Accion"));
        cineEstepona.insertPelicula(new Peliculas("DJango Unchained", "Ingles", "Quentin Tarantino", "Accion"));

        cineEstepona.insertPelicula(new Peliculas("Uncharted","Español","Ruben Fleischer","Aventura"));
        cineEstepona.insertPelicula(new Peliculas("Uncharted","Frances","Ruben Fleischer","Aventura"));

        cineEstepona.insertPelicula(new Peliculas("Venom","Español","Ruben Fleischer","Accion"));

        cineEstepona.insertPelicula(new Peliculas("Moonfall","Español","Roland Emmerich","Ciencia Ficcion"));

        //Palmones
        cinePalmones.insertPelicula(new Peliculas("Spiderman no way home", "Español", "Jon Watts", "Accion"));
        cinePalmones.insertPelicula(new Peliculas("Spiderman no way home", "Ingles", "Jon Watts", "Accion"));
        cinePalmones.insertPelicula(new Peliculas("Spiderman no way home", "Frances", "Jon Watts", "Accion"));

        cinePalmones.insertPelicula(new Peliculas("One shot", "Ingles", "James Nunn", "Guerra"));
        cinePalmones.insertPelicula(new Peliculas("One shot", "Español", "James Nunn", "Guerra"));

        //-----
        System.out.println("PELICULAS CINE ESTEPONA [Total: "+cineEstepona.numeroPeliculas()+"]");
        cineEstepona.imprimirPeliculas();
        System.out.println("\nPELICULAS CINE PALMONES [Total: "+cinePalmones.numeroPeliculas()+"]");
        cinePalmones.imprimirPeliculas();

        cineEstepona.removePelicula(new Peliculas("Moonfall","","Roland Emmerich",""));
        System.out.println("\nPELICULAS CINE ESTEPONA [Total: "+cineEstepona.numeroPeliculas()+"]");
        cineEstepona.imprimirPeliculas();

        //BUSQUEDA DE PELICULAS
        ArrayList<Peliculas> busquedaDirector = cineEstepona.buscarPeliculaDirector("Ruben Fleischer");
        System.out.println("\nPeliculas encontrada con el director Ruben Fleischer:");
        busquedaDirector.forEach(valor -> System.out.println("["+valor+"]"));

        ArrayList<Peliculas> busquedaNombrePelicula = cineEstepona.buscarPeliculaTitulo("Spiderman no way home");
        System.out.println("\nPeliculas encontrada con el titulo Spiderman no way home:");
        busquedaNombrePelicula.forEach(valor -> System.out.println("["+valor+"]"));

        ArrayList<Peliculas> busquedaTipoPelicula = cineEstepona.buscarPeliculaTipo("Accion");
        System.out.println("\nPeliculas encontrada con el genero de Accion:");
        busquedaTipoPelicula.forEach(valor -> System.out.println("["+valor+"]"));

        ArrayList<Peliculas> busquedaIdioma = cineEstepona.buscarPeliculaIdioma("Español");
        System.out.println("\nPeliculas encontrada con el idioma Español:");
        busquedaIdioma.forEach(valor -> System.out.println("["+valor+"]"));


    }


}
