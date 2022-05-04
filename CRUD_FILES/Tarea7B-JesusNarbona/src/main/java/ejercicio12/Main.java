package ejercicio12;

import ejercicio11.App;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<App> appList = Leer.leecturaFicheroXML("appsXML/aplicaciones.xml");

        appList.forEach(System.out::println);
    }
}
