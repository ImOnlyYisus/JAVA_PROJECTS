package estructurasSeleccion;


/**
 *
 * @author jesus
 */
public class Ej08 {
    public static void main(String[] args) {
        /*
            8.- ¿Qué realiza el siguiente programa Java?
        */
        
        char departamento = 'B';

      switch(departamento){
         case 'A' :
            System.out.println("Desarrollo");
            break;
            
         case 'B' :
            System.out.println("Recursos Humanos");
            break;
            
         case 'C' :
            System.out.println("Finanzas");
            break;
         case 'D' :
            System.out.println("Mercadeo");
         default :
            System.out.println("Departamento no válido");
      }
      
      System.out.println("Código para el departamento es " + departamento);
      //Resultado--> el valor de departamento es un char 'B' y en el switch evalua el valor de departamento y entra en el valor correcto
      //mostrando el valor recursos humanos
    }
}
