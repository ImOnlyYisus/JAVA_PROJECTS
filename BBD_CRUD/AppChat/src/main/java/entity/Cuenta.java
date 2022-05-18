package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the cuenta database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Cuenta.findAll", query="SELECT c FROM Cuenta c"),
	@NamedQuery(name="Cuenta.findByName", query="SELECT c FROM Cuenta c where c.nombre like :nombre")
})
public class Cuenta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    private String descripcion;

    @Column(name="fecha_creacion")
    private Timestamp fechaCreacion;

    private String nombre;

    //bi-directional one-to-one association to Usuario
    @OneToOne(mappedBy="cuenta", fetch=FetchType.LAZY)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String usuarioEmail = this.usuario!=null ? this.usuario.getEmail() : "";
        StringBuilder builder = new StringBuilder();
        builder.append("Cuenta [id=");
        builder.append(id);
        builder.append(", descripcion=");
        builder.append(descripcion);
        builder.append(", fechaCreacion=");
        builder.append(fechaCreacion);
        builder.append(", nombre=");
        builder.append(nombre);
        builder.append(", usuario=");
        builder.append(usuarioEmail);
        builder.append("]");
        return builder.toString();
    }



}