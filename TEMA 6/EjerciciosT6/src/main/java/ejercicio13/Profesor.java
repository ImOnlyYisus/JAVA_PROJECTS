package ejercicio13;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, String apellido, String nif, String telefono, String especialidad) {
        super(nombre, apellido, nif, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Profesor{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un profesor");
    }
}
