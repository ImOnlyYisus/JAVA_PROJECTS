package tarea7a;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EscrituraEmp100dias {
    private static void escritura(ArrayList<Empleado> empleados) {
        //Ruta
        String ruta = "profesCon100dias.csv";
        //Escritura
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            ArrayList<Empleado> emp100dias = verEmpleados100Dias(empleados);

            for (int i = 0; i <emp100dias.size() ; i++) {
                bw.write(emp100dias.get(i).getNombre()+","+emp100dias.get(i).getApellido()+","+emp100dias.get(i).getDni()+","+emp100dias.get(i).getPuesto()+","+emp100dias.get(i).getFechaToma()+","+emp100dias.get(i).getFechaCese()+","+emp100dias.get(i).getTelefono()+","+emp100dias.get(i).isEvaluador()+","+emp100dias.get(i).isCoordinador());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static ArrayList<Empleado> verEmpleados100Dias(ArrayList<Empleado> empleados) {
        ArrayList<Empleado> empleadosConMas100dias = new ArrayList<>();
        for (int i = 0; i < empleados.size(); i++) {
            LocalDate fechaCese = empleados.get(i).getFechaCese() != null ? empleados.get(i).getFechaCese() : LocalDate.now();
            if (ChronoUnit.DAYS.between(empleados.get(i).getFechaToma(), fechaCese) > 100) {
                empleadosConMas100dias.add(empleados.get(i));
            }
        }

        return empleadosConMas100dias;
    }
}
