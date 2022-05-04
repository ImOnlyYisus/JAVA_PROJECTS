package ejercicio13;

import ejercicio11.App;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<App> appList = Leer.leerArchivoJSON("appsJSON/aplicaciones.json");
        appList.forEach(System.out::println);
    }
}
