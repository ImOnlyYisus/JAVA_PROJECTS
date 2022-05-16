package conexion.chat;

import conexion.ConexionBDD;
import conexion.rol.RolVO;
import conexion.usuarios.UserDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ChatDAO implements IChat{

    private Connection con = null;

    public ChatDAO() {
        con= ConexionBDD.getInstance();
    }

    @Override
    public List<ChatVO> getAll() throws SQLException {
        List<ChatVO> listaDatos = new ArrayList<>();

        //Consulta a la tabla chat
        try (Statement st = con.createStatement()) {
            ResultSet res = st.executeQuery("select * from chat");

            while (res.next()) {
                ChatVO chat = new ChatVO();
                chat.setId(res.getInt("chat_id"));
                chat.setNombre(res.getString("nombre"));
                chat.setIcono(res.getString("icono"));
                chat.setFechaCreacion(res.getTimestamp("fecha_creacion").toLocalDateTime());

                UserDAO creador = new UserDAO();
                chat.setCreador(creador.findByEmail(res.getString("creador")));

                listaDatos.add(chat);
            }
        }

        return listaDatos;
    }

    @Override
    public ChatVO findById(int id) throws SQLException {
        //Consulta a la tabla chat con id especifico
        ResultSet res = null;


        String query = "select * from chat where chat_id=?";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1,id);

            res= ps.executeQuery();

            if(res.next()){
                ChatVO chat = new ChatVO();
                chat.setId(res.getInt("chat_id"));
                chat.setNombre(res.getString("nombre"));
                chat.setIcono(res.getString("icono"));
                chat.setFechaCreacion(res.getTimestamp("fecha_creacion").toLocalDateTime());

                UserDAO creador = new UserDAO();
                chat.setCreador(creador.findByEmail(res.getString("creador")));

                return chat;
            }

        }

        return null;
    }

    @Override
    public ChatVO findByName(String name) throws SQLException {
        //Consulta a la tabla chat con name especifico
        ResultSet res = null;


        String query = "select * from chat where nombre like ?";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1,name);

            res= ps.executeQuery();

            if(res.next()){
                ChatVO chat = new ChatVO();
                chat.setId(res.getInt("chat_id"));
                chat.setNombre(res.getString("nombre"));
                chat.setIcono(res.getString("icono"));
                chat.setFechaCreacion(res.getTimestamp("fecha_creacion").toLocalDateTime());

                UserDAO creador = new UserDAO();
                chat.setCreador(creador.findByEmail(res.getString("creador")));

                return chat;
            }

        }

        return null;
    }

    @Override
    public String countChats() throws SQLException {
        try( Statement st = con.createStatement();){
            ResultSet res = st.executeQuery("SELECT COUNT(*) AS contadorChat FROM chat");
            res.next();
            
            return ""+res.getInt("contadorChat");
        }
    }
}
