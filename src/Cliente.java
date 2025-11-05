public class Cliente {
    // Atributos de instancia
    private String nombre;
    private String cargo;
    private double salario;
    private int aniosExperiencia;

    // Constructor
    public Cliente(String nombre, String cargo, double salario, int aniosExperiencia){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Metodos de instancia
    public void mostrarInfo(){
        System.out.println("\n----- Informacion del cliente -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Años de experiencia: " + aniosExperiencia);
        System.out.println("----------------------------");
    }

    public void aumentarSalario(double porcentaje){
        double aumento = salario * (porcentaje /100);
        salario += aumento;
        System.out.println("Salario aumentado en $" + aumento);
    }

    public void cambiarCargo(String nuevoCargo) {
        System.out.println("El cargo de " + nombre + " ha sido cambiado de " + cargo + " a " + nuevoCargo);
        this.cargo = nuevoCargo;
    }

    public double calcularBono(){
        return salario * 0.1 + (aniosExperiencia * 80000);
    }

    public String getNombre() {
        return nombre;
    }
}
