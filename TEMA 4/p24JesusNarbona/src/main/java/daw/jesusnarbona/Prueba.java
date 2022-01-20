package daw.jesusnarbona;

import java.time.YearMonth;

public class Prueba {
    public static void main(String[] args) {
        TarjetaCredito t1=new TarjetaCredito();
        TarjetaCredito t2=new TarjetaCredito("1111333344445555","BBVA","Jesus", YearMonth.of(2024,3), 1000,true,1234);
        TarjetaCredito t3= TarjetaCredito.copiar(t2);

        System.out.println(t1);
        System.out.println(t2);

        t2.anularTarjeta();
        System.out.println(t2.pagar());
        t2.activarTarjeta();
        System.out.println(t2.pagar());
        System.out.println(t3.pagar());
    }
}
