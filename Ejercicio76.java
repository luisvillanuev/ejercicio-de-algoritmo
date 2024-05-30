import java.util.Scanner;

public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int numero = scanner.nextInt();

        int cifras = contarCifras(numero);
        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");

        scanner.close();
    }

    public static int contarCifras(int numero) {
        int cifras = 0;
        while (numero != 0) {
            numero /= 10;
            cifras++;
        }
        return cifras;
    }
}