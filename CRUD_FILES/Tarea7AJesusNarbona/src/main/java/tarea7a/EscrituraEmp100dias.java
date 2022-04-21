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
    public static void escritura(ArrayList<Empleado> empleados) {
        //Ruta
        String ruta = "profesCon100dias.csv";
        //Escritura
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            Map<Empleado,Long> emp100dias = verEmpleados100Dias(empleados);
            bw.write("Nombre,Apellido,Dni,Puesto,Fecha de toma,Fecha cese,Telefono,Evaluador,Coordinador,Dias trabajados");
            bw.newLine();
            for (Map.Entry<Empleado,Long> entry : emp100dias.entrySet()) {
                bw.write(entry.getKey().getNombre()+","+entry.getKey().getApellido()+","+entry.getKey().getDni()+","+entry.getKey().getPuesto()+","+
                        entry.getKey().getFechaToma()+","+entry.getKey().getFechaCese()+","+entry.getKey().getTelefono()+","+
                        (entry.getKey().isEvaluador() ? "Si" : "No")+","+(entry.getKey().isCoordinador()? "Si":"No")+","+ entry.getValue());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Map<Empleado,Long> verEmpleados100Dias(ArrayList<Empleado> empleados) {
        Map<Empleado,Long> empleadosConMas100dias = new HashMap<>();
        for (int i = 0; i < empleados.size(); i++) {
            LocalDate fechaCese = empleados.get(i).getFechaCese() != null ? empleados.get(i).getFechaCese() : LocalDate.now();
            if (ChronoUnit.DAYS.between(empleados.get(i).getFechaToma(), fechaCese) > 100) {
                empleadosConMas100dias.put(empleados.get(i),ChronoUnit.DAYS.between(empleados.get(i).getFechaToma(), fechaCese));
            }
        }

        return empleadosConMas100dias;
    }
}
