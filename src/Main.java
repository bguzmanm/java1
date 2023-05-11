import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Definir nombre como Caracter;
        String nombre;

        // Escribir "Escribe tu nombre:";
        System.out.println("Escribe tu nombre:");

        // nombre <- "Brian";
        nombre = "Brian";

        // Leer nombre;
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.next();

        // Escribir "Hola", nombre;
        System.out.println("Hola " + nombre);

        System.out.println("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Tu edad es de " + edad);

        int ano = 2023 - edad;
        System.out.println("Naciste el " + ano);

        entrada.close();
    }

}
