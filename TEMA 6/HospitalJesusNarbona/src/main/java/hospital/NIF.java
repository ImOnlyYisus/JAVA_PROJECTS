package hospital;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NIF {
    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(String numero, LocalDate fechaCaducidad) {
        if(numero.length()==8){
            this.numero = numero;
            this.fechaCaducidad = fechaCaducidad;
            this.letra = calcularLetra();
        }
    }

    //Metdodo para calcular la letra segun el numero de DNI
    private char calcularLetra(){
        int resto=0;
        try {
            resto = Integer.parseInt(numero) % 23;
        } catch (NumberFormatException nfe) {
            System.out.println("Formato de numero incorrecto "+this.numero);
            this.numero="0";
        }

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[resto];
    }

    //Metodo que amplia la fecha de caducidad 10 años
    public void renovar(LocalDate fechaSolicitudRenovacion){
        if(ChronoUnit.YEARS.between(this.fechaCaducidad,fechaSolicitudRenovacion)<=10){
            fechaCaducidad=fechaSolicitudRenovacion;
        }
    }

    public String getNumero() {
        return numero;
    }


    public char getLetra() {
        return letra;
    }


    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public String toString() {
        return "NIF{" +
                "numero='" + numero + '\'' +
                ", letra=" + letra +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}
