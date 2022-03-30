package airline;

import java.util.Random;

public class Pasajeros {
    private String nombre;
    private String apellido;

    public Pasajeros(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Pasajeros(){
        Random rd = new Random();
        String[] listaNombres = {"Juan", "Alberto", "Paco", "Rodolfo", "Maria", "Antonia", "Paquita", "Lola", "Ramon", "Penelopez", "Ivan", "Pepe", "Lucia"};
        String[] listaApellidos = {"Fernandez", "Calderon", "Garcia", "Rodriguez", "Mena", "Mora", "Martinez", "Sanchez", "Perez", "Lopez", "Gonzalez", "Silva"};

        nombre = listaNombres[rd.nextInt(listaNombres.length)];
        apellido = listaApellidos[rd.nextInt(listaApellidos.length)];

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Pasajeros{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
