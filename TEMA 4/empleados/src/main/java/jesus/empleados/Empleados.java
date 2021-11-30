package jesus.empleados;

public class Empleados {
    private String nombre;
    private String apellidos;
    private String nif;
    private double sueldoBase;
    private double pagoHorasExtras; //entre 10 y 25 €
    private double horasExtras;
    private double IRPF;
    private boolean casado;
    private int hijos;

    public Empleados(){
    }

    public Empleados(String nombre, String apellidos, String nif, double sueldoBase, double pagoHorasExtras, double horasExtras,double IRPF,
                     boolean casado, int hijos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        if(pagoHorasExtras<10 || pagoHorasExtras>25){
            throw new IllegalArgumentException("Pago por horas extras fuera de rango");
        }
        this.pagoHorasExtras = pagoHorasExtras;
        this.IRPF = 20;
        if(IRPF > 1 && IRPF <20){ //Controlo entre 1% y 20%
            this.IRPF = IRPF;
        }

        this.casado = casado;
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHorasExtras() {
        return pagoHorasExtras;
    }

    public void setPagoHorasExtras(double pagoHorasExtras) {
        if(pagoHorasExtras<10 || pagoHorasExtras>25){
            throw new IllegalArgumentException("Pago por horas extras fuera de rango");
        }
        this.pagoHorasExtras = pagoHorasExtras;
    }

    public double getIRPF() {
        return IRPF;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = 20;
        if(IRPF > 1 && IRPF <20){ //Controlo entre 1% y 20%
            this.IRPF = IRPF;
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nif='" + nif + '\'' +
                ", sueldoBase=" + sueldoBase +
                ", pagoHorasExtras=" + pagoHorasExtras +
                ", horasExtras ="+ horasExtras +
                ", IRPF=" + IRPF +
                ", casado=" + casado +
                ", hijos=" + hijos +
                '}';
    }

    public double complementoHoras(){
        return (this.horasExtras*this.pagoHorasExtras);
    }

    public double sueldoBruto(){
        return complementoHoras()+this.sueldoBase;
    }

    public double calcularIRPF(){
        double irpf = this.IRPF;
        if(this.hijos !=0){
            irpf-=this.hijos;
        }

        if(this.casado){
            irpf-=2;
        }

        if(irpf<0){
            irpf =0;
        }

        return ((irpf*sueldoBruto())/100);
    }

    public double sueldoNeto(){
        return (sueldoBruto() - calcularIRPF());
    }

    public void basicInfo(){ //visualización en consola de la información básica del empleado: nombre, apellidos, NIF, estado civil y número de hijos.
        System.out.println("Nombre: " + this.nombre + "\n"+
                "Apellidos: " + this.apellidos + "\n"+
                "NIF: " + this.nif + "\n" +
                "Estado civil: " + (this.casado ? "casado" : "no casado") + "\n" +
                "Numero de hijos: " + this.hijos + "\n");
    }

    public void allInfo(){ /*visualización en consola de toda la información del empleado, esto es, la información básica más el sueldo base,
                            el complemento por horas extra, el sueldo bruto, la retención de IRPF y el sueldo neto. Intenta reutilizar código.*/

        System.out.println("Nombre: " + this.nombre + "\n"+
                "Apellidos: " + this.apellidos + "\n"+
                "NIF: " + this.nif + "\n" +
                "Sueldo base: " + this.sueldoBase + "\n" +
                "Complemento horas extras: " + complementoHoras() + "\n" +
                "Sueldo bruto: " + sueldoBruto() + "\n" +
                "Retencion IRPF: " + calcularIRPF() + "\n" +
                "Sueldo neto: " + sueldoNeto() + "\n");
    }
}
