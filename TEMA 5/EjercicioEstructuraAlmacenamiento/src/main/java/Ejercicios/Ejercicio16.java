package Ejercicios;
import Ejercicio16.LanzarMonedaMejorado;

public class Ejercicio16 {
    public static void main(String[] args) {
        LanzarMonedaMejorado lanzamiento = new LanzarMonedaMejorado(4);

        lanzamiento.simularTiradas();
        System.out.println(lanzamiento.contarCuantasCaras());
        System.out.println(lanzamiento.contarCuantasCruces());
        System.out.println(lanzamiento.printArray());
    }
}
