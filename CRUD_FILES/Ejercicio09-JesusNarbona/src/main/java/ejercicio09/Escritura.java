package ejercicio09;

import com.sun.source.tree.ArrayAccessTree;
import ejercicio09.vehiculos.Deportivo;
import ejercicio09.vehiculos.Furgoneta;
import ejercicio09.vehiculos.Turismo;
import ejercicio09.vehiculos.Vehiculo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Escritura {
    public static void escritura(ArrayList<Vehiculo> vehiculos){
        ArrayList<Vehiculo> turismos = new ArrayList<>();
        ArrayList<Vehiculo> furgonetas = new ArrayList<>();
        ArrayList<Vehiculo> deportivos = new ArrayList<>();

        vehiculos.forEach(vehiculo -> {
            if(vehiculo instanceof Turismo){
                turismos.add((Turismo) vehiculo);
            } else if (vehiculo instanceof Deportivo) {
                deportivos.add((Deportivo) vehiculo);
            }else if(vehiculo instanceof  Furgoneta){
                furgonetas.add((Furgoneta) vehiculo);
            }
        });

        escribirFile(turismos,"Turismos.csv");
        escribirFile(furgonetas,"Furgonetas.csv");
        escribirFile(deportivos,"Deportivos.csv");
    }

    private static void escribirFile (ArrayList<Vehiculo> vehiculos, String nombre){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            for (Vehiculo vehiculo: vehiculos) {
                bw.write(vehiculo.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
