import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número real:");
        double numeroReal = scanner.nextDouble();

        int parteEntera = (int) numeroReal;
        double parteDecimal = numeroReal - parteEntera;

        System.out.println("La parte entera del número es: " + parteEntera);
        System.out.println("La parte decimal del número es: " + parteDecimal);

        scanner.close();
    }
}