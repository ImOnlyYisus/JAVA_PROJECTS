package arraylist;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad=edad;
        this.dni = edad + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) { //Dos personas son iguales por el dni
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }
    Persona
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }


    @Override
    public int compareTo(Persona o) { //Ordenacion natural por nombre y si no por edad
       if(this.nombre.compareTo(o.nombre)==0){
           return Integer.compare(this.edad,o.edad);
       }else{
           return this.nombre.compareTo(o.nombre);
       }
    }
}
