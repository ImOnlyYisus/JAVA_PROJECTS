package vehiculos;

import java.util.ArrayList;
import java.util.Random;

public class Concecionario {
    private ArrayList<Vehiculo> vehiculos= new ArrayList<>();

    public Concecionario(){
        for (int i = 0; i <30 ; i++) {
            Random rd = new Random();
            int typeVehicle = rd.nextInt(3);
            String [] marcas = {"Renault","Seat","Opel","Mercedes","Citroen"};
            Vehiculo vehiculo = null;
            switch (typeVehicle){
                case 0:
                    vehiculo = new Turismo("1231a",123.4,"21312",marcas[rd.nextInt(marcas.length)],4,false,"Blanco");
                    break;
                case 1:
                    vehiculo = new Deportivo("1231a",123.4,"21312",marcas[rd.nextInt(marcas.length)],4,false,"Duros");
                    break;
                case 2:
                    vehiculo = new Furgoneta("1231a",123.4,"21312",marcas[rd.nextInt(marcas.length)],4,false);
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
                "vehiculos=" + vehiculos +
                '}';
    }

    public static void main(String[] args) {
        Concecionario c = new Concecionario();

        c.getVehiculos().forEach((vehiculo)->{
            System.out.println(vehiculo);
        });
    }
}
