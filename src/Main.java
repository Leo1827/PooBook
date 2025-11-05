import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // objeto: instancia de la clase, o sea le da forma a esa plantilla

        // crear objetos (instancias) de la clase
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos cliente desea registrar?: ");
        int n = sc.nextInt();
        sc.nextLine();

        Cliente[] clientes = new Cliente[n];

        for(int i=0;i<n;i++){
            System.out.println("\nRegistro del cliente " + (i+1) + "---");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Cargo: ");
            String cargo = sc.nextLine();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            System.out.println("Años de experiencia: ");
            int anios = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            clientes[i] = new Cliente(nombre, cargo, salario, anios);

        }

        int opcion;
            System.out.println("\n===== MENÚ CLIENTES =====");
            System.out.println("1. Mostrar Clientes");
            System.out.println("2. Aumentar salario");
            System.out.println("3. Cambiar cargo");
            System.out.println("4. Calcular bono");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    for (Cliente emp : clientes){
                        emp.mostrarInfo();
                    }
                    break;

                case 2:
                    System.out.println("Numero de cliente (1 a " + n + "):");
                    int idx1 =sc.nextInt() - 1;

                    System.out.println("Porcentaje de aumento: ");
                    double porc = sc.nextDouble();
                    sc.nextLine();
                    clientes[idx1].aumentarSalario(porc);
                    break;

                case 3:
                    System.out.println("Numero de cliente (1 a " + n + "):");
                    int idx2 = sc.nextInt() - 1;
                    sc.nextLine();

                    System.out.println("Nuevo cargo: ");
                    String nuevoCargo = sc.nextLine();
                    clientes[idx2].cambiarCargo(nuevoCargo);
                    break;
                case 4:
                    System.out.println("Numero de cliente (1 a " + n + "):");
                    int idx3 = sc.nextInt() - 1;
                    sc.nextLine();

                    double bono = clientes[idx3].calcularBono();
                    System.out.println("El bono anual de " + clientes[idx3].getNombre() + "es: $" + bono);
            }
        do{

        } while (opcion != 5);

        sc.close();



    }
}