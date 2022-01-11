package jesus;

public class Prueba {
    public static void main(String[] args) {
        Complejo z1= new Complejo(7.0,10.2);
        Complejo z2= new Complejo(3.3,11.5);

        System.out.println(Complejo.suma(z1,z2));
        System.out.println(Complejo.resta(z1,z2));
        System.out.println(Complejo.multiplicacion(z1,z2));
        System.out.println(Complejo.division(z1,z2));
    }
}
