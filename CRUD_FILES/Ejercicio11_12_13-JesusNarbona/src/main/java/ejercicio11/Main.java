package ejercicio11;

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
        Escritura.crearCarpeta("appstxt");
        Escritura.escribirFichero("appstxt/aplicaciones.txt",listaApp);

        //Guarda los datos de todas las App de la lista, en un fichero XML llamado aplicacionesxml.xml, dentro del directorio “./appsxml”.
        Escritura.crearCarpeta("appsJSON");
        Escritura.escribirFicheroJSON("appsJSON/aplicaciones.json",listaApp);

        //Guarda los datos de todas las App de la lista, en un fichero JSON llamado aplicacionesxml.json, dentro del directorio “./appsjson”.
        Escritura.crearCarpeta("appsXML");
        Escritura.escribirFicheroXML("appsXML/aplicaciones.xml",listaApp);

        //Crea una carpeta “./copias” y realiza una copia de los ficheros anteriores dentro de ella.
        Escritura.crearCarpeta("copias");
        Escritura.copiarFicheros("appstxt/aplicaciones.txt", "./copias/aplicaciones.txt");
        Escritura.copiarFicheros("appsXML/aplicaciones.xml", "./copias/aplicaciones.xml");
        Escritura.copiarFicheros("appsJSON/aplicaciones.json", "./copias/aplicaciones.json");

        //En una carpeta “./aplicaciones” crea un archivo de texto por cada aplicación que haya en la lista. El archivo se llamará igual que la
        //app y contendrá los datos de la aplicación, separando los campos por el carácter (;).
        Escritura.crearCarpeta("aplicaciones");
        listaApp.forEach(app -> {
            Escritura.escribirFicherosPorApp("aplicaciones/"+app.getNombre(), app);
        });

    }
}
