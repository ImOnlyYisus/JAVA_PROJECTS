package herencia;

import java.util.Objects;

public abstract class Persona{
    protected String nombre;//Protected, permite el acceso al atributo desde cualquier clase en el mismo paquete
    protected String apellidos;
    protected String dni;

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Persona() {
    }

    public abstract void getMando(); //Metodo abstracto para obtener el rango del ejercito

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override//Metodo que sobrescribe al de la clase object que es la clase padre
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos) && Objects.equals(dni, persona.dni);
    }

    @Override//Metodo que sobrescribe al de la clase object que es la clase padre
    public int hashCode() {
        return Objects.hash(nombre, apellidos, dni);
    }

    @Override
    public String toString() { //Metodo que sobrescribe al de la clase object que es la clase padre
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
