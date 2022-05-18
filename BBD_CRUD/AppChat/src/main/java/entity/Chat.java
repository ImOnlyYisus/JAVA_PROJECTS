package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chat database table.
 * 
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Chat.findAll", query="SELECT c FROM Chat c"),
    @NamedQuery(name="Chat.findByName", query="SELECT c FROM Chat c where c.nombre like :nombre")
})

public class Chat implements Serializable {
    private static final long serialVersionUID = 1L;

    private String descripcion;

    private String icono;

    @Id
    @Column(name="id_chat")
    private int idChat;

    private String nombre;

    //bi-directional many-to-one association to Usuario
    @ManyToOne(cascade=CascadeType.ALL ,fetch=FetchType.LAZY)
    private Usuario usuario;

    public Chat() {
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIcono() {
        return this.icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public int getIdChat() {
        return this.idChat;
    }

    public void setIdChat(int idChat) {
        this.idChat = idChat;
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

    @Override
    public String toString() {
        String usuarioEmail = this.usuario!=null ? this.usuario.getEmail() : "";
        StringBuilder builder = new StringBuilder();
        builder.append("Chat [descripcion=");
        builder.append(descripcion);
        builder.append(", icono=");
        builder.append(icono);
        builder.append(", idChat=");
        builder.append(idChat);
        builder.append(", nombre=");
        builder.append(nombre);
        builder.append(", usuario=");
        builder.append(usuarioEmail);
        builder.append("]");
        return builder.toString();
    }



}