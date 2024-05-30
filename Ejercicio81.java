import java.util.Scanner;

public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();

        double area = calcularAreaCirculo(radio);
        System.out.println("El área del círculo es: " + area);

        if (area > 5000) {
            System.out.println("DATOS ERRÓNEOS");
        }

        scanner.close();
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
}