import java.util.Scanner;

public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        double resultado = (num1 + num2) / (double) (num1 - num2);

        if (resultado % 1 == 0) {
            System.out.println("La división es exacta.");
        } else {
            System.out.println("La división no es exacta.");
        }

        scanner.close();
    }
}
