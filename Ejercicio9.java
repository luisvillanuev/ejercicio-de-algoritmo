import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto:");
        double monto = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de IVA:");
        double porcentajeIVA = scanner.nextDouble();

        double iva = monto * (porcentajeIVA / 100);

        System.out.println("El IVA sobre la cantidad dada es: " + iva);

        scanner.close();
    }
}
