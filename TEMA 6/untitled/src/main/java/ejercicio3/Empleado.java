package ejercicio3;

public class Empleado extends Persona{
    private double salario;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, String nif, int edad, double salario) {
        super(nombre, nif, edad);
        this.salario= salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double aumento){
        if(aumento>=0){
            salario+=aumento;
        }
    }

    @Override
    public String toString() {
        return super.toString() + this.salario ;
    }


}
