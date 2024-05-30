import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas de estacionamiento:");
        int horas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de minutos de estacionamiento:");
        int minutos = scanner.nextInt();

        int totalMinutos = horas * 60 + minutos;
        int totalHoras = totalMinutos / 60;
        if (totalMinutos % 60 > 10) {
            totalHoras++;
        }
        double costo = totalHoras * 15;

        System.out.println("El costo de estacionamiento es: $" + costo);

        scanner.close();
    }
}