package prueba;

import conexion.rol.RolDAO;
import conexion.rol.RolVO;
import conexion.usuarios.UserDAO;
import conexion.usuarios.UserVO;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RolDAO rolDao = new RolDAO();
        UserDAO userDao = new UserDAO();

        try {
            List<RolVO> roles = rolDao.getAll();
            roles.forEach(System.out::println);

            System.out.println(rolDao.findById(1));
            System.out.println(rolDao.findByName("usuario"));

            List<UserVO> users = userDao.getAllUserByRolName("vip");
            users.forEach(System.out::println);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
