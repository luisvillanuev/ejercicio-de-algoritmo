import java.util.Scanner;

public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el voltaje del bombillo (en voltios):");
        double voltajeBombillo = scanner.nextDouble();

        double voltaje = voltajeBombillo / 120;
        System.out.println("El voltaje del bombillo en kilovoltios es: " + voltaje);

        scanner.close();
    }
}