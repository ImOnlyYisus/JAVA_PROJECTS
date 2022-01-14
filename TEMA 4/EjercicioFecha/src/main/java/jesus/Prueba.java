package jesus;

import java.time.format.DateTimeFormatter;

public class Prueba {
    public static void main(String[] args) {
        Utilidades utilidades= new Utilidades();
        Fecha fecha= new Fecha(20,1,2005);

        System.out.println(fecha.bisiesto());
        System.out.println(fecha.diasMes());
        System.out.println(fecha.mostrarFechaCorta());
        System.out.println(fecha.mostrarFechaLarga());
        System.out.println(fecha.diaSemana());
        fecha.siguiente();
        System.out.println(fecha.mostrarFechaCorta());
        fecha.anterior();
        System.out.println(fecha.mostrarFechaCorta());

        Fecha fecha2= new Fecha(10,5,2021);
        System.out.println(fecha.igualQue(fecha2));
        System.out.println(fecha.mayorQue(fecha2));
        System.out.println(fecha.menorQue(fecha2));

        System.out.println(Fecha.diasEntreFechas(fecha,fecha2));
    }
}
