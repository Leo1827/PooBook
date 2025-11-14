import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // objeto: instancia de la clase, o sea le da forma a esa plantilla

        // crear objetos (instancias) de la clase
        Producto producto = new Producto();

        producto.mostrarProducto(1, "Manzana", 205, 25, 1385);

        // comprar producto
        producto.comprarProducto(4, 1385);
    }
}