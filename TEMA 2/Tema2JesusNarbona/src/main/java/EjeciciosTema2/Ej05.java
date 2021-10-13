
package EjeciciosTema2;

/**
 *
 * @author jesus
 */

public class Ej05 {
    
    //Main para ejecucion
    public static void main(String[] args) {
        
        //Codigo para ejecutar
        
        //a- Declara una variable primitiva de cada uno de los tipos estudiados.
            boolean varBooleana = false;
            char varChar = 't';
            byte varByte = 41;              //8bits de memoria
            short varShort = 323 ;          //16bits de memoria
            int varInt = 10;                //32bits de memoria
            long varLong = 51515155L;       //64bits de memoria
            float varFloat = 10.223f;         //32bits de memoria
            double varDouble = 10.212313;   //64bits de memoria
        
        //b.- Declara una constante numérica de tipo double y otra de tipo int. Presta especial atención a la hora de poner el nombre de estas constantes y usa el modificador final.
            final double PI = 3.1415;
            final int minutosHora = 60;
        
        //c.- Declara un objeto String.
            String frase = "Hola mi nombre es Jesus";
            
        //d.- Inicializa las variables, la constante y el objeto con literales de tu elección.
        /*e.- Muestra en pantalla cada una de las variables, constantes y objetos anteriores, en distintas líneas y especificando el tamaño que ocupan en memoria, según la tabla
              que hay en los apuntes (paǵ 7).*/
            System.out.println("Esta variable de tipo Booleana tiene el valor de: [" + varBooleana + "]" );
            System.out.println("Esta variable de tipo Char tiene el valor de: [" + varChar + "]" );
            System.out.println("Esta variable de tipo Byte tiene el valor de: [" + varByte + "]\t\t -Ocupa en memoria 8bits");
            System.out.println("Esta variable de tipo Short tiene el valor de: [" + varShort + "]\t\t -Ocupa en memoria 16bits");
            System.out.println("Esta variable de tipo Int tiene el valor de: [" + varInt + "]\t\t -Ocupa en memoria 32bits");
            System.out.println("Esta variable de tipo Long tiene el valor de: [" + varLong + "]\t -Ocupa en memoria 64bits");
            System.out.println("Esta variable de tipo Float tiene el valor de: [" + varFloat + "]\t\t -Ocupa en memoria 32bits");
            System.out.println("Esta variable de tipo Double tiene el valor de: [" + varDouble + "]\t -Ocupa en memoria 64bits");
    }
}
