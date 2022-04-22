package tarea7a;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EscrituraProfesDept {
    public static void escritura(ArrayList<Empleado> empleados) {
        //Ruta
        String ruta = "profesoresPorDepartamento.csv";
        Map<String,Integer> deptEmple = new HashMap<>();
        //Escritura
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            deptEmple = generarMapProfeDept(empleados);

            //Recorre el map y escribe en el archivo
            for(Map.Entry<String,Integer> entry : deptEmple.entrySet()){
                bw.write(entry.getKey()+"\t"+entry.getValue());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Genera un map con los departamentos y la cantidad de profesores que pertenecen a cada departamento
    private static Map<String,Integer> generarMapProfeDept(ArrayList<Empleado> empleados){
        Map<String,Integer> map = new HashMap<>();

        //Recorre todos los empleados y los diferencia por puesto y cantidad de empleados
        for (int i = 0; i < empleados.size() ; i++) {
            if(map.containsKey(empleados.get(i).getPuesto())){
                map.put(empleados.get(i).getPuesto(),map.get(empleados.get(i).getPuesto())+1);
            }else{
                map.put(empleados.get(i).getPuesto(),1);
            }
        }

        return map;

    }
}
