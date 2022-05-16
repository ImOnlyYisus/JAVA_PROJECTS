package conexion.usuarios;

import conexion.ConexionBDD;
import conexion.rol.RolDAO;
import conexion.rol.RolVO;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUser{
    private Connection con = null;

    public UserDAO() {
        con= ConexionBDD.getInstance();
    }

    @Override
    public List<UserVO> getAll() throws SQLException {
        List<UserVO> listaDatos = new ArrayList<>();

        //Consulta a la tabla rol
        try (Statement st = con.createStatement()) {
            ResultSet res = st.executeQuery("select * from usuario");

            while (res.next()) {
                UserVO user = new UserVO();

                user.setEmail(res.getString("email"));
                user.setContraseña("contraseña");
                user.setNombre("nombre");
                user.setFechaCreacion(res.getTimestamp("fecha_creacion").toLocalDateTime());

                LocalDateTime ultMod = res.getTimestamp("ult_mod_passwd") !=null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltModPassword(ultMod);

                LocalDateTime ultConexion= res.getTimestamp("ult_mod_passwd") !=null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltConexion(ultConexion);
                user.setKey(res.getString("key"));

                RolDAO rol = new RolDAO();
                user.setRol(rol.findById(res.getInt("rol_id")));

                listaDatos.add(user);
            }
        }

        return listaDatos;
    }

    @Override
    public UserVO findByEmail(String email) throws SQLException {
        //Consulta a la tabla usuario con email especifico
        ResultSet res = null;


        String query = "select * from usuario where email LIKE ?";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1,email);

            res= ps.executeQuery();

            if(res.next()){
                UserVO user = new UserVO();

                user.setEmail(res.getString("email"));
                user.setContraseña("contraseña");
                user.setNombre("nombre");
                user.setFechaCreacion(res.getTimestamp("fecha_creacion").toLocalDateTime());

                LocalDateTime ultMod = res.getTimestamp("ult_mod_passwd") !=null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltModPassword(ultMod);

                LocalDateTime ultConexion= res.getTimestamp("ult_mod_passwd") !=null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltConexion(ultConexion);
                user.setKey(res.getString("key"));

                RolDAO rol = new RolDAO();
                user.setRol(rol.findById(res.getInt("rol_id")));

                return user;
            }

        }

        return null;
    }

    @Override
    public UserVO findByName(String nombre) throws SQLException {
        //Consulta a la tabla usuario con email especifico
        ResultSet res = null;


        String query = "select * from usuario where nombre LIKE ?";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1,nombre);

            res= ps.executeQuery();

            if(res.next()){
                UserVO user = new UserVO();

                user.setEmail(res.getString("email"));
                user.setContraseña("contraseña");
                user.setNombre("nombre");
                user.setFechaCreacion(res.getTimestamp("fecha_creacion").toLocalDateTime());

                LocalDateTime ultMod = res.getTimestamp("ult_mod_passwd") !=null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltModPassword(ultMod);

                LocalDateTime ultConexion= res.getTimestamp("ult_mod_passwd") !=null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltConexion(ultConexion);
                user.setKey(res.getString("key"));

                RolDAO rol = new RolDAO();
                user.setRol(rol.findById(res.getInt("rol_id")));

                return user;
            }

        }

        return null;
    }

    @Override
    public List<UserVO> getAllUserByRolId(int rolID) throws SQLException {
        List<UserVO> listaDatos = new ArrayList<>();

        //Consulta a la tabla usuario con email especifico
        ResultSet res = null;

        String query = "select * from usuario where rol_id=?";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, rolID);

            res = ps.executeQuery();

            while (res.next()) {
                UserVO user = new UserVO();

                user.setEmail(res.getString("email"));
                user.setContraseña("contraseña");
                user.setNombre("nombre");
                user.setFechaCreacion(res.getTimestamp("fecha_creacion").toLocalDateTime());

                LocalDateTime ultMod = res.getTimestamp("ult_mod_passwd") != null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltModPassword(ultMod);

                LocalDateTime ultConexion = res.getTimestamp("ult_mod_passwd") != null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltConexion(ultConexion);
                user.setKey(res.getString("key"));

                RolDAO rol = new RolDAO();
                user.setRol(rol.findById(res.getInt("rol_id")));

                listaDatos.add(user);
            }

            return listaDatos;
        }
    }

    @Override
    public List<UserVO> getAllUserByRolName(String rolName) throws SQLException {
        List<UserVO> listaDatos = new ArrayList<>();

        //Consulta a la tabla usuario con email especifico
        ResultSet res = null;

        String query = "select * from usuario where rol_id = ( select rol_id from rol where rol_name like ?)";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, rolName);

            res = ps.executeQuery();

            while (res.next()) {
                UserVO user = new UserVO();

                user.setEmail(res.getString("email"));
                user.setContraseña("contraseña");
                user.setNombre("nombre");
                user.setFechaCreacion(res.getTimestamp("fecha_creacion").toLocalDateTime());

                LocalDateTime ultMod = res.getTimestamp("ult_mod_passwd") != null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltModPassword(ultMod);

                LocalDateTime ultConexion = res.getTimestamp("ult_mod_passwd") != null ? res.getTimestamp("ult_mod_passwd").toLocalDateTime() : null;
                user.setUltConexion(ultConexion);
                user.setKey(res.getString("key"));

                RolDAO rol = new RolDAO();
                user.setRol(rol.findById(res.getInt("rol_id")));

                listaDatos.add(user);
            }

            return listaDatos;
        }
    }

    @Override
    public String countUsers() throws SQLException {
        try( Statement st = con.createStatement();){
            ResultSet res = st.executeQuery("SELECT COUNT(*) AS contadorUsuario FROM usuario");
            res.next();

            return ""+res.getInt("contadorUsuario");
        }
    }
}
