package ejercicio;

import ejercicio.Estructura.Cancion;
import ejercicio.Lectura.Lectura;
import ejercicio.http.HttpConnect;

public class Main {
    public static void main(String[] args) {
        try {
            String ruta = HttpConnect.peticionHttpGet("https://itunes.apple.com/search?term=radiohead");
            Cancion cancion = Lectura.leerArchivoJSON2(ruta, Cancion.class);
            System.out.println(cancion.getResults().get(1).getReleaseDate());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
