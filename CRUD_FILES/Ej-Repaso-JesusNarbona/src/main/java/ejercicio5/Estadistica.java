package ejercicio5;

import ejercicio2.RegistroJSON;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estadistica {
    private ArrayList<Integer> calificaciones;

    public Estadistica() {
    }

    public Estadistica(ArrayList<RegistroJSON> registros, String inicial) {

    }

    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

//    private ArrayList<String> calificacionesModulo(String iniciales, ArrayList<RegistroJSON> registros){
//        List<RegistroJSON> calificaciones = registros.stream()
//                .filter(registro -> registro.getCEAC().equals(iniciales) || registro.getEA().equals(iniciales) || registro.getFOL().equals(iniciales) ||
//                        registro.getING().equals(iniciales) || registro.getTII().equals(iniciales) || registro.getOACV().equals(iniciales) || registro.getTC().equals(iniciales))
//                .collect(Collectors.toList());
//
//        calificaciones.forEach(System.out::println);
//
//    }

    private static int verSiEsNumerico(String cadena){
        try{
            return Integer.parseInt(cadena);
        }catch (NumberFormatException nfe){
            return -1;
        }
    }


}
