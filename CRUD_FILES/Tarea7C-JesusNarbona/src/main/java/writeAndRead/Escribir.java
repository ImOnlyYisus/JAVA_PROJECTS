package writeAndRead;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import horarios.Horario;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Escribir {
    //Metodo para escribir un fichero json con el nombre pasado como parametro, y los datos que se le pasan en tipo lista
    public static void escribirFicheroJSON(String nombre, List<Horario> listaHorarios) {
        ObjectMapper mappeador = new ObjectMapper(); //Objeto para mapear objetos a json

        mappeador.configure(SerializationFeature.INDENT_OUTPUT, true); //Configuracion para que se escriba en formato json

        try {
            mappeador.writeValue(new File(nombre),listaHorarios );//Escribimos el fichero
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Metodo para escribir un fichero csv con el nombre pasado como parametro, y los datos que se le pasan en tipo lista
    public static void escribirFicheroCSV(String nombre, List<Horario> datos){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) { //try with resources, de buffered writter para escribir en el fichero
            for (Horario horario : datos) {
                bw.write(horario.toString()); //Escribimos en el fichero
                bw.newLine(); //Salto de linea
            }
            bw.flush(); //Flush para que se escriba en el fichero
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
