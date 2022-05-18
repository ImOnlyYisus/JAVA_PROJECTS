package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "contraseña")
    private String contraseña;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "fecha_creacion")
    private Timestamp fechaCreacion;
    @Basic
    @Column(name = "ult_mod_passwd")
    private Timestamp ultModPasswd;
    @Basic
    @Column(name = "ultima_conexion")
    private Timestamp ultimaConexion;
    @Basic
    @Column(name = "key")
    private String key;
    @Basic
    @Column(name = "rol_id")
    private Integer rolId;
    @OneToMany(mappedBy = "usuarioByCreador")
    private Collection<Chat> chatsByEmail;
    @ManyToOne
    @JoinColumn(name = "rol_id", referencedColumnName = "rol_id")
    private Rol rolByRolId;

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

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Timestamp getUltModPasswd() {
        return ultModPasswd;
    }

    public void setUltModPasswd(Timestamp ultModPasswd) {
        this.ultModPasswd = ultModPasswd;
    }

    public Timestamp getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Timestamp ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getRolId() {
        return rolId;
    }

    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (email != null ? !email.equals(usuario.email) : usuario.email != null) return false;
        if (contraseña != null ? !contraseña.equals(usuario.contraseña) : usuario.contraseña != null) return false;
        if (nombre != null ? !nombre.equals(usuario.nombre) : usuario.nombre != null) return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(usuario.fechaCreacion) : usuario.fechaCreacion != null)
            return false;
        if (ultModPasswd != null ? !ultModPasswd.equals(usuario.ultModPasswd) : usuario.ultModPasswd != null)
            return false;
        if (ultimaConexion != null ? !ultimaConexion.equals(usuario.ultimaConexion) : usuario.ultimaConexion != null)
            return false;
        if (key != null ? !key.equals(usuario.key) : usuario.key != null) return false;
        if (rolId != null ? !rolId.equals(usuario.rolId) : usuario.rolId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (contraseña != null ? contraseña.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (ultModPasswd != null ? ultModPasswd.hashCode() : 0);
        result = 31 * result + (ultimaConexion != null ? ultimaConexion.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (rolId != null ? rolId.hashCode() : 0);
        return result;
    }

    public Collection<Chat> getChatsByEmail() {
        return chatsByEmail;
    }

    public void setChatsByEmail(Collection<Chat> chatsByEmail) {
        this.chatsByEmail = chatsByEmail;
    }

    public Rol getRolByRolId() {
        return rolByRolId;
    }

    public void setRolByRolId(Rol rolByRolId) {
        this.rolByRolId = rolByRolId;
    }
}
