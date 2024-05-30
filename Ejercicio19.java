import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sueldo básico del empleado:");
        double sueldoBasico = scanner.nextDouble();

        System.out.println("Ingrese el monto por horas extras:");
        double horasExtras = scanner.nextDouble();

        double totalDescuento = 0.20 * sueldoBasico;
        double sueldoTotal = sueldoBasico + horasExtras - totalDescuento;

        System.out.println("Sueldo básico: " + sueldoBasico);
        System.out.println("Total de descuento: " + totalDescuento);
        System.out.println("Total ganado: " + sueldoTotal);

        scanner.close();
    }
}