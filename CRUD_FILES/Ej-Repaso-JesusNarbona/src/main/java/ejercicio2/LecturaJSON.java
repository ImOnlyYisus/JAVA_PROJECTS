package ejercicio2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecturaJSON {
    public static ArrayList<RegistroJSON> leerArchivoJSON1(String nombre) {
        ArrayList<RegistroJSON> datos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas

        try {
            datos.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }
}
