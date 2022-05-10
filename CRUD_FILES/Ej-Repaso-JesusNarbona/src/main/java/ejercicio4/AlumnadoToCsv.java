package ejercicio4;

import ejercicio1.LecturaCSV;
import ejercicio3.Alumnado;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class AlumnadoToCsv {
    public static void alumnadoToCsv(Alumnado alumno , TreeMap<String,String> datosEj1){
        crearCarpetas("./alumnado");
        String nombreSinEspacio = alumno.getNombre().replaceAll(" ","");
        nombreSinEspacio=nombreSinEspacio.replaceAll(",","-");

        Map<String,String> notasAlumno = new HashMap<>();
        for(Map.Entry<String,String> entry : datosEj1.entrySet()){
            for(Map.Entry<String,String> entryAlumno : alumno.getNotas().entrySet()){
                if(entry.getKey().equals(entryAlumno.getKey())){
                    notasAlumno.put(entry.getValue(),entryAlumno.getValue());
                }
            }
        }

        escribirCsv("./alumnado/"+nombreSinEspacio+".csv",notasAlumno);
    }

    private static void crearCarpetas(String nombreCarpeta) {
        Path directorio = Paths.get(nombreCarpeta);

        try {
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
                System.out.println("Se ha creado el directorio");
            }

        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static <T> void escribirCsv(String nombre, Map<T,T> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            for(Map.Entry<T,T> entry : datos.entrySet()){
                bw.write(entry.getKey() + "\t" + entry.getValue());
                bw.newLine();
            }

            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
