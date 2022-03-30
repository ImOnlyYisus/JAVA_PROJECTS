package airline;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pasajeros> listP1= new ArrayList<>();
        ArrayList<Pasajeros> listP2 = new ArrayList<>();
        ArrayList<Pasajeros> listP3= new ArrayList<>();
        ArrayList<Pasajeros> listP4 = new ArrayList<>();
        ArrayList<Pasajeros> listP5= new ArrayList<>();
        ArrayList<Pasajeros> listP6 = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            listP1.add(new Pasajeros());
        }
        for (int i = 0; i < 4 ; i++) {
            listP2.add(new Pasajeros());
        }
        for (int i = 0; i < 2 ; i++) {
            listP3.add(new Pasajeros());
        }
        for (int i = 0; i < 10 ; i++) {
            listP4.add(new Pasajeros());
        }
        for (int i = 0; i < 7 ; i++) {
            listP5.add(new Pasajeros());
        }
        for (int i = 0; i < 8 ; i++) {
            listP6.add(new Pasajeros());
        }

        Vuelo v1 = new Vuelo("a1","malaga","madrid",30,listP1);
        Vuelo v2 = new Vuelo("b2","sevilla","madrid",50,listP2);
        Vuelo v3 = new Vuelo("c3","gibraltar","madrid",40,listP3);
        Vuelo v4 = new Vuelo("d4","madrid","barcelona",15,listP4);
        Vuelo v5 = new Vuelo("e5","malaga","barcelona",40,listP5);
        Vuelo v6 = new Vuelo("f6","sevilla","barcelona",60,listP6);


        ArrayList<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(v1);
        vuelos.add(v2);
        vuelos.add(v3);
        vuelos.add(v4);
        vuelos.add(v5);
        vuelos.add(v6);

        //Metodo static para convertir en map sin ordenar
        System.out.println("MAP");
        Map<Vuelo,Integer> vuelosMap = covertirEnMap(vuelos);
        vuelosMap.forEach((vuelo,pasajeros)->{
            System.out.println(vuelo.getCodVuelo() + " -- pasajeros: "+ pasajeros);
        });

        //Metodo static para convertir en map ordenado por alfabeticamente por destino
        System.out.println("\nMAP ORDENADO");
        Map<Vuelo,Integer> vuelosMapSorted = convertirEnMapOrdenado(vuelos);
        vuelosMapSorted.forEach((vuelo,pasajeros)->{
            System.out.println(vuelo.getCodVuelo() + " -- pasajeros: "+ pasajeros);
        });

        System.out.println(numerosPasajeros(vuelosMapSorted,"d4"));
    }

    //Metodo static para convertir en map sin ordenar
    private static Map<Vuelo,Integer> covertirEnMap(ArrayList<Vuelo> vuelo){
        Map<Vuelo, Integer> vuelos = new HashMap<>();

        for (int i = 0; i <vuelo.size() ; i++) {
            vuelos.put(vuelo.get(i),vuelo.get(i).getPasajeros().size());
        }
        return vuelos;
    }

    //Metodo static para convertir en map ordenado por alfabeticamente por destino
    private static TreeMap<Vuelo,Integer> convertirEnMapOrdenado(ArrayList<Vuelo> vuelo){
        Comparator<Vuelo> criterioDestino = (destino1,destino2)-> destino1.getCiudadDestino().compareToIgnoreCase(destino2.getCiudadDestino());
        Comparator<Vuelo> criterioOrigen = (origen1,origen2)-> origen1.getCiudadOrigen().compareToIgnoreCase(origen2.getCiudadOrigen()); //Al tener destinos iguales
        Comparator<Vuelo> criterioTotal = criterioDestino.thenComparing(criterioOrigen);

        TreeMap<Vuelo, Integer> vuelos = new TreeMap<>(criterioTotal);
        for (int i = 0; i <vuelo.size() ; i++) {
            vuelos.put(vuelo.get(i),vuelo.get(i).getPasajeros().size());
        }
        return vuelos;
    }

    //Buscar el numero de pasajeros con el codigo de vuelo
    private static int numerosPasajeros(Map<Vuelo,Integer> mapVuelo, String codVuelo){
        for (Map.Entry<Vuelo,Integer> vuelos : mapVuelo.entrySet()) {
            if(vuelos.getKey().getCodVuelo().equals(codVuelo)){
                return vuelos.getValue();
            }
        }
        return -1;
    }

}
