package conexion.rol;

import java.sql.SQLException;
import java.util.List;

//Interfaz que usa el patron DAO sobre la tabla rol
public interface IRol {
    // Método para obtener todos los registros de la tabla
    List<RolVO> getAll() throws SQLException;

    //Metodo para obterner un rol con su id
    RolVO findById(int idRol) throws SQLException;

    //Metodo para obterner un rol con su nombre
    RolVO findByName(String name) throws SQLException;

}
