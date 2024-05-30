import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();

        double longitudCabello = edad * 12 * 0.5 / 100;

        System.out.println("La longitud del cabello es: " + longitudCabello + " metros");

        scanner.close();
    }
}