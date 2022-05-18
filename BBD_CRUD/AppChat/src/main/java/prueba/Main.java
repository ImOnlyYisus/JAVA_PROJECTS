package prueba;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import controladores.ControladorChat;
import controladores.ControladorCuenta;
import controladores.ControladorUsuario;
import entity.Cuenta;
import entity.Usuario;

public class Main {

	public static void main(String[] args) {
		ControladorUsuario controladorUsuario = new ControladorUsuario();
        controladorUsuario.findAll().forEach(System.out::println);
		
		ControladorChat controladorChat = new ControladorChat();
		
		ControladorCuenta controladorCuenta = new ControladorCuenta();
		
//		Cuenta c1 = new Cuenta();
//		c1.setNombre("prueba");
//		c1.setFechaCreacion(Timestamp.valueOf(LocalDateTime.now()));
//		c1.setDescripcion("creacion de prueba");
//		controladorCuenta.createCuenta(c1);
		
		System.out.println();
		
		Usuario u1 = new Usuario();
		u1.setEmail("ejemplo.png@gmail.com");
		u1.setContraseña("asdkisafjk");
		u1.setCuenta(controladorCuenta.findByName("prueba"));
		u1.setKeyUser("prueba");
		
		controladorUsuario.createUsuario(u1);
	}

}
