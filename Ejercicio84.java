import java.util.Scanner;

public class Ejercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("La edad ingresada es: " + edad);

        scanner.close();
    }
}