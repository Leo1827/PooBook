public class Empleado {
    // Atributos de instancia
    private String nombre;
    private double salario;
    private String cargo;

    // Atributo estatico
    private static int contadorEmpleados = 0;

    // Contructor
    public Empleado(String nombre, double salario, String cargo){
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
        contadorEmpleados++; // cada vez que se crea un empleado, aumenta el contador
    }

    // Metodo de instanacia: mostrar informacion del empleado
    public void mostrarInformacion(){
        System.out.println("empleado: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("---------------------");
    }

    // Metodo de instancia: aplicar aumento
    public void aplicarAumento(double porcentaje){
        salario += salario * (porcentaje / 100);
        System.out.println(nombre + " ha recibido un aumento del " + porcentaje + "%.");
    }

    // Metodo estatico: calcular bono anual general
    public static void mostrarContador(){
        System.out.println("Total de empleados registrados: " + contadorEmpleados);
    }

    // Metodo estatico: calcular bono anual general
    public static void calcularBonoAnual(int anio){
        if (anio<2025){
            System.out.println("El bono anual es de: $500000"); // bono fijo para años anteriores
        } else {
            System.out.println("El bono anual es de: $700000"); // bono mas alto para años recientes
        }

    }
}
