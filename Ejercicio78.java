import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto:");
        double monto = scanner.nextDouble();

        double descuento = calcularDescuento(monto);
        System.out.println("El descuento aplicado es: " + descuento);

        scanner.close();
    }

    public static double calcularDescuento(double monto) {
        return monto > 10000 ? monto * 0.2 : monto * 0.1;
    }
}