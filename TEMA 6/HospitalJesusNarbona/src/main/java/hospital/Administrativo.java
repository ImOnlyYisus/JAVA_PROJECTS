package hospital;

public class Administrativo extends Empleado{
    private Grupo grupo;

    public Administrativo(String nombre, String apellidos, NIF nif, String numeroSeguridadSocial, double salario, Grupo grupo) {
        super(nombre, apellidos, nif, numeroSeguridadSocial, salario);
        this.grupo = grupo;
    }

    public void registrarDocumento(String documento){
        System.out.println(getNombre() + " " + getApellidos() + "registra " + documento + "(" + documento.hashCode() +")");
    }

    //Metodo para calcular el irpf sobre su salario, devuelve el irpf calculado
    @Override
    public double calcularIRPF() {

        return (getSalario() * grupo.getIrpf()) / 100;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Administrativo{" +
                "grupo=" + grupo +
                '}';
    }
}
