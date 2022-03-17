package ejercicio8;

public class Main {
    public static void main(String[] args) {
        Dado dado = new Dado(6);
        Moneda moneda = new Moneda();

        System.out.println(dado.lanzar());
        System.out.println(moneda.lanzar());
    }
}
