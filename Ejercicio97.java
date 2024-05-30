import java.util.Scanner;

public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el consumo de la Termoeléctrica Manta en kW:");
        double consumo = scanner.nextDouble();

        double eficiencia = consumo / 10000;
        System.out.println("Eficiencia energética de la Termoeléctrica Manta: " + (eficiencia * 100) + "%");

        if (eficiencia > 1) {
            System.out.println("ALTO CONSUMO DE ENERGÍA");
        } else {
            System.out.println("CONSUMO MEDIO");
        }

        scanner.close();
    }
}