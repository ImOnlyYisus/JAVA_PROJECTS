package recursividad;

public class BusquedaSecuencial {
    public static int[] listaNumero ={0,1,2,3,4,5,6,7,8,9,10};

    public static int busquedaSecuencial(int numero,int tamaño){
        int index=-1;
        if(tamaño<= listaNumero.length || tamaño>0){
            if(listaNumero[tamaño-1]==numero){
                index=tamaño-1;
                return index;
            }

            return busquedaSecuencial(numero,tamaño-1);
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(busquedaSecuencial(6, listaNumero.length));
    }
}
