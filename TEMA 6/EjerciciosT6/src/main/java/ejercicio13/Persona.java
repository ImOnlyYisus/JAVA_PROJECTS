package ejercicio13;

public abstract class Persona implements Identificable{
    private String nombre;
    private String apellido;
    private String nif;
    private String telefono;

    public Persona(String nombre, String apellido, String nif, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getNif(){
        return nif;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setNif(String nif){
        this.nif = nif;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif='" + nif + '\'' +
                ", telefono='" + telefono +
                '}';
    }
}
