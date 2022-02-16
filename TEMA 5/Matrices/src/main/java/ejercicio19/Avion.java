package ejercicio19;

public class Avion {
    /*
    Crear un programa que mediante un menú permita reservar o cancelar asientos de un avión, así como mostrar qué asientos están ocupados y libres actualmente.
    El avión tendrá 25 filas de 4 asientos cada una.
     */

    private Asiento[][] asientosAvion = new Asiento[25][4];

    public Avion() {
        for (int i = 0; i <asientosAvion.length ; i++) {
            for (int j = 0; j <asientosAvion[i].length ; j++) {
                asientosAvion[i][j]=new Asiento();
            }
        }
    }

    public Asiento[][] getAsientosAvion() {
        return asientosAvion;
    }
}
