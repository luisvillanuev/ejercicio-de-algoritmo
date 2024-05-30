import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double num3 = scanner.nextDouble();

        double suma = num1 + num2 + num3;
        double multiplicacion = num1 * num2 * num3;

        System.out.println("Suma de los tres números: " + suma);
        System.out.println("Multiplicación de los tres números: " + multiplicacion);

        scanner.close();
    }
}