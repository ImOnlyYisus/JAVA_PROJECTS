package daw.jesusnarbona;

import java.time.YearMonth;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TarjetaCredito {
    //Los inicializo con un valor por defecto
    private String numeroTarjeta = "1111222233334444";
    private String entidadEmisora = "NBANK";
    private String titular = "Vico";
    private YearMonth fechaCaducidad = YearMonth.of(2022, 12);
    private double maximoCredito = 500;
    private boolean estado;
    private int pinTarjeta = 1111;

    //CONSTRUCTOR POR DEFECTO CON LOS VALORES POR DEFECTO
    public TarjetaCredito() {
    }

    //CONSTRUCTOR PARAMETRIZADO
    public TarjetaCredito(String numeroTarjeta, String entidadEmisora, String titular, YearMonth fechaCaducidad, double maximoCredito, boolean estado, int pinTarjeta) {
        //Compruebo que la tarjeta cumpla los requisitos
        if (comprobarNumeroTarjeta(numeroTarjeta)) {
            this.numeroTarjeta = numeroTarjeta;
        }
        this.entidadEmisora = entidadEmisora;
        this.titular = titular;
        this.fechaCaducidad = fechaCaducidad;
        //Debe estar entre 500€ y 3000€
        if (maximoCredito <= 3000 && maximoCredito >= 500) {
            this.maximoCredito = maximoCredito;
        }
        if (estado) {
            this.estado = !estado;
        }

        //4 digitos obligatorios y positivo
        if (Integer.toString(pinTarjeta).length()==4 && pinTarjeta>0) {
            this.pinTarjeta = pinTarjeta;
        }
    }

    //METODOS
    //METODO QUE COMPRUEBA QUE EL STRING TENGA 16 CARACTERES NUMERICOS (STATIC)
    private static boolean comprobarNumeroTarjeta(String numeroTarjeta) {
        boolean verificar = true;
        if (numeroTarjeta.length() == 16) {
            for (int i = 0; i < numeroTarjeta.length(); i++) {
                int caracteres = Character.getNumericValue(numeroTarjeta.charAt(i));
                ;
                //Char numerocos 0-9 (48-57)
                if (!(caracteres >= 48 && caracteres <= 57)) {
                    verificar = !verificar;
                    break;
                }
            }
        } else {
            verificar = !verificar;
        }

        return verificar;
    }

    //METODO PAGAR, PIDE PIN, CANTIDAD PAGAR, COMPRUEBA ACTIVACION, QUE EL PIN SEA IGUAL, Y CADUCIDAD
    public boolean pagar() {
        boolean verificarPago = true;
        Scanner teclado = new Scanner(System.in);
        int pin = 0;
        double dineroPagar = 0.0;
        if (estado) { //Miro si la tarjeta esta activada
            if (fechaCaducidad.isAfter(YearMonth.now())) { //Compruebo caducidad
                boolean comprobarEntero = true;
                do { //Compruebo que sea un entero
                    comprobarEntero = true;
                    System.out.println("Introduce el pin:");
                    try {
                        pin = teclado.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println("Introduce digitos numericos");
                        teclado.nextLine();
                        comprobarEntero = !comprobarEntero;
                    }

                } while (!comprobarEntero);

                if (pin == pinTarjeta) { //Miro si el pin introducido es el mismo
                    boolean comprobarDouble = true;
                    teclado.nextLine();
                    do { //Compruebo si es un double
                        comprobarDouble = true;
                        System.out.println("Introduzca la cantidad a pagar:");
                        try {
                            dineroPagar = teclado.nextDouble();
                        } catch (InputMismatchException ime) {
                            System.out.println("Introduce digitos numericos");
                            teclado.nextLine();
                            comprobarDouble = !comprobarDouble;
                        }
                    } while (!comprobarDouble);

                    if ((maximoCredito - dineroPagar) >= 0) { //Miro si hay dinero suficiente para comprar el articulo
                        System.out.println("Se realizo el pago correctamente");
                        maximoCredito -= dineroPagar;
                        if (maximoCredito == 0) {
                            anularTarjeta();
                        }
                    } else {
                        System.out.println("No se puede realizar esta compra, su limite de compra lo supera");
                        verificarPago = !verificarPago;

                    }
                } else {
                    System.out.println("El pin de la tarjeta no es el mismo");
                    verificarPago = !verificarPago;
                }
            } else {
                System.out.println("La tarjeta esta caducada");
                anularTarjeta();
                verificarPago = !verificarPago;
            }

        } else {
            verificarPago = !verificarPago;
            System.out.println("No esta activada la tarjeta");
        }
        return verificarPago;
    }

    //METODO PARA ACTIVAR TARJETA (CONVIERTE A TRUE)
    public void activarTarjeta() {
        this.estado = true;
    }

    //METODO PARA ANULAR LA TARJERTA (CONVIERTE A FALSE)
    public void anularTarjeta() {
        this.estado = false;
    }

    //METODO DE CLASE PARA COPIAR
    public static TarjetaCredito copiar(TarjetaCredito tarjetaCredito) { //PASO UN NUEVO OBJETO EN EL RETURN CON LOS MISMOS ATRIBUTOS
        return (new TarjetaCredito(tarjetaCredito.getNumeroTarjeta(), tarjetaCredito.getEntidadEmisora(), tarjetaCredito.getTitular(),
                tarjetaCredito.getFechaCaducidad(), tarjetaCredito.getMaximoCredito(), tarjetaCredito.isEstado(), tarjetaCredito.pinTarjeta));
    }

    //SETTERS (PIN, MAX. GASTOS) El estado no lo he puesto ya que hay metodos que lo cambian
    public void setMaximoCredito(double maximoCredito) {
        if (maximoCredito <= 3000 && maximoCredito >= 500) {
            this.maximoCredito = maximoCredito;
        }

    }

    public void setPinTarjeta(int pinTarjeta) {
        if ((Integer.toString(pinTarjeta).length()==4 && pinTarjeta>0)) {
            this.pinTarjeta = pinTarjeta;
        }

    }

    //GETTERS
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public YearMonth getFechaCaducidad() {
        return fechaCaducidad;
    }

    public double getMaximoCredito() {
        return maximoCredito;
    }

    public String getEntidadEmisora() {
        return entidadEmisora;
    }

    public String getTitular() {
        return titular;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getPinTarjeta() {
        return pinTarjeta;
    }

    //TO STRING PERSONALIZADO
    @Override
    public String toString() {
        return ("\t" + this.titular + "\t" + this.entidadEmisora + "\n"
                + "\t" + this.fechaCaducidad + "\t" + this.maximoCredito + "\n"
                + "\t" + this.numeroTarjeta);
    }
}
