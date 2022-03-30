package ejercicio13;

public class Estudiante extends Persona {
    private String id;

    public Estudiante(String nombre, String apellido, String nif, String telefono, String id) {
        super(nombre, apellido, nif, telefono);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Estudiante{" +
                "id='" + id + '\'' +
                '}';
    }
    @Override
    public void identificate() {
        System.out.println("Identificado como estudiante");
    }
}
