import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en millas:");
        double millas = scanner.nextDouble();

        double metros = millas * 1852;

        System.out.println(millas + " millas equivalen a " + metros + " metros.");

        scanner.close();
    }
}