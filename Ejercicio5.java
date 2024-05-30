import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la longitud de la primera diagonal del rombo
        System.out.println("Por favor, ingrese la longitud de la primera diagonal del rombo:");
        double diagonal1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese la longitud de la segunda diagonal del rombo
        System.out.println("Por favor, ingrese la longitud de la segunda diagonal del rombo:");
        double diagonal2 = scanner.nextDouble();

        // Calcular el área del rombo utilizando la fórmula: área = (diagonal1 * diagonal2) / 2
        double area = (diagonal1 * diagonal2) / 2;

        // Mostrar el resultado del área
        System.out.println("El área del rombo es: " + area);
        
        // Cerrar el scanner
        scanner.close();
    }
}