package ejercicio5;

import ejercicio4.Lectura;
import ejercicio4.Precipitacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Precipitacion> listaPrecipitaciones = Lectura.leerArchivoJSON1("./precipitacionesBadajoz.json", Precipitacion.class);

        //Apartado A
        mapEstacionTemp(listaPrecipitaciones).forEach((k, v) -> System.out.println(k + "-> " + v));

        //Apartado B
        leidasDias1020(listaPrecipitaciones);

        //Apartado C
        double media = calcularMedia1020(listaPrecipitaciones);
        System.out.println(media);



    }

    private static Map<String, Double> mapEstacionTemp(List<Precipitacion> precipitaciones) {
        Map<String, Double> mapEstacionTemp = new HashMap<>();
        precipitaciones.forEach(precipitacion -> {
            mapEstacionTemp.put(precipitacion.getEstacionMeteorologica(), precipitacion.getPrecipitacion());
        });

        return mapEstacionTemp;
    }

    private static void leidasDias1020(List<Precipitacion> precipitaciones) {
        precipitaciones.stream()
                .filter(precipitacion -> precipitacion.getFecha().getDayOfMonth() >= 10 && precipitacion.getFecha().getDayOfMonth() <= 20)
                .forEach(System.out::println);
    }

    private static double calcularMedia1020(List<Precipitacion> precipitaciones) {
        long numeroPrecipitaciones = precipitaciones.stream()
                .filter(precipitacion -> precipitacion.getFecha().getDayOfMonth() >= 10 && precipitacion.getFecha().getDayOfMonth() <= 20)
                .count();

        double sumaPrecipitaciones = precipitaciones.stream()
                .filter(precipitacion -> precipitacion.getFecha().getDayOfMonth() >= 10 && precipitacion.getFecha().getDayOfMonth() <= 20)
                .map(Precipitacion::getPrecipitacion)
                .reduce(Double::sum).get();

        return sumaPrecipitaciones/numeroPrecipitaciones;
    }
}


