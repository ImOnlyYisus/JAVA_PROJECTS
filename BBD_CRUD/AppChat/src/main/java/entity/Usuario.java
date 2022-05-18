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
@NamedQueries({
	@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u"),
	@NamedQuery(name="Usuario.findByEmail", query="SELECT u FROM Usuario u where u.email like :email")
})

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String email;

	private String contraseña;

	@Column(name="key_user")
	private String keyUser;

	@Column(name="ult_conexion")
	private Timestamp ultConexion;

	@Column(name="ult_mod_passwd")
	private Timestamp ultModPasswd;

	//bi-directional many-to-one association to Chat
	@OneToMany(mappedBy="usuario", cascade=CascadeType.ALL)
	private List<Chat> chats;

	//bi-directional one-to-one association to Cuenta
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cuenta", referencedColumnName="id")
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [email=");
		builder.append(email);
		builder.append(", contraseña=");
		builder.append(contraseña);
		builder.append(", keyUser=");
		builder.append(keyUser);
		builder.append(", ultConexion=");
		builder.append(ultConexion);
		builder.append(", ultModPasswd=");
		builder.append(ultModPasswd);
		builder.append(", chats=");
		builder.append(chats);
		builder.append(", cuenta=");
		builder.append(cuenta.getId());
		builder.append("]");
		return builder.toString();
	}
	
	

}