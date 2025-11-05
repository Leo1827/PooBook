public class Main {
    public static void main(String[] args) {
        // objeto: instancia de la clase, o sea le da forma a esa plantilla

        // crear objetos (instancias) de la clase
        Empleado e1 = new Empleado("Mileer leon", 150.00, "Desarrollador");
        Empleado e2 = new Empleado("Diego esocbar", 120.00, "Analista");
        Empleado e3 = new Empleado("Alejandra soto", 135.00, "QA");

        // Llamar a metodos de instancia
        e1.mostrarInformacion();
        e2.mostrarInformacion();
        e3.mostrarInformacion();

        // Aplicar aumento del salario
        e2.aplicarAumento(10);
        e2.mostrarInformacion();

        // Mostrar cantidad total de empleados (metodo estatico)
        Empleado.mostrarContador();

        // Calcular bono anual general (Metodo estatico)
        Empleado.calcularBonoAnual(2025);
    }
}