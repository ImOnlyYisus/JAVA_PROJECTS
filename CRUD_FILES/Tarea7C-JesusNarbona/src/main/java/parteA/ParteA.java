package parteA;

import horarios.Horario;
import writeAndRead.Escribir;
import writeAndRead.Leer;

import javax.swing.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ParteA {
    public static void main(String[] args) {
        //Listas
        List<Horario> listaHorarios = Leer.leerFicheroCsv("hor_curso_1920_final.csv");

        //Set de grupos y iniciales, no se quieren repetidos
        Set<String> inicialesProf = listaHorarios.stream().map(prof -> prof.getIniciales()).collect(Collectors.toSet());
        Set<String> grupos = listaHorarios.stream().map(grupo -> grupo.getCurso()).collect(Collectors.toSet());

        String[] botones = {"a) Consultar horarios por profesor/a.", "b) Consultar horarios por grupo."};
        int variable = JOptionPane.showOptionDialog(null, " Selecciona una de las opciones...",
                "Opciones parteA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);
        //a) = 0, b)=1, x=-1

        switch (variable) {
            case 0:
                seccionA(listaHorarios);
                break;
            case 1:
                seccionB(listaHorarios);
                break;
            case -1:
                JOptionPane.showMessageDialog(null,"Saliendo...");
                break;
        }
    }

    /*
        Si el usuario selecciona a), el programa mostrará las iniciales del profesorado, para que el usuario elija una. Una vez proporcionada la inicial
        por parte del usuario, el programa guardará en un fichero json, en la raíz del proyecto, el horario seleccionado, si existe, volcando el objeto
        POJO en el archivo, al igual que hicimos con el ejercicio de las app. El nombre del fichero estará compuesto por las iniciales del profesor en
        cuestión y la extensión del archivo. Por ejemplo, para el profesor JCF, el archivo se llamará JCF.json.
     */
    private static void seccionA(List<Horario> listaHorarios) {

        //Lista de iniciales sin repetir
        Object[] maestrosSelect = listaHorarios.stream()
                .map(Horario::getIniciales)
                .distinct()
                .sorted(String::compareToIgnoreCase)
                .toArray();

        String input = (String) JOptionPane.showInputDialog(null, "Seleccione un maestro para exportar su horario",
                "Consultar horarios por profesor/a", JOptionPane.QUESTION_MESSAGE, null, maestrosSelect, maestrosSelect[0]);

        if (input != null) { //Por si le dan a cancelar o a la X
            List<Horario> listaFiltrada = listaHorarios.stream()
                    .filter(horario -> horario.getIniciales().equalsIgnoreCase(input))
                    .collect(Collectors.toList());
            Escribir.escribirFicheroJSON(input + ".json", listaFiltrada); //Llamada a la clase escribir para escribir el fichero json
            JOptionPane.showMessageDialog(null, "Se ha creado el horario de " + input + " en ./" + input + ".json");
        }

    }

    /*
        Si el usuario selecciona b), el programa mostrará los grupos que hay en el instituto, para que el usuario elija uno. Una vez proporcionado
        el grupo, el programa guardará en un fichero csv, en la raíz del proyecto, el horario seleccionado, si existe. El nombre del fichero estará
        compuesto por las iniciales del grupo en cuestión y la extensión del archivo. Por ejemplo, para el grupo 1DAW, el archivo se llamará 1DAW.csv.
     */
    private static void seccionB(List<Horario> listaHorarios) {
        //Lista de grupos sin repetir
        Object[] gruposSelect = listaHorarios.stream()
                .map(Horario::getCurso)
                .sorted(String::compareToIgnoreCase)
                .distinct()
                .toArray();

        String input = (String) JOptionPane.showInputDialog(null, "Seleccione un maestro para exportar su horario",
                "Consultar horarios por profesor/a", JOptionPane.QUESTION_MESSAGE, null, gruposSelect, gruposSelect[0]);

        if (input != null) { //Por si le dan a cancelar o a la X
            List<Horario> listaFiltrada = listaHorarios.stream()
                    .filter(horario -> horario.getCurso().equalsIgnoreCase(input))
                    .collect(Collectors.toList());

            Escribir.escribirFicheroCSV(input + ".csv", listaFiltrada); //Llamada a la clase escribir para escribir el fichero csv
            JOptionPane.showMessageDialog(null, "Se ha creado el horario de " + input + " en ./" + input + ".csv");
        }
    }
}
