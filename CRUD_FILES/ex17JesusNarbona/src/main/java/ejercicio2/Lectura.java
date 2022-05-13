package ejercicio2;

import ejercicio1.Carta;
import ejercicio1.Palos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lectura {
    public static List<List<Carta>> leerCsv(String nombre, String separador) {
        List<List<Carta>> datos = new ArrayList<>();


        try (Scanner sc = new Scanner(new File(nombre), "US-ASCII")) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();

                String[] datosLinea = linea.split(separador);

                Carta c1=new Carta();
                Carta c2 = new Carta();
                Carta c3 = new Carta();
                Carta c4 = new Carta();

                c1.setNumero(datosLinea[0]);
                c2.setNumero(datosLinea[2]);
                c3.setNumero(datosLinea[4]);
                c4.setNumero(datosLinea[6]);

                c1.setPalo(comprobarPalo(datosLinea[1]));
                c2.setPalo(comprobarPalo(datosLinea[3]));
                c3.setPalo(comprobarPalo(datosLinea[5]));
                c4.setPalo(comprobarPalo(datosLinea[7]));

                c1.ajustarValor();
                c2.ajustarValor();
                c3.ajustarValor();
                c4.ajustarValor();
                List<Carta> ronda = new ArrayList<>();
                ronda.add(c1);
                ronda.add(c2);
                ronda.add(c3);
                ronda.add(c4);

                datos.add(ronda);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return datos;
    }

    private static Palos comprobarPalo(String paloFichero){
        Palos palo = null;
        if(paloFichero.equalsIgnoreCase("D")){
            palo = Palos.ROMBOS;
        } else if (paloFichero.equalsIgnoreCase("T")) {
            palo = Palos.TREBOLES;

        } else if (paloFichero.equalsIgnoreCase("C")) {
            palo = Palos.CORAZONES;
        } else if (paloFichero.equalsIgnoreCase("P")) {
            palo = Palos.PICAS;
        }

        return palo;
    }



}
