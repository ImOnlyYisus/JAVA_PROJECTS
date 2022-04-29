package ejercicio11;

import ejercicio10.App;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<App> appList = Leer.leecturaFicheroXML("appXML");

        appList.forEach(System.out::println);
    }
}
