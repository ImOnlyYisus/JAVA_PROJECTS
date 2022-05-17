package conexion.chat;

import conexion.usuarios.UserVO;

import java.time.LocalDateTime;

public class ChatVO {
    private int id;
    private String nombre;
    private String icono;
    private LocalDateTime fechaCreacion;
    private UserVO creador;

    public ChatVO(int id, String nombre, String icono, LocalDateTime fechaCreacion, UserVO creador) {
        this.id = id;
        this.nombre = nombre;
        this.icono = icono;
        this.fechaCreacion = fechaCreacion;
        this.creador = creador;
    }

    public ChatVO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public UserVO getCreador() {
        return creador;
    }

    public void setCreador(UserVO creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "ChatVO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", icono='" + icono + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", creador='" + creador + '\'' +
                '}';
    }
}
