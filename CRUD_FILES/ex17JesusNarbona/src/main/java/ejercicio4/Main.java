package ejercicio4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Precipitacion> listaPrecipitaciones = Lectura.leerArchivoJSON1("./precipitacionesBadajoz.json",Precipitacion.class);
        listaPrecipitaciones.forEach(System.out::println);
    }
}
