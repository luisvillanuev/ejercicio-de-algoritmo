import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String texto = scanner.nextLine();

        char primeraLetra = obtenerPrimeraLetra(texto);

        System.out.println("La primera letra de la cadena es: " + primeraLetra);

        scanner.close();
    }

    public static char obtenerPrimeraLetra(String texto) {
        return texto.charAt(0);
    }
}