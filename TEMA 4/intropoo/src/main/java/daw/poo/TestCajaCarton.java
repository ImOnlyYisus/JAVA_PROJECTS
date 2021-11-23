package daw.poo;

public class TestCajaCarton {
    public static void main(String[] args) {
        CajaCarton cajaGrande = new CajaCarton(250,400,500,200);
        CajaCarton cajaChica = new CajaCarton(25,30,15,17);

        System.out.println(cajaChica.getAllValues());
        System.out.println(cajaGrande.getAllValues());
    }
}
