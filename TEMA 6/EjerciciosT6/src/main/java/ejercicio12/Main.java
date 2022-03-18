package ejercicio12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        cuentas.add(new CuentaCorriente(new Persona("Pepe","Fdz","21321das"),1000));
        cuentas.add(new CuentaAhorro(new Persona("Pepe","Fdz","21321das"),2.5,5.5));

        for (Cuenta cuenta: cuentas) {
            cuenta.actualiozarSaldo();
            System.out.println(cuenta.getSaldo());
            cuenta.retirar(10);
            System.out.println(cuenta.getSaldo());
        }
    }
}
