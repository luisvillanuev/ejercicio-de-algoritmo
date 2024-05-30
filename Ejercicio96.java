import java.util.Scanner;

public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
            System.out.println("Número de letras: " + palabra.length());
        }

        scanner.close();
    }
}