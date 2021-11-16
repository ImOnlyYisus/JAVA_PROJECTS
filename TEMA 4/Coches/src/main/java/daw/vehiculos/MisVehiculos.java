package daw.vehiculos;

public class MisVehiculos {
    public static void main(String[] args) {
        Vehiculos miCacharro = new Vehiculos("1234 ABC", "BMW", "GT", "White", 100.0 );

        System.out.println(miCacharro.matricula + "\t"+ miCacharro.marca + "\t" + miCacharro.modelo + "\t" + miCacharro.color + "\t" + miCacharro.tarifa);

        System.out.println("Mi vehiculo:\n" +
                "MATRICULA: " + miCacharro.getMatricula() + "\n" +
                "MARCA: " + miCacharro.getMarca() + "\n" +
                "MODELO: " + miCacharro.getModelo() + "\n" +
                "COLOR: " + miCacharro.getColor() + "\n" +
                "TARIFA: " + miCacharro.getTarifa());

        miCacharro.setMatricula("5678 DFG");
        System.out.println("Matricula changed: " + miCacharro.matricula);
    }
}
