package ejercicio10;

import ejercicio10.vehiculos.Deportivo;
import ejercicio10.vehiculos.Turismo;
import ejercicio10.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Escritura.crearCarpeta("copias");
        Escritura.copiarFicheros("Deportivos.csv", "copias/Deportivos.csv");
        Escritura.copiarFicheros("Furgonetas.csv", "copias/Furgonetas.csv");
        Escritura.copiarFicheros("Turismos.csv", "copias/Turismos.csv");

        Escritura.listarFicherosDirectorio("copias");

        ArrayList<Vehiculo> listVehiculos = new ArrayList<>();
        Escritura.rellenarArrayDatos(listVehiculos);

        System.out.println("-LISTA-");
        listVehiculos.forEach(System.out::println);

        Comparator<Vehiculo> criterioBastidor = (v1,v2)-> v1.getNumeroBastidor().compareToIgnoreCase(v2.getNumeroBastidor());
        listVehiculos.sort(criterioBastidor);
        System.out.println("\n-LISTA ORDENADA-");
        listVehiculos.forEach(System.out::println);

        Escritura.borrarFicheros("Deportivos.csv");
        Escritura.borrarFicheros("Furgonetas.csv");
        Escritura.borrarFicheros("Turismos.csv");

        Escritura.listarFicherosDirectorio("./");

        //Imprime por pantalla todos los coches blancos, distintos, ordenador por matrícula.
        listVehiculos.stream()
                .filter(v -> v instanceof Turismo)
                .filter(v -> ((Turismo) v).getColor().equalsIgnoreCase("Blanco"))
                .distinct()
                .forEach(System.out::println);

        //Imprime por pantalla todas las marcas de coches distintas de aquellos coches que estén disponibles.
        listVehiculos.stream()
                .map(Vehiculo::getMarca)
                .distinct()
                .forEach(System.out::println);

        //Saber la cantidad de vehículos Citroen.
        long numeroCitroen = listVehiculos.stream()
                .filter(v-> v.getMarca().equalsIgnoreCase("Citroen"))
                .count();
        System.out.println(numeroCitroen);

        //Comprueba si hay algún Peugeot negro disponible en la lista.
        boolean peugotNegro = listVehiculos.stream()
                .filter(v-> v instanceof Turismo)
                .anyMatch(v-> v.getMarca().equalsIgnoreCase("peugeot") && ((Turismo) v).getColor().equalsIgnoreCase("Negro"));

        System.out.println(peugotNegro);


    }
}
