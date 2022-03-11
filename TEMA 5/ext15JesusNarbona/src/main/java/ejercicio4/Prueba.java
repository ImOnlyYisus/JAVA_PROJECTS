package ejercicio4;

public class Prueba {
    public static void main(String[] args) {
        Teatro teatro = new Teatro(4, 7);
        System.out.println("Teatro por defecto");
        teatro.imprimirAsientos();

        System.out.println("\n---------------");
        teatro.reservar(1, 1);
        teatro.reservar(1, 2);
        teatro.reservar(3, 3);
        teatro.imprimirAsientos();

        System.out.println("\n---------------");
        teatro.cancelar(1, 1);
        teatro.cancelar(1, 2);
        teatro.cancelar(1, 3);
        teatro.imprimirAsientos();

    }
}
