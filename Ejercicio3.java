import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base del triángulo
        System.out.println("Por favor, ingrese la base del triángulo:");
        double base = scanner.nextDouble();

        // Solicitar al usuario que ingrese la altura del triángulo
        System.out.println("Por favor, ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        // Calcular el área del triángulo utilizando la fórmula: área = (base * altura) / 2
        double area = (base * altura) / 2;

        // Mostrar el resultado del área
        System.out.println("El área del triángulo es: " + area);
        
        // Cerrar el scanner
        scanner.close();
    }
}