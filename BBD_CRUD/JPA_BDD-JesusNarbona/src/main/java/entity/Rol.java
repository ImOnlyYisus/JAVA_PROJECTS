package entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Rol {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rol_id")
    private int rolId;
    @Basic
    @Column(name = "rol_name")
    private String rolName;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "rolByRolId")
    private Collection<Usuario> usuariosByRolId;

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rol rol = (Rol) o;

        if (rolId != rol.rolId) return false;
        if (rolName != null ? !rolName.equals(rol.rolName) : rol.rolName != null) return false;
        if (descripcion != null ? !descripcion.equals(rol.descripcion) : rol.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rolId;
        result = 31 * result + (rolName != null ? rolName.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    public Collection<Usuario> getUsuariosByRolId() {
        return usuariosByRolId;
    }

    public void setUsuariosByRolId(Collection<Usuario> usuariosByRolId) {
        this.usuariosByRolId = usuariosByRolId;
    }
}
