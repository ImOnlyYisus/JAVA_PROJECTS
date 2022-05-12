package ejercicio3;

import ejercicio1.Carta;
import ejercicio1.Palos;

import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Escritura {
    public static void escribirCsv(String nombre, List<List<Carta>> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {

            for (List<Carta>dato : datos) {
                if(comprobarEscalera(dato)){
                    double posiblePremio = dato.get(dato.size()-1).getValor()+1;

                    bw.write(posiblePremio + " " + dato.get(1).getPalo());
                }else{
                    bw.write("NADA");
                }

                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean comprobarEscalera(List<Carta> cartas){
        Collections.sort(cartas, (c1,c2)-> c1.getNumero().compareToIgnoreCase(c2.getNumero()));
        //Compruebo que tienen el mismo palo
        for (int i = 0; i <cartas.size() ; i++) {
            for (int j = i+1; j <cartas.size() ; j++) {
                if(cartas.get(i).getPalo()!=cartas.get(j).getPalo() ||
                        cartas.get(i).getValor()+1!=cartas.get(j).getValor()){
                    System.out.println(cartas.get(i).getValor() + " " + cartas.get(j).getValor());
                    return false;
                }
            }
        }

//        //Compruebo que tengan la secuencia de escalera
//        for (int i = 0; i <cartas.size() ; i++) {
//            for (int j = i+1; j <cartas.size() ; j++) {
//                if(){
//                   return false;
//                }
//            }
//        }
        return true;
    }

}
