public class Book {
    // atributos en privado
    private String title;
    private String author;
    private int publicationYear;
    private String gener;

    // Contructor: es un metodo especial que lleva el mismo nombre de la clase
    public Book(String title, String author, int publicationYear, String gener){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.gener = gener;
    }

    public Book(){} // sobre carga de constructures

    // Metodo
    // void: ayuda a no retornar nada en el metodo
    public void readBook(){
        System.out.println("Reading " + title + " by " + author);
    }

    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("gener: " + gener);
    }

}
