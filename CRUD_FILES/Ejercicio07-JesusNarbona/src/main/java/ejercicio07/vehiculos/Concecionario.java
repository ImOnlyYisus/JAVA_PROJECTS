package ejercicio07.vehiculos;

import java.util.ArrayList;
import java.util.Random;

public class Concecionario {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Concecionario() {
        for (int i = 0; i < 30; i++) {
            Random rd = new Random();
            String[] marcas = {"Renault", "Seat", "Opel", "Mercedes", "Citroen"};
            Vehiculo vehiculo = null;
            if (i <=10) {
                vehiculo = new Turismo("1231a", 123.4, "21312", marcas[rd.nextInt(marcas.length)], 4, false, "Blanco");
            } else if (i <= 20 && i > 10) {
                vehiculo = new Deportivo("1231a", 123.4, "21312", marcas[rd.nextInt(marcas.length)], 4, false, "Duros");
            } else if (i <= 30 && i>20) {
                vehiculo = new Furgoneta("1231a", 123.4, "21312", marcas[rd.nextInt(marcas.length)], 4, false);
            }
            vehiculos.add(vehiculo);

        }
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Concecionario{" +
                "ejercicio04.vehiculos=" + vehiculos +
                '}';
    }

    public static void main(String[] args) {
        Concecionario c = new Concecionario();

        c.getVehiculos().forEach((vehiculo) -> {
            System.out.println(vehiculo);
        });
    }
}
