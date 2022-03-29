package ejercicio14;

public class CampanaExtractora extends Electrodomestico{
    private double decibelios=50;

    public CampanaExtractora(double consumo, String modelo, double decibelios) {
        super(consumo, modelo);
        if(decibelios>=50){
            this.decibelios=decibelios;
        }
    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        if(decibelios>=50){
            this.decibelios=decibelios;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"CampanaExtractora{" +
                "decibelios=" + decibelios +
                '}';
    }
}
