package ejercicio;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import http.HttpConect;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String response = HttpConect.peticionHttpGet("https://jsonplaceholder.typicode.com/users");
            List<User> usuarios = leerArchivoJSON1(response,User.class);
            usuarios.forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> List<T> leerArchivoJSON1(String lectura, Class<T> clase) {
        List<T> datos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas

        try {
            datos.addAll(mapeador.readValue(lectura,
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, clase)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datos;
    }
}
