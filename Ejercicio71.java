import java.util.Scanner;

public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de términos para la serie Fibonacci:");
        int n = scanner.nextInt();

        System.out.println("Serie Fibonacci hasta el término " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
