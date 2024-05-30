import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad comprada:");
        double cantidadComprada = scanner.nextDouble();

        System.out.println("Ingrese el precio de la compra:");
        double precioCompra = scanner.nextDouble();

        System.out.println("Ingrese el precio pagado:");
        double precioPagado = scanner.nextDouble();

        double porcentajeDescuento = ((cantidadComprada * precioCompra) - precioPagado) / (cantidadComprada * precioCompra) * 100;

        System.out.println("El porcentaje descontado es: " + porcentajeDescuento + "%");

        scanner.close();
    }
}