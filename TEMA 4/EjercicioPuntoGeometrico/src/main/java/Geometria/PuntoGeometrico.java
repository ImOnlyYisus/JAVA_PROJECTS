package Geometria;

public class PuntoGeometrico {
    private double x;
    private double y;

    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PuntoGeometrico() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PuntoGeometrico{" +
                "puntoX=" + x +
                ", puntoY=" + y +
                '}';
    }

}
