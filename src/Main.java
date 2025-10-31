public class Main {
    public static void main(String[] args) {
        // una clase: es como una plantilla o un molde
        Book laAccionHumena = new Book(
                "La accion humana",
                "Ludwin Von Mises",
                1969,
                "economia");

        Book javaFroquimies = new Book(
                "Java",
                "Barry burd",
                1990,
                "Informatica"
                );

        laAccionHumena.readBook();
        System.out.println("----------------");

        javaFroquimies.displayInfo();
    }
}