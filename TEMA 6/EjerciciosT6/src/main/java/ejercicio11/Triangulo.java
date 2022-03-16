package ejercicio11;

public class Triangulo extends Figura{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (((getBase()*getAltura())/2));
    }
}
