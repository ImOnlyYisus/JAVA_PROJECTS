package arraylist;

import arraylist.Persona;

import java.util.ArrayList;

public class ArrayListPersona {
    public static void main(String[] args) {
        ArrayList<Persona> personas= new ArrayList<>();

        personas.add(new Persona("Paco", 17, "a1"));
        personas.add(new Persona("Ramon", 23, "a2"));
        personas.add(new Persona("Ramon", 18, "a2"));
        personas.add(new Persona("Juan", 34, "a1"));

        for (int i = 0; i <personas.size() ; i++) {
            Persona persona = (Persona) personas.get(i);
        }

    }

}
