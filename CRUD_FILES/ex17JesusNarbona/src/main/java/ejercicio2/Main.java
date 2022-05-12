package ejercicio2;

import ejercicio1.Carta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Carta>> cartasPorRondas = Lectura.leerCsv("escaleraColor.txt"," ");

        cartasPorRondas.forEach(System.out::println);
    }
}
