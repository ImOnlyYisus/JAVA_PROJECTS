package jesus.empleados;

public class AgendaEmpleados {
    public static void main(String[] args) {
        Empleados empleado = new Empleados(); //Construtor vacio
        Empleados empleado2 = new Empleados("Paco","Rodrigez","12313A",1400,22,40,1,true,3);
        System.out.println(empleado.toString());
        System.out.println(empleado2.toString());

        empleado.setNombre("Juan");
        empleado.setApellidos("Gonzalez");
        empleado.setNif("123123213E");
        empleado.setSueldoBase(1300);
        empleado.setPagoHorasExtras(14);
        empleado.setHorasExtras(100);
        empleado.setIRPF(12);
        empleado.setCasado(false);
        empleado.setHijos(0);

        System.out.println(empleado.getNombre() + ", " + empleado.getApellidos() +"-->"+empleado.getHijos()+" hijos");

        System.out.println("Complemento horas extras "+empleado.getNombre()+":" + empleado.complementoHoras());
        System.out.println("Complemento horas extras "+empleado2.getNombre()+":" + empleado2.complementoHoras());

        System.out.println("Sueldo bruto "+empleado.getNombre()+":" + empleado.sueldoBruto());
        System.out.println("Sueldo bruto "+empleado2.getNombre()+":" + empleado2.sueldoBruto());

        System.out.println("IRPF "+empleado.getNombre()+":" + empleado.calcularIRPF());
        System.out.println("IRPF "+empleado2.getNombre()+":" + empleado2.calcularIRPF());

        System.out.println("Sueldo neto "+empleado.getNombre()+":" + empleado.sueldoNeto());
        System.out.println("Sueldo neto "+empleado2.getNombre()+":" + empleado2.sueldoNeto());

        empleado.basicInfo();
        empleado2.basicInfo();

        empleado.allInfo();
        empleado2.allInfo();

    }
}
