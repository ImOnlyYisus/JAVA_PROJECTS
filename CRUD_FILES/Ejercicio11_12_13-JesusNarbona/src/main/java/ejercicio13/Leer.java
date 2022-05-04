package ejercicio13;

import com.fasterxml.jackson.databind.ObjectMapper;
import ejercicio11.App;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Leer {
    public static ArrayList<App> leerArchivoJSON(String nombre){
        ArrayList<App> apps = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            apps.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, App.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return apps;
    }
}
