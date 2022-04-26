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
        ArrayList<Turismo> turismos = new ArrayList<>();
        ArrayList<Furgoneta> furgonetas = new ArrayList<>();
        ArrayList<Deportivo> deportivos = new ArrayList<>();

        vehiculos.forEach(vehiculo -> {
            if(vehiculo instanceof Turismo){
                turismos.add((Turismo) vehiculo);
            } else if (vehiculo instanceof Deportivo) {
                deportivos.add((Deportivo) vehiculo);
            }else if(vehiculo instanceof  Furgoneta){
                furgonetas.add((Furgoneta) vehiculo);
            }
        });
    }

    public static void escribirFile (ArrayList<Object> vehiculos, String nombre){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            vehiculos.forEach(vehiculo->{
                bw.write(vehiculos.toString());
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
