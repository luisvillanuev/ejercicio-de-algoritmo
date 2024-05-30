import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese el valor por hora:");
        double valorHora = scanner.nextDouble();

        double salario = horasTrabajadas * valorHora;

        System.out.println("El salario es: " + salario);

        scanner.close();
    }
}