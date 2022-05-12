package ejercicio4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lectura {
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

}
