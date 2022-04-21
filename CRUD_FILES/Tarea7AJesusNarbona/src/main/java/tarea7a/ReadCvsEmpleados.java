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

        //Lectura
        try(Scanner bw = new Scanner(new FileInputStream(ruta), ISO_8859_1)) {
            bw.nextLine();
            while (bw.hasNextLine()){
                String lectura = bw.nextLine();
                lectura=lectura.replaceAll("\"","");
                String[] linea = lectura.split(",");
                Empleado empleado = new Empleado();

                empleado.setNombre(linea[0]);
                empleado.setApellido(linea[1]);
                empleado.setDni(linea[2]);
                empleado.setPuesto(linea[3]);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                empleado.setFechaToma(LocalDate.parse(linea[4],formatter));
                empleado.setFechaCese(!linea[5].isEmpty() ? LocalDate.parse(linea[5],formatter) : null);
                empleado.setTelefono(linea[6]);
                empleado.setEvaluador(linea[7].equals("Si"));
                empleado.setCoordinador(linea[8].equals("Si"));

                empleados.add(empleado);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
