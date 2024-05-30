import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora:");
        double tarifaPorHora = scanner.nextDouble();

        double salario;

        if (horasTrabajadas > 40) {
            salario = 40 * tarifaPorHora + (horasTrabajadas - 40) * tarifaPorHora * 1.5;
        } else {
            salario = horasTrabajadas * tarifaPorHora;
        }

        System.out.println("El salario del profesor es: " + salario);

        scanner.close();
    }
}