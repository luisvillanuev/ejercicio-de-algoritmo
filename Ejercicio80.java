import java.util.Scanner;

public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int entero = scanner.nextInt();

        System.out.println("Ingrese un número real:");
        double real = scanner.nextDouble();

        System.out.println("Datos ingresados:");
        System.out.println("Entero: " + entero);
        System.out.println("Real: " + real);

        scanner.close();
    }
}