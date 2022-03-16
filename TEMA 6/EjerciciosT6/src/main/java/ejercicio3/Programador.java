package ejercicio3;

public class Programador extends Empleado{
    private Categoria categoria;

    public Programador() {
        super();
    }

    public Programador(String nombre, String nif, int edad, double salario, Categoria categoria) {
        super(nombre, nif, edad, salario);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + this.categoria;
    }
}
