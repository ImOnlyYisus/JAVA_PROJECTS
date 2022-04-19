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
        Map<String,Integer> vuelosMap = covertirEnMap(vuelos);
        vuelosMap.forEach((vuelo,pasajeros)->{
            System.out.println(vuelo+ " -- pasajeros: "+ pasajeros);
        });

        //Metodo static para convertir en map ordenado por alfabeticamente por destino
        System.out.println("\nMAP ORDENADO");
        Map<String,Integer> vuelosMapSorted = convertirEnMapOrdenado(vuelos);
        vuelosMapSorted.forEach((vuelo,pasajeros)->{
            System.out.println(vuelo + " -- pasajeros: "+ pasajeros);
        });

        //Map con los codigos de vuelo y lista de pasajeros
        Map<String,ArrayList<Pasajeros>> mapPasajeros = listaPasajeros(vuelos);
        mapPasajeros.forEach((cod,pasajeros)->{
            System.out.println("Vuelo: "+cod+"\n");
            pasajeros.forEach(System.out::println);
        });
    }

    //Metodo static para convertir en map sin ordenar
    private static Map<String,Integer> covertirEnMap(List<Vuelo> vuelo){
        Map<String, Integer> vuelos = new HashMap<>();

        for (int i = 0; i <vuelo.size() ; i++) {
            if(vuelos.containsKey(vuelo.get(i).getCiudadDestino())){
                int suma = vuelos.get(vuelo.get(i).getCiudadDestino()) + vuelo.get(i).getPasajeros().size();
                vuelos.put(vuelo.get(i).getCiudadDestino(),suma);
            }else{
                vuelos.put(vuelo.get(i).getCiudadDestino(),vuelo.get(i).getPasajeros().size());
            }

        }
        return vuelos;
    }

    //Metodo static para convertir en map ordenado por alfabeticamente por destino
    private static TreeMap<String,Integer> convertirEnMapOrdenado(List<Vuelo> vuelo){
        TreeMap<String, Integer> vuelos = new TreeMap<>();
        for (int i = 0; i <vuelo.size() ; i++) {
            if(vuelos.containsKey(vuelo.get(i).getCiudadDestino())){
                int suma = vuelos.get(vuelo.get(i).getCiudadDestino()) + vuelo.get(i).getPasajeros().size();
                vuelos.put(vuelo.get(i).getCiudadDestino(),suma);
            }else{
                vuelos.put(vuelo.get(i).getCiudadDestino(),vuelo.get(i).getPasajeros().size());
            }
        }
        return vuelos;
    }

    //Buscar el numero de pasajeros con el codigo de vuelo
    private static Map<String,ArrayList<Pasajeros>> listaPasajeros(List<Vuelo> vuelo){
        Map<String,ArrayList<Pasajeros>> mapPasajeros = new HashMap<>();

        for (int i = 0; i <vuelo.size() ; i++) {
            mapPasajeros.put(vuelo.get(i).getCodVuelo(),vuelo.get(i).getPasajeros());
        }
        return mapPasajeros;
    }

}
