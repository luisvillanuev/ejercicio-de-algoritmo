import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int valor = 1;

        while (valor != 0) {
            System.out.println("Ingrese un número (0 para terminar):");
            valor = scanner.nextInt();
            if (valor > 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de valores mayores que cero: " + contador);

        scanner.close();
    }
}