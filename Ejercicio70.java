import java.util.Scanner;

public class Ejercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        int resultado = calcularResultado(n);
        System.out.println("El resultado de la expresión hasta " + n + " es: " + resultado);

        scanner.close();
    }

    public static int calcularResultado(int n) {
        int resultado = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                resultado -= i;
            } else {
                resultado += i;
            }
        }
        return resultado;
    }
}
