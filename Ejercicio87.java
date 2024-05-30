import java.util.Scanner;

public class Ejercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de un lado del triángulo equilátero:");
        double lado = scanner.nextDouble();

        double area = calcularAreaTrianguloEquilatero(lado);
        System.out.println("El área del triángulo equilátero es: " + area);

        if (area > 1000) {
            System.out.println("DATOS NO VÁLIDOS");
        }

        scanner.close();
    }

    public static double calcularAreaTrianguloEquilatero(double lado) {
        return (Math.sqrt(3) / 4) * lado * lado;
    }
}
