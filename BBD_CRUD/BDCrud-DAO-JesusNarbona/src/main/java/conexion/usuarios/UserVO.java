package conexion.usuarios;

import conexion.rol.RolVO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class UserVO {
    private String email;
    private String contraseña;
    private String nombre;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultModPassword;
    private LocalDateTime ultConexion;
    private String key;
    private RolVO rol;

    public UserVO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getUltModPassword() {
        return ultModPassword;
    }

    public void setUltModPassword(LocalDateTime ultModPassword) {
        this.ultModPassword = ultModPassword;
    }

    public LocalDateTime getUltConexion() {
        return ultConexion;
    }

    public void setUltConexion(LocalDateTime ultConexion) {
        this.ultConexion = ultConexion;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public RolVO getRol() {
        return rol;
    }

    public void setRol(RolVO rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "email='" + email + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", ultModPassword=" + ultModPassword +
                ", ultConexion=" + ultConexion +
                ", key='" + key + '\'' +
                ", rol=" + rol +
                '}';
    }
}
