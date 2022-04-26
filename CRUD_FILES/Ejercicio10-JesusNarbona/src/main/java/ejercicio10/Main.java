package ejercicio10;

import ejercicio10.vehiculos.Deportivo;
import ejercicio10.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.Comparator;

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


    }
}
