package writeAndRead;

import horarios.Horario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Leer {
    public static List<Horario> leerFicheroCsv(String nombreArch){
        List<Horario> listaDeHorarios = new ArrayList<>();

        try(Scanner sc = new Scanner(new FileReader(nombreArch))){ //Try with resources, de Scanner para leer el archivo
            while(sc.hasNextLine()){
                String linea = sc.nextLine(); //Linea completa
                linea = linea.replaceAll(" ",""); //Elimina los espacios
                linea = linea.replaceAll("\"",""); //Elimina las comillas
                String[] valores = linea.split(";"); //[1]curso, [2]inicalesProf, [3]asignatura, [4]aula, [5]dia, [6]hora

                //Asignacion de valores a un objeto Horario
                Horario horario = new Horario();
                horario.setCurso(valores[1]);
                horario.setIniciales(valores[2]);
                horario.setAsignatura(valores[3]);
                horario.setAula(valores[4].equalsIgnoreCase("") ? null : valores[4]);
                horario.setDiaSemana(valores[5].isEmpty() ? 0 : Integer.parseInt(valores[5]));
                horario.setHora(valores[6].isEmpty() ? 0 : Integer.parseInt(valores[6]));

                listaDeHorarios.add(horario);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Ordena la lista de horarios por dias y luego por horas
        Comparator<Horario> criterioDia = (h1,h2) -> Integer.compare(h1.getDiaSemana(), h2.getDiaSemana());
        Comparator<Horario> criterioHora = (h1,h2) -> Integer.compare(h1.getHora(), h2.getHora());
        listaDeHorarios.sort(criterioDia.thenComparing(criterioHora));
        return listaDeHorarios;
    }
}
