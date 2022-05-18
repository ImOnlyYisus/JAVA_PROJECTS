package prueba;

import conexion.chat.ChatDAO;
import conexion.rol.RolDAO;
import conexion.rol.RolVO;
import conexion.usuarios.UserDAO;
import conexion.usuarios.UserVO;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RolDAO rolDao = new RolDAO();
        UserDAO userDao = new UserDAO();
        ChatDAO chatDao = new ChatDAO();

        try {
            //Select
            List<RolVO> roles = rolDao.getAll();
            roles.forEach(System.out::println);

            System.out.println(rolDao.findById(1));
            System.out.println(rolDao.findByName("usuario"));
            System.out.println(chatDao.countChats());

            //----
            UserVO usuarioNuevo1= new UserVO("jaja@gmail.com", "12345","ejemplo",LocalDateTime.now(),null,null,"jkhjhksdajhksda",rolDao.findByName("vip"));
            UserVO usuarioNuevo2= new UserVO("jaja2@gmail.com", "12345","ejemplo",LocalDateTime.now(),null,null,"jkhjhksdajhksda",rolDao.findByName("usuario"));
            UserVO usuarioNuevo3= new UserVO("jaja3@gmail.com", "12345","ejemplo",LocalDateTime.now(),null,null,"jkhjhksdajhksda",rolDao.findByName("administrador"));
            List<UserVO> listaUser = new ArrayList<>();
            listaUser.add(usuarioNuevo1);
            listaUser.add(usuarioNuevo2);
            listaUser.add(usuarioNuevo3);

            //Insertar lista usuarios
            System.out.println(userDao.insertListUser(listaUser));

            //Insertar usuario que ya esta
            System.out.println(userDao.insertUser(usuarioNuevo1));

            //Select de nuevos usuarios
            List<UserVO> users = userDao.getAll();
            users.forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
