package hospital;

public abstract class Empleado extends Persona{
    private String numeroSeguridadSocial;
    private double salario;

    public Empleado(String nombre, String apellidos, NIF nif, String numeroSeguridadSocial, double salario) {
        super(nombre, apellidos, nif);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", salario=" + salario +
                '}';
    }

    //Metodo abstracto para calcularIRPF
    public abstract double calcularIRPF();

}
