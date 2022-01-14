package jesus;
//AUTOR:JESUS NARBONA

public class Complejo {
    private double numeroReal;
    private double numeroImaginario;
    private static int instancias;

    //Constructor

    public Complejo() {
        instancias++;
    }

    public Complejo(double nuemeroReal, double numeroImaginario) {
        this.numeroReal = nuemeroReal;
        this.numeroImaginario = numeroImaginario;
        instancias++;
    }

    //GETTER SETTER

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
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
                "numeroReal=" + numeroReal +
                ", numeroImaginario=" + numeroImaginario +
                '}';
    }

    //METODOS
    public static Complejo suma(Complejo numeroComplejo1, Complejo numeroComplejo2){
        return (new Complejo(numeroComplejo1.numeroReal+ numeroComplejo2.numeroReal, numeroComplejo1.numeroImaginario+numeroComplejo2.numeroImaginario));
    }

    public static Complejo resta(Complejo numeroComplejo1, Complejo numeroComplejo2){
        return (new Complejo(numeroComplejo1.numeroReal- numeroComplejo2.numeroReal, numeroComplejo1.numeroImaginario-numeroComplejo2.numeroImaginario));
    }

    public static Complejo multiplicacion(Complejo numeroComplejo1, Complejo numeroComplejo2){
        double operacionZ1=(numeroComplejo1.numeroReal* numeroComplejo2.numeroReal) - (numeroComplejo1.numeroImaginario*numeroComplejo2.numeroImaginario);
        double operacionZ2=((numeroComplejo1.numeroReal* numeroComplejo2.numeroImaginario) + (numeroComplejo2.numeroReal*numeroComplejo1.numeroImaginario));
        return (new Complejo(operacionZ1,operacionZ2));
    }

    public static Complejo division(Complejo numeroComplejo1, Complejo numeroComplejo2){
        double operacionZ1=((numeroComplejo1.numeroReal*numeroComplejo2.numeroReal)+(numeroComplejo1.numeroImaginario*numeroComplejo2.numeroImaginario))/(Math.pow(numeroComplejo2.numeroReal,2)+Math.pow(numeroComplejo2.numeroImaginario,2));
        double operacionZ2=((numeroComplejo1.numeroImaginario*numeroComplejo2.numeroReal)-(numeroComplejo1.numeroReal*numeroComplejo2.numeroImaginario))/(Math.pow(numeroComplejo2.numeroReal,2)+Math.pow(numeroComplejo2.numeroImaginario,2));
        return (new Complejo(operacionZ1,operacionZ2));
    }

    public static int getInstancias(){
        return instancias;
    }


}
