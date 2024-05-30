import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int valor = 1;

        while (valor != 0) {
            System.out.println("Ingrese un número (0 para terminar):");
            valor = scanner.nextInt();
            if (valor > 0) {
                suma += valor;
            }
        }

        System.out.println("La suma de los valores mayores que cero es: " + suma);

        scanner.close();
    }
}