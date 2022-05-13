package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConection {
    private static final String SERVIDOR = "jdbc:mysql://localhost/";
    private static final String NOMBRE_BASE_DATOS = "java-data-base";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection instancia = null;

    // Patrón Singleton
    // Constructor privado no accesible desde otras clases
    private BDConection() {
    }

    // Método de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection
                instancia = DriverManager.getConnection(SERVIDOR + NOMBRE_BASE_DATOS, USER, PASS);

                System.out.println("Conexión a \'" + NOMBRE_BASE_DATOS + "\' exitosa!");

            } catch (SQLException e) {

                // Error en la conexión
                System.out.println("Conexión a " + NOMBRE_BASE_DATOS + "fallida\n" + e.getMessage());
            }
        }
        return instancia;
    }
}
