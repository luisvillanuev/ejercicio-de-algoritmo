import java.util.Scanner;

public class Ejercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sueldo del trabajador:");
        double sueldo = scanner.nextDouble();

        double descuento = calcularDescuento(sueldo);
        double sueldoNeto = sueldo - descuento;

        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El sueldo neto que recibe el trabajador es: " + sueldoNeto);

        scanner.close();
    }

    public static double calcularDescuento(double sueldo) {
        double descuento = 0;
        if (sueldo <= 1000) {
            descuento = sueldo * 0.1;
        } else if (sueldo <= 2000) {
            descuento = 1000 * 0.1 + (sueldo - 1000) * 0.05;
        } else {
            descuento = 1000 * 0.1 + 1000 * 0.05 + (sueldo - 2000) * 0.03;
        }
        return descuento;
    }
}