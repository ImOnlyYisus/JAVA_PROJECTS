package ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crea 50 aplicaciones usando el constructor por defecto, guárdalas en una lista y muéstralas por pantalla.
        List<App> listaApp = new ArrayList<>();

        for (int i = 0; i <50 ; i++) {
            listaApp.add(new App());
        }

        listaApp.forEach(System.out::println);

        //Guarda los datos de todas las App de la lista, en un fichero de texto llamado aplicacionestxt.txt, dentro del directorio “./appstxt”.
        Escritura.escribirFichero("appstxt",listaApp);

        //Guarda los datos de todas las App de la lista, en un fichero XML llamado aplicacionesxml.xml, dentro del directorio “./appsxml”.
        Escritura.escribirFicheroJSON("appJSON",listaApp);

        //Guarda los datos de todas las App de la lista, en un fichero JSON llamado aplicacionesxml.json, dentro del directorio “./appsjson”.
        Escritura.escribirFicheroXML("appXML",listaApp);
    }
}
