package herencia;

import java.util.Objects;

public class Soldado extends Persona{ //Soldado hereda de la clase Persona
    protected String provincia; //Protected, permite el acceso al atributo desde cualquier clase en el mismo paquete
    protected int añosAlistado;

    public Soldado(String nombre, String apellidos, String dni, String provincia, int añosAlistado) {
        super(nombre, apellidos, dni);
        this.provincia = provincia;
        this.añosAlistado = añosAlistado;
    }

    public Soldado() {
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getAñosAlistado() {
        return añosAlistado;
    }

    public void setAñosAlistado(int añosAlistado) {
        this.añosAlistado = añosAlistado;
    }

    //Metodo equals heredado del padre (Persona), se sobrescribe
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//Comparacion reflexiva, si es el mismo objeto devuelve true
        if (o == null || getClass() != o.getClass()) return false;//Si es null, o de diferente clases, devuelve false
        if (!super.equals(o)) return false;
        Soldado soldado = (Soldado) o; //Cating explicito de Object a Soldado
        //Se comparan los estados de los objetos
        return añosAlistado == soldado.añosAlistado && Objects.equals(provincia, soldado.provincia);
    }

    //Metodo hascode heredado del padre (Persona), se sobrescribe
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), provincia, añosAlistado);
    }

    public void saludar(){ //Metodo b2 que es el que va a sobrescribir las clases hijas
        System.out.println("Saludos soy un soldado");
    }

    public void disparar(){ //Metodo b1 que es metodo unico para esta clase
        System.out.println("Disparo al aire");
    }

    @Override
    public void getMando() {//Metodo sobrescrito del padre (Persona)
        System.out.println("Soldado raso");
    }

    @Override
    public String toString() {//Metodo sobrescrito de la clase padre persona
        return super.toString()+"\n"+"Soldado{" +
                "provincia='" + provincia + '\'' +
                ", añosAlistado=" + añosAlistado +
                '}';
    }
}
