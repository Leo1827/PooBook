public class Main {
    public static void main(String[] args) {
        // objeto: instancia de la clase, o sea le da forma a esa plantilla

        // crear objetos (instancias) de la clase
        Inventario inv = new Inventario(
                1,
                "xx1",
                "Paquete 1",
                "Paquete de productos",
                1,
                0,
                5);
        // mostrar informacion inicial
        inv.mostrarInventario();

        inv.agregarInventario(2);

        inv.quitarInventario(1);

        inv.mostrarInventario();


    }
}