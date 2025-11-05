public class Main {
    public static void main(String[] args) {
        // objeto: instancia de la clase, o sea le da forma a esa plantilla
        Personaje goku = new Personaje("Goku", "Saiyan", 9000);

        Personaje vegeta = new Personaje("Vegeta", "Saiyan", 8500);

        goku.pelear(500);
        goku.entrenar(6000);
        System.out.println("----------------");
        vegeta.pelear(500);
        System.out.println("----------------");

        Personaje.mostrarTotalPersonajes();
    }
}