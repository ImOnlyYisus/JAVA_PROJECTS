package programa;

import herencia.Persona;
import herencia.Soldado;
import herencia.SoldadoTierra;
import herencia.Teniente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        //Se realiza casting implicito(up casting) a la clase Persona,a la hora de introducirlos en la lista.
        listaPersonas.add(new Soldado("Paco", "fdz", "12345a", "Cadiz", 2));
        listaPersonas.add(new Soldado("Juan", "Perez", "21312b", "Malaga", 1));
        listaPersonas.add(new Teniente("Pedro", "Sanchez", "45672g", "Bajo"));
        listaPersonas.add(new Teniente("Pablo", "Iglesias", "12356d", "Este"));
        listaPersonas.add(new SoldadoTierra("Guillermo", "Olo", "1248987f", "Malaga", 2, "Ligero", "Apoyo"));
        listaPersonas.add(new SoldadoTierra("Lolo", "Diaz", "8987a", "Jaen", 3, "Pesado", "Blindado"));

        //Imprimir lista con foreach
        System.out.println("---------------------------");
        listaPersonas.forEach(System.out::println);
        System.out.println("---------------------------");

        //Ordenar lista con el criterio de nombre
        Comparator<Persona> criterioNombre = (nombre1, nombre2) -> nombre1.getNombre().compareToIgnoreCase(nombre2.getNombre());
        listaPersonas.sort(criterioNombre);

        //Imprimir lista con un iterador
        System.out.println("---------------------------");
        Iterator<Persona> personaIterator = listaPersonas.iterator();

        while (personaIterator.hasNext()) {
            System.out.println(personaIterator.next());
        }
        System.out.println("---------------------------");

        System.out.println("********************************");
        listaPersonas.forEach((personas) -> {
            System.out.println(personas); //Llama al metodo toString, que es un metodo polimorfico
            if (personas instanceof Soldado) {
                ((Soldado) personas).disparar(); //Casting explicito (down casting)
            }
            if (personas instanceof Teniente) {
                ((Teniente) personas).alzarLaBandera();//Casting explicito (down casting)
            }
            if (personas instanceof SoldadoTierra) {
                ((SoldadoTierra) personas).cubirse(); //Casting explicito (down casting)
            }

            personas.getMando(); //Metodo polimorfico, segun la clase que lo ejecute realiza una funcion o otra
            System.out.println();
        });
        System.out.println("********************************");


    }
}
