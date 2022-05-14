package conexion.chat;

import java.sql.SQLException;
import java.util.List;

public interface IChat {
    // Método para obtener todos los registros de la tabla chat
    List<ChatVO> getAll() throws SQLException;

    //Metodo para obterner un chat con su id
    ChatVO findById(int id) throws SQLException;

    //Metodo para obterner un chat con su nombre
    ChatVO findByName(String name) throws SQLException;
}
