public class Producto {
    // atributos de instancia
    private int id;
    private String name;
    private int age;
    private int quantity;
    private double price;

    // constructor
    public Producto(){
        this.id = id;
        this.name = name;
        this.age = age;
        this.quantity = quantity;
        this.price = price;
    }

    public void mostrarProducto(int id, String name, int age, int quantity, double price){
        System.out.printf("\nId producto: %d", id);
        System.out.println("\nNombre: " + name);
        System.out.printf("\nAño: %d", age);
        System.out.printf("\nCantidad: %d", quantity);
        System.out.println("\nPrecio: " + price);
    }

    public void comprarProducto(double cantidad,double price){
        double total = cantidad * price;
        System.out.println("Total a pagar: " + total);
    }

}
