package ejercicio11;

import java.util.ArrayList;

public class Jerarquia {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 12)); // Base=10 Altura=12
        figuras.add(new Triangulo(10, 5)); // Base=10 Altura=5
        figuras.add(new Romboide(15, 5)); // Base=15, Altura=5
        for(Figura f : figuras){
            System.out.println("Área: " + f.calcularArea());
        }
    }
}

