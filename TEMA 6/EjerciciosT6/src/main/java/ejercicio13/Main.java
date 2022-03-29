package ejercicio13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Persona> personas = new ArrayList<>();
//        personas.add(new Estudiante("Pepe","Perez","123213ad","666666666","123asd"));
//        personas.add(new Estudiante("Maria","Perez","12313d","66435456","123556a"));
//        personas.add(new Profesor("Juan","Perez","123sd32aa","661235566","Ingenieria"));
//        personas.add(new Profesor("Pedro","Perez","123s32aa","665321566","Robotica"));
//
//        for(Persona p: personas){
//            System.out.println(p.toString());
//            p.identificate();
//
//            if(p instanceof Estudiante){
//                System.out.println(((Estudiante)p).getId());
//            }
//
//            if (p instanceof Profesor){
//                System.out.println(((Profesor) p).getEspecialidad());
//            }
//            System.out.println();
//        }

        ArrayList<Identificable> identificables = new ArrayList<>();
        identificables.add(new Estudiante("Pepe","Perez","123213ad","666666666","123asd"));
        identificables.add(new Estudiante("Maria","Perez","12313d","66435456","123556a"));
        identificables.add(new Profesor("Juan","Perez","123sd32aa","661235566","Ingenieria"));
        identificables.add(new Profesor("Pedro","Perez","123s32aa","665321566","Robotica"));

        for (Identificable i: identificables){
            System.out.println(i.toString());
            i.identificate();

            if(i instanceof Estudiante){
                System.out.println(((Estudiante)i).getId());
            }

            if (i instanceof Profesor){
                System.out.println(((Profesor) i).getEspecialidad());
            }
            System.out.println();
        }



    }
}
