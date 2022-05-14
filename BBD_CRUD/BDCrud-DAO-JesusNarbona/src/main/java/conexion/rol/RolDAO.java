package conexion.rol;

import conexion.ConexionBDD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RolDAO implements IRol{
    private Connection con = null;

    public RolDAO() {
        con= ConexionBDD.getInstance();
    }

    @Override
    public List<RolVO> getAll() throws SQLException {
        List<RolVO> listaDatos = new ArrayList<>();

        //Consulta a la tabla rol
        try (Statement st = con.createStatement()) {
            ResultSet res = st.executeQuery("select * from rol");

            while (res.next()) {
                RolVO rol = new RolVO();

                rol.setRolID(res.getInt("rol_id"));
                rol.setRolName(res.getString("rol_name"));
                rol.setDescripcion(res.getString("descripcion"));

                listaDatos.add(rol);
            }
        }

        return listaDatos;
    }

    @Override
    public RolVO findById(int idRol) throws SQLException {
        //Consulta a la tabla rol con id especifico
        ResultSet res = null;


        String query = "select * from rol where rol_id=?";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1,idRol);

            res= ps.executeQuery();

            if(res.next()){
                RolVO rol = new RolVO();
                rol.setRolID(res.getInt("rol_id"));
                rol.setRolName(res.getString("rol_name"));
                rol.setDescripcion(res.getString("descripcion"));
                return rol;
            }

        }

        return null;
    }

    @Override
    public RolVO findByName(String name) throws SQLException {
        //Consulta a la tabla rol con id especifico
        ResultSet res = null;


        String query = "select * from rol where rol_name LIKE ?";
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1,name);

            res= ps.executeQuery();

            if(res.next()){
                RolVO rol = new RolVO();
                rol.setRolID(res.getInt("rol_id"));
                rol.setRolName(res.getString("rol_name"));
                rol.setDescripcion(res.getString("descripcion"));
                return rol;
            }

        }

        return null;
    }
}
