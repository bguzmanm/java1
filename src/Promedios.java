import java.util.Scanner;

public class Promedios {
    public static float ingreso(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    public static float promedio(float n1, float n2, float n3, float n4, float n5){
        return (n1 + n2 + n3 + n4 + n5)/5;
    }

    public static void evaluaPromedio(float promedio){
        if (promedio >= 4.0) {
            System.out.println("Aprobaste");
        } else {
            System.out.println("Reprobaste");
        }
    }

    public static void main(String[] args){

        float n1 = ingreso("Ingresa la nota 1:");
        float n2 = ingreso("Ingresa la nota 2:");
        float n3 = ingreso("Ingresa la nota 3:");
        float n4 = ingreso("Ingresa la nota 4:");
        float n5 = ingreso("Ingresa la nota 5:");

        float prom = promedio(n1, n2, n3, n4, n5);

        System.out.println("El promedio de las notas es: " + prom);
        evaluaPromedio(prom);

    }


}
