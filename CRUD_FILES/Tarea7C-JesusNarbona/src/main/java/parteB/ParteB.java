package parteB;

import horarios.Horario;
import writeAndRead.Leer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ParteB {
    public static void main(String[] args) {
        List<Horario> listaHorarios = Leer.leerFicheroCsv("hor_curso_1920_final.csv");

        //a) Obtener todos los registros de 1ESOA que no son de la asignatura MUS.
        System.out.println("a) Obtener todos los registros de 1ESOA que no son de la asignatura MUS.");
        listaHorarios.stream()
                .filter(horario-> horario.getCurso().equalsIgnoreCase("1ESOA"))
                .filter(horario -> !horario.getAsignatura().equalsIgnoreCase("MUS"))
                .forEach(System.out::println);

        //b) Contar las horas que se imparten de la asignatura PROGR
        System.out.println("\nb) Contar las horas que se imparten de la asignatura PROGR");
        long numeroHoras = listaHorarios.stream()
                .filter(horario -> horario.getAsignatura().equalsIgnoreCase("PROGR"))
                .map(horario -> horario.getHora())
                .count();
        System.out.println(numeroHoras);

        //c) Obtener una lista con las iniciales del profesorado que imparte la asignatura REL, ordenadas en orden inverso al orden alfabético.
        System.out.println("\nc) Obtener una lista con las iniciales del profesorado que imparte la asignatura REL, ordenadas en orden inverso al orden alfabético.");
        List<String> listaIncialesRel = listaHorarios.stream()
                .filter(horario -> horario.getAsignatura().equalsIgnoreCase("REL"))
                .map(horario -> horario.getIniciales())
                .sorted(Comparator.reverseOrder())
                .distinct() //Veo logico que solo salga una vez el mismo profesor
                .collect(Collectors.toList());
        listaIncialesRel.forEach(System.out::println);

        //En el caso de que quisieras ver todas las iniciales aunque se repitan alguna de las mismas, sería quitar el distinc, pero en este caso veo bien
        //implementarlo, ya que te da las iniciales solo una vez y dan REL

        //d) Obtener en una lista las aulas donde imparte clase el profesor "JFV"
        System.out.println("\nd) Obtener en una lista las aulas donde imparte clase el profesor \"JFV\"");
        List<String> listaAulasJFV = listaHorarios.stream()
                .filter(horario -> horario.getIniciales().equalsIgnoreCase("JFV"))
                .map(Horario::getAula)
                .distinct() //Veo logico que salga solo una vez las aulas en las que parte el profesor
                .collect(Collectors.toList());

        listaAulasJFV.forEach(System.out::println);

        //En el caso de que quisieras ver todas las aulas aunque se repitan alguna de las mismas, sería quitar el distinc, pero en este caso veo bien
        //implementarlo, ya que te da las aulas sin repetirse y sabiendo que se da JFV

        //e) Contar el número de asignaturas distintas que hay
        System.out.println("\ne) Contar el número de asignaturas distintas que hay");
        long asignaturasDist = listaHorarios.stream()
                .map(Horario::getAsignatura)
                .distinct()
                .count();

        System.out.println(asignaturasDist);

        //f) Contar el total de horas que se imparten a última hora de la mañana.
        System.out.println("\nf) Contar el total de horas que se imparten a última hora de la mañana.");
        long horasPartidasUltMañana = listaHorarios.stream()
                .map(Horario::getHora)
                .filter(horario-> horario==7)
                .count();

        System.out.println(horasPartidasUltMañana);

        //g) Mostrar por consola los profesores que tienen clase a primera hora de la mañana.
        System.out.println("\ng) Mostrar por consola los profesores que tienen clase a primera hora de la mañana.");
        listaHorarios.stream()
                .filter(horario -> horario.getHora()==1)
                .map(Horario::getIniciales)
                .forEach(System.out::println);
    }

}
