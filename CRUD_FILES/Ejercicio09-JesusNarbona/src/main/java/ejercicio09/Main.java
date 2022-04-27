package ejercicio09;

import ejercicio09.vehiculos.Turismo;
import ejercicio09.vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.StreamSupport.stream;


public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = ReadAndSelectCars.lectura();

        Escritura.escritura(vehiculos);
    }
}
