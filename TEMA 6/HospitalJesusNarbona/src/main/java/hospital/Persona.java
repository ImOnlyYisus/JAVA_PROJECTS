package hospital;

import java.time.LocalDate;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private NIF nif;

    public Persona(String nombre, String apellidos, NIF nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

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

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif=" + nif +
                '}';
    }

    //Metodo para renovar el nif
    public void renovarNIF(LocalDate fechaSolicitud){
        this.nif.renovar(fechaSolicitud);

    }
}
