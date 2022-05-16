package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
    private static final String NOMBRE_BASE_DATOS = "java-data-base";
    private static final String SERVIDOR = "jdbc:mysql://imhzbuvhtpfe.eu-central-1.psdb.cloud/"+NOMBRE_BASE_DATOS;
    private static final String USER = "ms0ogci2zpr2";
    private static final String PASS = "pscale_pw_nrH2a28VuAIz47EAZLBOxZycBxZPXA41MwaksDsdRnQ";

    private static Connection instancia = null;

    // Constructor privado no accesible desde otras clases
    private ConexionBDD() {

    }

    // Método de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection
                instancia = DriverManager.getConnection(SERVIDOR, USER, PASS);

                System.out.println("Conexión a \'" + NOMBRE_BASE_DATOS + "\' exitosa!");

            } catch (SQLException e) {

                // Error en la conexión
                System.out.println("Conexión a " + NOMBRE_BASE_DATOS + " fallida\n" + e.getMessage());
            }
        }
        return instancia;
    }

    public static void main(String[] args) {
        Connection con = ConexionBDD.getInstance();
    }
}
