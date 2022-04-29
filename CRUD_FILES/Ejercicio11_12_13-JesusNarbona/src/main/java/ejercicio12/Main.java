package ejercicio12;

import ejercicio10.App;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<App> appList = Leer.leerArchivoJSON("appJSON");
        appList.forEach(System.out::println);
    }
}
