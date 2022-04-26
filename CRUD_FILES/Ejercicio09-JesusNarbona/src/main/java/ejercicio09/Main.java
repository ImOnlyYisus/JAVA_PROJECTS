package ejercicio09;

import ejercicio09.vehiculos.Vehiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = ReadAndSelectCars.lectura();

        Escritura.escritura(vehiculos);
    }
}
