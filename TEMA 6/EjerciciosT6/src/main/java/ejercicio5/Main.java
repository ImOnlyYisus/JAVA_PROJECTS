package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Paco","Fdz",34);
        Cliente c3 = new Cliente("Juan","Trolo",45);
        Cliente c4 = new Cliente("Pepe","Lolo",24);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());


    }
}
