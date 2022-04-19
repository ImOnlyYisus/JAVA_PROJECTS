package tienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MiTienda {
    private ArrayList<Producto> listaProducto = new ArrayList<>();
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public MiTienda(ArrayList<Producto> listaProducto, ArrayList<Libro> listaLibros) {
        this.listaProducto = listaProducto;
        this.listaLibros = listaLibros;
    }

    public MiTienda() {

    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public static void main(String[] args) {
        //Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.
        ArrayList<Producto> listaProducto = new ArrayList<>();
        //Conversion implicita de cada tipo a producto, es decir por ejemplo Musica hace un casting implicito a producto para poder introducirlo en la lista
        listaProducto.add(new Musica("aaa1", 14.5, 12, "Melendrill", "Melendi")); //Conversion implicita
        listaProducto.add(new Musica("aaa2", 15.7, 13, "Cancion de edSheeran", "Ed Sheeran")); //Conversion implicita
        listaProducto.add(new Pantalon("bbb1", 25.6, 15, "Pantalon de algodon", "Nike", "L")); //Conversion implicita
        listaProducto.add(new LibroPapel("ddd1", 19.9, 10, "Juego de tronos", "84843d", 356)); //Conversion implicita
        listaProducto.add(new LibroPapel("ddd2", 7.9, 11, "Newton relatividad", "432423d", 125)); //Conversion implicita
        listaProducto.add(new Pantalon("bbb2", 34.5, 14, "Pantalon de poliestileno", "Adidas", "M")); //Conversion implicita
        listaProducto.add(new LibroDigital("ccc1", 25.4, 10, "El señor de los anillos", "123456a", 450000)); //Conversion implicita
        listaProducto.add(new LibroDigital("ccc2", 15.5, 11, "El principito", "234567a", 250000)); //Conversion implicita


        //Muestra los datos de los productos usando un foreach y el método toString(). Contesta usando un comentario en el código: ¿es toString()
        //un método polimórfico? Justifica la respuesta.
        System.out.println("----Lista de productos----");
        listaProducto.forEach((producto) -> {
            System.out.println(producto); //toString es polimórfico porque segun el tipo de objeto que sea, ejecutara una función u otra
            System.out.println();
        });

        //Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y una expresión lambda.
        Comparator<Producto> criterioPrecio = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
        listaProducto.sort(criterioPrecio);
        //Muestra la lista de productos ordenados por precio.
        System.out.println("\nORDENADOS POR PRECIO");
        listaProducto.forEach((producto) -> {
            System.out.println(producto);
            System.out.println();
        });

        //Ordena la lista de productos según el código, haciendo uso de <<Comparator>> y una expresión lambda.
        System.out.println("\nORDENADOS POR COD");
        Comparator<Producto> criterioCodigo = (p1, p2) -> p1.getCodigo().compareToIgnoreCase(p2.getCodigo());
        listaProducto.sort(criterioCodigo);
        //Muestra la lista de productos ordenados por código.
        listaProducto.forEach((producto) -> {
            System.out.println(producto); //toString es polimórfico porque segun el tipo de objeto que sea, ejecutara una función u otra
            System.out.println();
        });

        //Realiza la búsqueda binaria según su código de algún producto que exista dentro de la lista y otro que no exista, mostrando la
        //posición que ocupa en la lista.

        //Previamente ordenado por cod en el apartado anterior (en el caso de que no estuviera, se aplicaria antes de ejecutar el codigo)
        //He creado dos productos cualquieras, al no poder crear un objecto Producto por ser una clase abstract, he creado dos producto del cual el valor
        //que me interesa es el codigo lo demas es null o 0
        LibroDigital productoBuscarExistente = new LibroDigital("ddd1", 0, 0, null, null, 0);
        Musica productoBuscarNoExistente = new Musica("21988", 0, 0, null, null);
        int index1 = Collections.binarySearch(listaProducto, productoBuscarExistente, criterioCodigo); //Conversion implicita, convierte los tipos anteriores a productos, para poder buscarlo
        int index2 = Collections.binarySearch(listaProducto, productoBuscarNoExistente, criterioCodigo);
        System.out.println("\nBUSCAR PRODUCTO CON EL CODIGO");
        System.out.println("Posicion producto exis.: " + index1);
        System.out.println("Posicion producto no exis.: " + index2);

        //Recorre la lista de productos y guarda todos los libros en una lista de libros.
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaProducto.forEach((producto) -> {
            if (producto instanceof Libro) {
                listaLibros.add((Libro) producto); //Conversion explicita
            }
        });
        //Muestra los datos de la lista de libros usando un foreach y el método toString().
        System.out.println("\nLISTA DE LIBROS");
        listaLibros.forEach(libro -> {
            System.out.println(libro); //toString es polimórfico porque segun el tipo de objeto que sea, ejecutara una función u otra
            System.out.println();
        });

        //Ordena los libros según ISBN, haciendo uso de <<Comparable>>.
        Collections.sort(listaLibros);
        //Muestra la lista de libros ordenada.
        System.out.println("\nLISTA DE LIBROS ORDENADA NATURALMENTE");
        listaLibros.forEach(libro -> {
            System.out.println(libro); //toString es polimórfico porque segun el tipo de objeto que sea, ejecutara una función u otra
            System.out.println();
        });

        //Recorre de nuevo la lista de libros y en cada iteración, ejecuta enviar() o descargar() en función del tipo de libro.
        System.out.println("\nDESCARGAR O ENVIAR");
        listaLibros.forEach(libro -> {
            if (libro instanceof LibroDigital) {
                ((LibroDigital) libro).descargar(); //Conversion explicita
            }
            if (libro instanceof LibroPapel) {
                ((LibroPapel) libro).enviar("Estepona"); //Conversion explicita
            }
            System.out.println();
        });

        //Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        System.out.println("\nLISTA LIBRO CONTINE A ..");
        LibroPapel libroEjemplo = new LibroPapel("ddd1", 0, 0, null, "84843d", 356);
        LibroDigital libroEjemplo2 = new LibroDigital("asd1", 0, 0, null, "8wsj", 12384);
        System.out.println("Contiene libro " + libroEjemplo.getIsbn() + ": " + listaLibros.contains(libroEjemplo));
        System.out.println("Contiene libro " + libroEjemplo2.getIsbn() + ": " + listaLibros.contains(libroEjemplo2));

        //Usando la lista de productos inicial, crea una nueva lista con todos los objetos del tipo <<SeEnvía>>.
        ArrayList<SeEnvia> listaEnviar = new ArrayList<>();
        listaProducto.forEach((producto) -> {
            if (producto instanceof SeEnvia) {
                listaEnviar.add((SeEnvia) producto);
            }
        });

        //Recorre la lista de objetos <<SeEnvía>> y llama al método de la interfaz.
        System.out.println("\nMETODO INTERFAZ SE ENVIA");
        listaEnviar.forEach(seEnvia -> {
            seEnvia.enviar("Malaga");
            System.out.println();
        });

        //Inventa un método abstracto en Libro que tenga comportamientos diferentes en las subclases. Implementa los métodos en las clases hijas.
        System.out.println("\nMETODO ABSTRACTO LIBRO");
        listaLibros.forEach(libro -> {
            libro.abrirLibro(); //Metodo polimorfico, ya que segun el objeto que sea puede ejecutar un codigo diferente
            System.out.println();
        });


    }
}
