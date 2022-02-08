package vehiculo;

public class Prueba {
    public static void main(String[] args) {
        Vehiculo [] arrayVehiculos = generarArrayVehiculos(100);
        mostrarDatosVehiculos(arrayVehiculos);
    }

    private static Vehiculo [] generarArrayVehiculos (int numeroDeVehiculos){
        Vehiculo [] vehiculosArr = new Vehiculo[numeroDeVehiculos];

        for (int i = 0; i <vehiculosArr.length ; i++) {
            vehiculosArr[i]=new Vehiculo();

        }
        return vehiculosArr;
    }

    private static void mostrarDatosVehiculos(Vehiculo[] vehiculosArr){
        for (Vehiculo vehiculos:vehiculosArr){
            System.out.println(vehiculos);
        }

    }
}
