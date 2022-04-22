package tarea7a;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.ISO_8859_1;

public class ReadCvsEmpleados {

    public static  ArrayList<Empleado> leerArchivo(){
        //Ruta archivo
        String ruta = "RelPerCen.csv";

        //Lista empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        //Scanner para leer el archivo y crear objetos empleado para añadirlos a la lista
        try(Scanner bw = new Scanner(new FileInputStream(ruta), ISO_8859_1)) {
            bw.nextLine();
            while (bw.hasNextLine()){ //Mientras haya lineas
                //Leer linea
                String lectura = bw.nextLine();
                lectura=lectura.replaceAll("\"","");
                String[] linea = lectura.split(",");
                Empleado empleado = new Empleado();

                //Llenar objeto empleado
                empleado.setNombre(linea[1].substring(1)); //Quito el espacio que tiene al principio
                empleado.setApellido(linea[0]);
                empleado.setDni(linea[2]);
                empleado.setPuesto(linea[3]);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                empleado.setFechaToma(LocalDate.parse(linea[4],formatter));
                empleado.setFechaCese(!linea[5].isEmpty() ? LocalDate.parse(linea[5],formatter) : null);
                empleado.setTelefono(linea[6]);
                empleado.setEvaluador(linea[7].equals("Sí"));
                empleado.setCoordinador(linea[8].equals("Sí"));

                empleados.add(empleado);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
