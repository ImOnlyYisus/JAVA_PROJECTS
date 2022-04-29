package ejercicio11;

import ejercicio10.App;
import ejercicio10.Apps;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Leer {
    public static List<App> leecturaFicheroXML(String nombreFichero){
        List<App> appList = new ArrayList<>();
        try {
            // Crea el contexto JAXB
            JAXBContext contexto = JAXBContext.newInstance(Apps.class);

            // Crea el objeto Unmarshaller
            Unmarshaller um = contexto.createUnmarshaller();

            // Llama al método de unmarshalling

           Apps apps = (Apps) um.unmarshal(new File(nombreFichero));
            appList.addAll(apps.getAppList());
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return appList;
    }
}
