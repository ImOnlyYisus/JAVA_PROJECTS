package jesus;

public class Complejo {
    private double numeroReal;
    private double numeroImaginario;
    private static int instancias;

    //Constructor

    public Complejo() {
        instancias++;
    }

    public Complejo(double a, double b) {
        this.numeroReal = a;
        this.numeroImaginario = b;
        instancias++;
    }

    //GETTER SETTER

    public double getA() {
        return numeroReal;
    }

    public void setA(double a) {
        this.numeroReal = a;
    }

    public double getNumeroImaginario() {
        return numeroImaginario;
    }

    public void setNumeroImaginario(double numeroImaginario) {
        this.numeroImaginario = numeroImaginario;
    }

    @Override
    public String toString() {
        return "Complejo{" +
                "a=" + numeroReal +
                ", b=" + numeroImaginario +
                '}';
    }

    //METODOS
    public static Complejo suma(Complejo z1, Complejo z2){
        return (new Complejo(z1.numeroReal+ z2.numeroReal, z1.numeroImaginario+z2.numeroImaginario));
    }

    public static Complejo resta(Complejo z1, Complejo z2){
        return (new Complejo(z1.numeroReal- z2.numeroReal, z1.numeroImaginario-z2.numeroImaginario));
    }

    public static Complejo multiplicacion(Complejo z1, Complejo z2){
        return (new Complejo((z1.numeroReal* z2.numeroReal) - (z1.numeroImaginario*z2.numeroImaginario), (z1.numeroReal* z2.numeroImaginario) + (z2.numeroReal*z1.numeroImaginario)));
    }

    public static Complejo division(Complejo z1, Complejo z2){
        double operacionZ1=((z1.numeroReal*z2.numeroReal)+(z1.numeroImaginario*z2.numeroImaginario))/(Math.pow(z2.numeroReal,2)+Math.pow(z2.numeroImaginario,2));
        double operacionZ2=((z1.numeroImaginario*z2.numeroReal)-(z1.numeroReal*z2.numeroImaginario))/(Math.pow(z2.numeroReal,2)+Math.pow(z2.numeroImaginario,2));
        return (new Complejo(operacionZ1,operacionZ2));
    }


}
