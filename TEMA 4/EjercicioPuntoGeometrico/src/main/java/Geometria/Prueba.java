package Geometria;

public class Prueba {
    public static void main(String[] args) {
        PuntoGeometrico puntoA = new PuntoGeometrico(1,5);
        PuntoGeometrico puntoB = new PuntoGeometrico();
        puntoB.setX(2);
        puntoB.setY(3);

        System.out.println(puntoA);
        System.out.println(puntoB);
    }
}
