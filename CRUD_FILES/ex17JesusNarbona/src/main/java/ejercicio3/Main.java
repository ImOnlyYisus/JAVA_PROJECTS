package ejercicio3;

import ejercicio1.Carta;
import ejercicio2.Lectura;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Carta>> cartasPorRondas = Lectura.leerCsv("escaleraColor.txt"," ");

        Escritura.escribirCsv("resultadoRonda.txt",cartasPorRondas);
    }
}
