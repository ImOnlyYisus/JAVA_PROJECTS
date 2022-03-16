package ejercicio11;

public class Romboide extends Figura{
    public Romboide(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (getBase()*getAltura());
    }
}
