package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Chat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "chat_id")
    private int chatId;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "icono")
    private String icono;
    @Basic
    @Column(name = "fecha_creacion")
    private Timestamp fechaCreacion;
    @Basic
    @Column(name = "creador")
    private String creador;
    @ManyToOne
    @JoinColumn(name = "creador", referencedColumnName = "email")
    private Usuario usuarioByCreador;

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chat chat = (Chat) o;

        if (chatId != chat.chatId) return false;
        if (nombre != null ? !nombre.equals(chat.nombre) : chat.nombre != null) return false;
        if (icono != null ? !icono.equals(chat.icono) : chat.icono != null) return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(chat.fechaCreacion) : chat.fechaCreacion != null)
            return false;
        if (creador != null ? !creador.equals(chat.creador) : chat.creador != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chatId;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (icono != null ? icono.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (creador != null ? creador.hashCode() : 0);
        return result;
    }

    public Usuario getUsuarioByCreador() {
        return usuarioByCreador;
    }

    public void setUsuarioByCreador(Usuario usuarioByCreador) {
        this.usuarioByCreador = usuarioByCreador;
    }
}
