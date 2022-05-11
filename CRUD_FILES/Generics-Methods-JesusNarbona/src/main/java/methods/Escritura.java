package methods;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Jesus Narbona <yisusturtle>
 *
 */

public class Escritura {

    //Cuando leemos fechas en un csv, tenemos que formaterarlas
    //   DateTimeFormatter fecha = DateTimeFormatter.ofPattern("d/MM/yyyy");
    //   LocalDate.parse(fechaX,formatter));


    //Metodo para escribir un cvs con un array de cualquier tipo de objetos
    //---Asegurarse de tener implentado el toString con formato "x;x;...", en otro caso modificar este mismo metodo con los datos pertinentes--
    public static <T> void escribirCsv(String nombre, List<T> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            //TODO: modificar segun sea conveniente
            for (T dato : datos) {
                bw.write(dato.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Metodo para escribir un cvs con un objeto cualquiera
    public static <T> void escribirCsv(String nombre, T fichero) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            //TODO: modificar segun sea conveniente
            bw.write(fichero.toString());
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Metodo para escribir un json con un array de cualquier tipo de objetos
    //---Asegurar de tener correctamente las dependecias--
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310 --> (por si hay fechas)
    public static <T> void escribirJSON(String nombre, List<T> datos) {
        ObjectMapper mappeador = new ObjectMapper();

        mappeador.registerModule(new JavaTimeModule()); //Formato fechas

        mappeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        try {
            mappeador.writeValue(new File(nombre), datos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metodo para crear directorios
    //Ej: si pones una ruta "./ej1/ejercicios" te crea dos carpetas
    //Ej: si has creado anteriormente "./ej1" y pones "./ej1/ejemplo" te crea dentro de ej1 un carpeta llamada ejemplo
    public static void crearCarpetas(String nombreCarpeta) {
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

    //Metodo para copiar archivos, pasando la ruta del archivo origen y la ruta de como sería el destino final
    //Ej: copiarFichero("./ejercicio/archivo.csv", "./copias/archivoCopia.csv") --> el archivo se copiaría dentro de copias y cambiaría su nombre a.java archivoCopia.csv
    //Ej: copiarFichero("./ejercicio/archivo.csv", "./copias/archivo.csv") --> el archivo se copiaría dentro de copias y con el mismo nombre
    //Ej: Si la ruta no de la carpeta destino no existe, creará esa carpeta, es decir rutaDestino = "./copias/x.csv", si copias no existe se creará la carpeta
    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);

        Path directorios = destino.subpath(0, destino.getNameCount() - 1);

        try {
            if (!Files.exists(destino)) {
                crearCarpetas(directorios.toString());
                Files.copy(origen, destino);
                System.out.println("Se han copiado los archivos");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
