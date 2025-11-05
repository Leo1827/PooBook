public class Main {
    public static void main(String[] args) {
        // objeto: instancia de la clase, o sea le da forma a esa plantilla

        // crear objetos (instancias) de la clase
        Coche c1 = new Coche("Toyota");
        Coche c2 = new Coche("Mazda");
        Coche c3 = new Coche("Honda");

        c1.mostrarInfo(); // Marca del coche: toyota
        c2.mostrarInfo();
        c3.mostrarInfo();

        System.out.println("-----------------");
        Coche.mostrarContador();
    }
}