package ejercicio3;

import ejercicio2.RegistroJSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class RegistroToAlumnado {
    public static List<Alumnado> registroToAlumnado(List<RegistroJSON> lista) {
        List<Alumnado> alumnados = new ArrayList<>();
        for (RegistroJSON registro : lista) {
            Alumnado alumno = new Alumnado();
            alumno.setNombre(registro.getAlumno());
            TreeMap<String,String> notas = new TreeMap<>();

            notas.put("CEAC",registro.getCEAC());
            notas.put("EA", registro.getEA());
            notas.put("TC", registro.getTC());
            notas.put("FOL", registro.getFOL());
            notas.put("ING", registro.getING());
            notas.put("TII",registro.getTII());
            alumno.setNotas(notas);

            alumnados.add(alumno);
        }

        Collections.sort(alumnados);

        return alumnados;
    }
}
