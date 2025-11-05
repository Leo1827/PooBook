public class Inventario {
    // Parametros de instancia
    private int id;
    private String codigo;
    private String nombre;
    private String descripcion;
    private int categoria;
    private int estado;
    private int stock;
    // Parametros estaticos
    private static int quantity = 0;

    // Constructor
    public Inventario(int id, String codigo, String nombre, String descripcion, int categoria, int estado, int stock){
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.stock = stock;
        // La cantidad se va sumando conforme se cree un inventario
        quantity++;
    }

    // Metodo de instancia: mostrar el inventario
    public void mostrarInventario(){
        System.out.printf("\nid: %d", id);
        System.out.printf("\nCodigo: %s", codigo);
        System.out.printf("\nNombre: %s", nombre);
        System.out.printf("\nDescripción: %s", descripcion);
        System.out.printf("\nCategoria: %d", categoria);
        System.out.printf("\nEstado: %d", estado);
        System.out.printf("\nStock: %d", stock);
        System.out.println("---------------------");
    }
    // Metodo de instancia: agregar unidades al stock
    public void agregarInventario(int quantity){
        if (quantity > 0){
            stock+= quantity;
            System.out.println("\nSe agregaron " + quantity + " Unidades al producto: " + nombre);
        } else {
            System.out.println("\nLa cantidad debe ser mayor de 0");
        }
    }
    // Metodo de instancia: quitar unidades de stock
    public void quitarInventario(int quantity){
        if (quantity > 0 && quantity <= stock ){
            stock -= quantity;
            System.out.println("Se retiraron " + quantity + " unidades del producto " + nombre);
            System.out.println("Stock restante: " + stock);
        } else if(quantity > stock){
            System.out.println("No hay suficiente stock para retirar esa cantidad");
        } else{
            System.out.println("La cantidad debe ser mayor que cero.");
        }

    }



}
