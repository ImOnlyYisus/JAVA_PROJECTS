package Ejercicio16;

import java.util.Random;

public class LanzarMonedaMejorado {
    private boolean [] arrayBolean;

    public LanzarMonedaMejorado(int numeroDeLanzamientos) {
        arrayBolean = new boolean[numeroDeLanzamientos];
    }

    //a-un método para rellenar el array, de forma que simule 1000 lanzamientos de una moneda. El método debe almacenar el resultado de cada tirada en el array.
    public void simularTiradas(){
        Random rd= new Random();
        for (int i = 0; i <arrayBolean.length ; i++) {
            arrayBolean[i]= rd.nextBoolean();
        }
    }

    //b-un método para saber cuántas “caras” salieron después de los lanzamientos. (IMAGINEMOS QUE CARA ES TRUE)
    public int contarCuantasCaras(){
        int contador = 0;
        for (int i = 0; i <arrayBolean.length ; i++) {
            if(arrayBolean[i]){
                contador++;
            }
        }
        return contador;
    }

    //c-un método para saber cuántas “cruces” salieron después de los lanzamientos. (CRUZ ES FALSE)
    public int contarCuantasCruces(){
        return (arrayBolean.length - contarCuantasCaras());
    }

    //d-un método para imprimir el resultado de los 1000 lanzamientos, de forma que aparezca el número de lanzamiento y el resultado (cara o cruz)
    public String printArray(){
        String arrayFormateado = "";

        for (int i = 0; i < arrayBolean.length ; i++) {
            arrayFormateado += i+ "->"+ (arrayBolean[i] ? "Cara" : "Cruz") +"\n";
        }

        return arrayFormateado;
    }

}
