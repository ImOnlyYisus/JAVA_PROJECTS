package Geometria;

public class Prueba {
    public static void main(String[] args) {
        PuntoGeometrico puntoA = new PuntoGeometrico(1,5);
        PuntoGeometrico puntoB = new PuntoGeometrico();
        puntoB.setX(2);
        puntoB.setY(3);

        System.out.println(puntoA);
        System.out.println(puntoB);

        Linea primeraLinea = new Linea();
        primeraLinea.mostrarLinea();

        Linea segundaLinea = new Linea(puntoA,puntoB);
        segundaLinea.mostrarLinea();

        segundaLinea.mueveArriba(3);
        segundaLinea.mostrarLinea();

        segundaLinea.mueveAbajo(3);
        segundaLinea.mostrarLinea();

        segundaLinea.mueveDerecha(3);
        segundaLinea.mostrarLinea();

        segundaLinea.mueveIzquierda(3);
        segundaLinea.mostrarLinea();
    }
}
