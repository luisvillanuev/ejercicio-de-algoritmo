import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra:");
        double montoCompra = scanner.nextDouble();

        double descuento = 0;

        if (montoCompra > 1000) {
            descuento = 0.10 * montoCompra;
        } else if (montoCompra > 500) {
            descuento = 0.20 * montoCompra;
        }

        double montoFinal = montoCompra - descuento;

        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Monto final de la compra: " + montoFinal);

        scanner.close();
    }
}
