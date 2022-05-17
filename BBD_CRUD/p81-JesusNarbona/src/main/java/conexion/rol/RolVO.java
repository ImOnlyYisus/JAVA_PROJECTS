package conexion.rol;

public class RolVO {
    private int rolID;
    private String rolName;
    private String descripcion;

    public RolVO() {
    }

    public RolVO(int rolID, String rolName, String descripcion) {
        this.rolID = rolID;
        this.rolName = rolName;
        this.descripcion = descripcion;
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
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
    public String toString() {
        return "RolVO{" +
                "rolID=" + rolID +
                ", rolName='" + rolName + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
