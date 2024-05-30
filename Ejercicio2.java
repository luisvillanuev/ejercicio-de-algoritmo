import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Por favor, ingrese un texto:");
        String textoIngresado = scanner.nextLine();

        // Imprimir el mensaje junto con el texto ingresado
        System.out.println("El texto ingresado es: " + textoIngresado);
        
        // Cerrar el scanner
        scanner.close();
    }
}