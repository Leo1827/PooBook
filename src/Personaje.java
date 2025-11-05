public class Personaje {
    // Propiedades/parametros de instancia
    private String nombre;
    private String raza;
    private int nivelDePoder;
    // Propiedades/parametros de estáticas
    public static int totalPeronajes;

    // Constructor
    public Personaje(String nombre, String raza, int nivelDePoder){
        this.nombre = nombre;
        this.raza = raza;
        this.nivelDePoder = nivelDePoder;
        totalPeronajes++;
    }

    public Personaje(){}

    // entrenar
    public void entrenar(int incremento){
        nivelDePoder += incremento;
        System.out.println(nombre + " Ha entrenado " + nivelDePoder);
    }

    // Métodos de instancia
    public void pelear(int decremento){
        nivelDePoder -= decremento;
        if(nivelDePoder <0){
            nivelDePoder = 0;
        }
        System.out.println(nombre + " Ha peleado. Nivel de poder actual: " + nivelDePoder);
    }

    // Métodos estaticos
    public static void mostrarTotalPersonajes(){
        System.out.println("Numero total de personajes: " + totalPeronajes);
    }

    // Getter y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }
}
