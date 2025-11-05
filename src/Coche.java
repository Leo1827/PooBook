public class Coche {
    // Atributo de instancia (propio de cada coche)
    String marca;

    // Atributo estatico (compartido entre todos los coches)
    static int contadorCoches = 0;

    // Constructor
    public Coche(String marca) {
        this.marca = marca;
        contadorCoches++; // Cada vez que se crea un coche, el contador sube
    }

    // Metodo de instancia
    public void mostrarInfo() {
        System.out.println("Marca del coche: " + marca);
    }

    // Metodo estatico
    public static void mostrarContador() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }
}
