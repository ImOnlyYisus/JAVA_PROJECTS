package herencia;

import java.util.Objects;

public class Teniente extends Persona{
    private String sector;

    public Teniente(String nombre, String apellidos, String dni, String sector) {
        super(nombre, apellidos, dni);
        this.sector = sector;
    }

    public Teniente() {
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }



    @Override
    public void getMando() { //Metodo heredado de la clase persona, se sobrescribe
        System.out.println("Teniente");
    }

    public void alzarLaBandera(){ //Metodo propio de la clase
        System.out.println("Alzando la bandera");
    }

    //metodo Equals sobrescrito de la clase padre (Persona)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//Comparacion reflexiva, si es el mismo objeto devuelve true
        if (o == null || getClass() != o.getClass()) return false; //Si es null, o de diferente clases, devuelve false
        if (!super.equals(o)) return false;
        Teniente teniente = (Teniente) o;//Cating explicito de Object a Teniente
        //Se comparan los estados de los objetos
        return Objects.equals(sector, teniente.sector);
    }
    //metodo Hashcode sobrescrito de la clase padre (Persona)
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sector);
    }

    @Override
    public String toString() {//Metodo sobrescrito de la clase Persona
        return super.toString()+"\n"+"Teniente{" +
                "sector='" + sector + '\'' +
                '}';
    }
}
