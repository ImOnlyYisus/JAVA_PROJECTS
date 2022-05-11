package ejercicio.Lectura;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lectura {
    public static <T> T leerArchivoJSON2(String nombre, Class<T> clase) {
        T datos = null;
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas

        try {
            datos = mapeador.readValue(nombre,
                    mapeador.getTypeFactory().constructType(clase));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }
}
