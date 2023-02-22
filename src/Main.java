import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String nombre="", profesion="", nacionalidad="";

        System.out.println("¿Cuál es tu nombre?");
        nombre = in.nextLine();

        System.out.println("¿Cuál es tu profesion?");
        profesion = in.nextLine();

        System.out.println("¿Cuál es tu nacionalidad?");
        nacionalidad = in.nextLine();

        System.out.println("Nombre: " +nombre.toUpperCase() + "\nProfesion: " + profesion.toUpperCase() +
                "\nNacinalidad: " + nacionalidad.toUpperCase());

    }

}