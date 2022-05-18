package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String email;

	private String contraseña;

	@Column(name="key_user")
	private String keyUser;

	@Column(name="ult_conexion")
	private Timestamp ultConexion;

	@Column(name="ult_mod_passwd")
	private Timestamp ultModPasswd;

	//bi-directional many-to-one association to Chat
	@OneToMany(mappedBy="usuario")
	private List<Chat> chats;

	//bi-directional one-to-one association to Cuenta
	@OneToOne(mappedBy="usuario", fetch=FetchType.LAZY)
	private Cuenta cuenta;

	public Usuario() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getKeyUser() {
		return this.keyUser;
	}

	public void setKeyUser(String keyUser) {
		this.keyUser = keyUser;
	}

	public Timestamp getUltConexion() {
		return this.ultConexion;
	}

	public void setUltConexion(Timestamp ultConexion) {
		this.ultConexion = ultConexion;
	}

	public Timestamp getUltModPasswd() {
		return this.ultModPasswd;
	}

	public void setUltModPasswd(Timestamp ultModPasswd) {
		this.ultModPasswd = ultModPasswd;
	}

	public List<Chat> getChats() {
		return this.chats;
	}

	public void setChats(List<Chat> chats) {
		this.chats = chats;
	}

	public Chat addChat(Chat chat) {
		getChats().add(chat);
		chat.setUsuario(this);

		return chat;
	}

	public Chat removeChat(Chat chat) {
		getChats().remove(chat);
		chat.setUsuario(null);

		return chat;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}