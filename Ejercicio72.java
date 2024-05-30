import java.util.Scanner;

public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora:");
        double tarifaPorHora = scanner.nextDouble();

        double salario = calcularSalario(horasTrabajadas, tarifaPorHora);
        System.out.println("El salario del trabajador es: " + salario);

        scanner.close();
    }

    public static double calcularSalario(int horasTrabajadas, double tarifaPorHora) {
        double salario;
        if (horasTrabajadas > 40) {
            double horasExtras = horasTrabajadas - 40;
            salario = 40 * tarifaPorHora + horasExtras * (tarifaPorHora * 1.5);
        } else {
            salario = horasTrabajadas * tarifaPorHora;
        }
        return salario;
    }
}
