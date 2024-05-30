import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para la cuenta atrás:");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println();

        scanner.close();
    }
}