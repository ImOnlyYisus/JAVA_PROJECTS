package ejercicio1;

public class Carta {
    private String numero;
    private Palos palo;
    private int valor;

    public Carta() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void ajustarValor(){
        if(this.numero.equalsIgnoreCase("A")){
            this.valor = 14;
        } else if (this.numero.equalsIgnoreCase("J")){
            this.valor = 10;
        }else if (this.numero.equalsIgnoreCase("Q")) {
            this.valor = 11;
        }else if (this.numero.equalsIgnoreCase("K")) {
            this.valor = 12;
        }else{
            this.valor= Integer.parseInt(numero);
        }
    }

    @Override
    public String toString() {
        String numeroCarta="";
        if(this.numero.equalsIgnoreCase("A")){
            numeroCarta ="AS";
        } else if (this.numero.equalsIgnoreCase("J")){
            numeroCarta ="JACK";
        }else if (this.numero.equalsIgnoreCase("Q")) {
            numeroCarta ="QUEEN";
        }else if (this.numero.equalsIgnoreCase("K")) {
            numeroCarta ="KING";
        }else{
            numeroCarta =numero;
        }
        return "Carta{" +
                "numero=" + numeroCarta +
                ", palo=" + palo +
                ", valor=" + valor +
                '}';
    }
}
