public class Banco {
    // Atributos estaticos
    private static String nombreBanco = "Banco futuro";
    private static double fondosTotales = 5000000;
    private static int totalClientes = 0;

    // Metodo estatico: mostrar información del banco
    public static void mostrarInfo(){
        System.out.println("Nombre del banco: " + nombreBanco);
        System.out.println("Fondos totales: $" + fondosTotales);
        System.out.println("Clientes registrados: " + totalClientes);
    }

    // Metodo estatico: agregar fondos
    public static void agregarFondos(double cantidad){
        fondosTotales += cantidad;
        System.out.println("Se agregaron $" + cantidad + " del banco.");
    }

    // Metodo estatico: retirar fondos
    public static void retirarFondos(double cantidad){
        if (cantidad <= fondosTotales){
            fondosTotales -= cantidad;
            System.out.println("Se retiraron: " + cantidad + "Del banco");
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    // Metodo estatico: registrar cliente
    public static void registrarCliente(double cantidad){
        totalClientes++;
        System.out.println("Nuevo cliente registrado. Total: " + totalClientes);
    }

}
