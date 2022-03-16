package ejercicio11;

public class Figura {
    private double base;
    private double altura;

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }

    public double calcularArea(){
        return 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
