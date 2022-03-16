package ejercicio11;

public class Rectangulo extends Figura{

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return ((getBase()*getAltura()));
    }
}
