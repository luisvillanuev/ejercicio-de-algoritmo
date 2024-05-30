import java.util.Scanner;

public class Ejercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en metros:");
        double distanciaMetros = scanner.nextDouble();

        double distanciaKilometros = distanciaMetros / 1000;
        System.out.println("La distancia en kilómetros es: " + distanciaKilometros + " km");

        scanner.close();
    }
}
