import java.util.Scanner;

public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        int valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto del número es: " + valorAbsoluto);

        scanner.close();
    }
}