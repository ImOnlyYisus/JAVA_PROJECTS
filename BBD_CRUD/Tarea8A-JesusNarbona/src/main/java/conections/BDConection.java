package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConection {
    //database: java-data-base
    //username: o3dwn6bw18gl
    //host: imhzbuvhtpfe.eu-central-1.psdb.cloud
    //password: pscale_pw_sp2ZuGa_RI0GI4Wb2i2Nl--LahMq82-s2Dydc7iutp0
    private static final String SERVIDOR = "jdbc:mysql://imhzbuvhtpfe.eu-central-1.psdb.cloud";
    private static final String NOMBRE_BASE_DATOS = "java-data-base";
    private static final String USER = "o3dwn6bw18gl";
    private static final String PASS = "pscale_pw_sp2ZuGa_RI0GI4Wb2i2Nl--LahMq82-s2Dydc7iutp0";
    private static Connection instancia = null;

    public BDConection() {
    }

    // Método de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection
                instancia = DriverManager.getConnection(SERVIDOR + NOMBRE_BASE_DATOS, USER, PASS);

                System.out.println("Conexión realizada con éxito.");

            } catch (SQLException e) {

                // Error en la conexión
                System.out.println("Conexión fallida: " + e.getMessage());
            }
        }
        return instancia;
    }
}
