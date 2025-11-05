public class Main {
    public static void main(String[] args) {

        Personaje goku = new Personaje("Goku", "Saiyan", 9000);

        Personaje vegeta = new Personaje("Vegeta", "Saiyan", 8500);

        goku.pelear(500);
        System.out.println("----------------");
        vegeta.pelear(500);
        System.out.println("----------------");

        Personaje.mostrarTotalPersonajes();
    }
}