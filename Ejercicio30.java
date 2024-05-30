import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en kilómetros:");
        double kilometros = scanner.nextDouble();

        double metros = kilometros * 1000;

        System.out.println(kilometros + " kilómetros equivalen a " + metros + " metros.");

        scanner.close();
    }
}