package conexion.usuarios;

import java.sql.SQLException;
import java.util.List;

public interface IUser {
    //Metodo para obtener todos los usuarios de la tabla usuario
    List<UserVO> getAll() throws SQLException;

    //Metodo para obtener el usuario con un email especifico
    UserVO findByEmail(String email) throws SQLException;

    //Metodo para obtener el usuario con un nombre especifico
    UserVO findByName(String nombre) throws SQLException;

    //Metodo para obtener todos los usuarios de la tabla usuario con un rol_id especifico
    List<UserVO> getAllUserByRolId(int rolID ) throws SQLException;

    //Metodo para obtener todos los usuarios de la tabla usuario con un rol_name especifico
    List<UserVO> getAllUserByRolName(String rolName ) throws SQLException;

    //Metodo para obtener el total de roles
    String countUsers() throws SQLException;

    //Metodo para insertar un usuario
    boolean insertUser(UserVO usuario) throws SQLException;
}
