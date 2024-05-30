import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pulgadas:");
        double pulgadas = scanner.nextDouble();

        double centimetros = pulgadas * 2.54;

        System.out.println(pulgadas + " pulgadas equivalen a " + centimetros + " centímetros.");

        scanner.close();
    }
}