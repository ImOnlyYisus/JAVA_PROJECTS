package EjercicioParecido20;

public class Main {
    public static void main(String[] args) {
        //CARTELERAS
        Cartelera cineEstepona = new Cartelera();
        Cartelera cinePalmones = new Cartelera();

        //AÑADO PELICULAS
        cineEstepona.insertPelicula(new Peliculas("Spiderman no way home", "Español", "Jon Watts", "Accion"));
        cineEstepona.insertPelicula(new Peliculas("Spiderman no way home", "Ingles", "Jon Watts", "Accion"));
        cineEstepona.insertPelicula(new Peliculas("Spiderman no way home", "Frances", "Jon Watts", "Accion"));

        cineEstepona.insertPelicula(new Peliculas("DJango Unchained", "Español", "Quentin Tarantino", "Accion"));
        cineEstepona.insertPelicula(new Peliculas("DJango Unchained", "Ingles", "Quentin Tarantino", "Accion"));

        cineEstepona.insertPelicula(new Peliculas("Uncharted","Español","Ruben Fleischer","Aventura"));
        cineEstepona.insertPelicula(new Peliculas("Uncharted","Frances","Ruben Fleischer","Aventura"));

        cineEstepona.insertPelicula(new Peliculas("Moonfall","Español","Roland Emmerich","Ciencia Ficcion"));


    }


}
