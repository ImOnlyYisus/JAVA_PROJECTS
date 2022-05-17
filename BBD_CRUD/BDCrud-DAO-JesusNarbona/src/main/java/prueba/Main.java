package prueba;

import conexion.chat.ChatDAO;
import conexion.rol.RolDAO;
import conexion.rol.RolVO;
import conexion.usuarios.UserDAO;
import conexion.usuarios.UserVO;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RolDAO rolDao = new RolDAO();
        UserDAO userDao = new UserDAO();
        ChatDAO chatDao = new ChatDAO();

        try {
//            List<RolVO> roles = rolDao.getAll();
//            roles.forEach(System.out::println);

            System.out.println(rolDao.findById(1));
//            System.out.println(rolDao.findByName("usuario"));
//
            List<UserVO> users = userDao.getAll();
            users.forEach(System.out::println);
//
//            System.out.println(chatDao.countChats());

            UserVO usuarioNuevo= new UserVO();
            usuarioNuevo.setEmail("jaja@gmail.com");
            usuarioNuevo.setContraseña("jkashdjkashd");
            usuarioNuevo.setFechaCreacion(LocalDateTime.now());
            usuarioNuevo.setKey("jkhjhksdajhksda");
            usuarioNuevo.setRol(rolDao.findById(1));
            System.out.println(userDao.insertUser(usuarioNuevo));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
