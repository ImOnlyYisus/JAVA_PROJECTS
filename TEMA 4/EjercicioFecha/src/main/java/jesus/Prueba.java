package jesus;

import java.time.format.DateTimeFormatter;

public class Prueba {
    public static void main(String[] args) {
        Fecha fecha= new Fecha();

        System.out.println(fecha.mostrarFechaLarga());

        System.out.println(fecha+" "+fecha.copia());
    }
}
