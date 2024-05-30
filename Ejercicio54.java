import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la medida en centímetros:");
        double centimetros = scanner.nextDouble();

        double pulgadas = centimetros / 2.54;

        System.out.println(centimetros + " centímetros equivalen a " + pulgadas + " pulgadas.");

        scanner.close();
    }
}