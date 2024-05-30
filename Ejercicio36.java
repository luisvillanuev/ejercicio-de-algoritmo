import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas de estacionamiento:");
        int horas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de minutos de estacionamiento:");
        int minutos = scanner.nextInt();

        int totalMinutos = horas * 60 + minutos;
        double costo = Math.ceil(totalMinutos / 60.0) * 15;

        System.out.println("El costo de estacionamiento es: $" + costo);

        scanner.close();
    }
}