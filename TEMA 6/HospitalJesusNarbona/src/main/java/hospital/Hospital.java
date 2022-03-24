package hospital;

import java.util.ArrayList;

public class Hospital {
    private String nombre;
    private String direccion;
    private int numeroCamas;
    private ArrayList<Empleado> empleados=new ArrayList<>();
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void contrararEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void ingresarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroCamas=" + numeroCamas +
                '}';
    }
}
