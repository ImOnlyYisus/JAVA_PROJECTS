package Ejercicios;
import Ejercicio15.LanzarMoneda;

public class Ejercicio15 {
    public static void main(String[] args) {
        LanzarMoneda lanzamiento = new LanzarMoneda();

        lanzamiento.simularTiradas();
        System.out.println(lanzamiento.contarCuantasCaras());
        System.out.println(lanzamiento.contarCuantasCruces());
        System.out.println(lanzamiento.printArray());
    }
}
