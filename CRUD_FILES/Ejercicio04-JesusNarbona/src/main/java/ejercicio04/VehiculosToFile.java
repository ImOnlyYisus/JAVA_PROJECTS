package ejercicio04;

import ejercicio04.vehiculos.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VehiculosToFile {
    public static void main(String[] args) {
        String route = "vehiculos.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(route))) {
            Concecionario concecionario = new Concecionario();
            for(Vehiculo vehiculo : concecionario.getVehiculos()){
                String numero = "";
                if(vehiculo instanceof Turismo){
                    numero="0";
                }else if(vehiculo instanceof Deportivo){
                    numero ="1";
                } else if(vehiculo instanceof Furgoneta){
                    numero="2";
                }

                bw.write(numero+"-"+vehiculo.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
