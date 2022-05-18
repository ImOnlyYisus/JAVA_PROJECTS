package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the cuenta database table.
 * 
 */
@Entity
@NamedQuery(name="Cuenta.findAll", query="SELECT c FROM Cuenta c")
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	private String nombre;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cuenta")
	private String idCuenta;

	//bi-directional one-to-one association to Usuario
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cuenta", referencedColumnName="id_cuenta",insertable=false, updatable=false)
	private Usuario usuario;

	public Cuenta() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

}