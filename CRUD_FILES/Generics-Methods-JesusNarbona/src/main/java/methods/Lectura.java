package methods;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Jesus Narbona <yisusturtle>
 *
 */
public class Lectura {

    //Metodo generico para leer cualquier archivo csv, recibe el nombre del archivo y el separador de campos ";",","...
    //Retorna una lista de objetos de cualquier tipo
    //---Asegurarse de modificar la parte de creacion de objetos
    //Ejemplo de uso: List<Persona> listaPersonas = Lectura.leerArchivo("./personas.csv",";");
    public static <T> List<T> leerCsv(String nombre, String separador) {
        List<T> datos = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(nombre))) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                linea = linea.replaceAll(" ", "");
                linea = linea.replaceAll("\"", "");

                String[] datosLinea = linea.split(separador);

                //TODO: implementar segun el uso
                //Ej:
                // Persona p1 = new Persona() ;
                // p1.setNombre(datosLinea[0]);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return datos;
    }

    //Metodo generico para leer cualquier json, recibe el nombre del archivo y la clase del objeto, y devuelve una lista de objetos de cualquier tipo
    //Ejemplo de uso: List<Persona> listaPersonas = Lectura.leerJson("./personas.json",Persona.class);
    //---Asegurar de tener correctamente las dependecias--
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310 --> (por si hay fechas)
    //JSON: como este --> "https://github.com/yisusturtle/JAVA_PROJECTS/blob/main/CRUD_FILES/Tarea7C-JesusNarbona/JFV.json"
    public static <T> List<T> leerArchivoJSON1(String nombre, Class<T> clase) {
        List<T> datos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas

        try {
            datos.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, clase)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }

    //Metodo para leer un archivo JSON contruido por solo un objeto, recibe el nombre del archivo y la clase del objeto, y devuelve un objeto de cualquier tipo
    //Ejemplo de uso: Persona persona = Lectura.leerArchivoJSON2("./persona.json",Persona.class);
    //---Asegurar de tener correctamente las dependecias--
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310 --> (por si hay fechas)
    //JSON: como este --> "" //TODO: cambiar por el url json
    public static <T> T leerArchivoJSON2(String nombre, Class<T> clase) {
        T datos = null;
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas

        try {
            datos = mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructType(clase));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }

}
