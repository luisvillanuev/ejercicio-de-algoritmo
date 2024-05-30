import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kilos de oro:");
        double kilosOro = scanner.nextDouble();

        System.out.println("Ingrese el precio en pesos por onza de oro:");
        double precioOnzaOro = scanner.nextDouble();

        double onzasOro = kilosOro * 1000 / 28.3495;
        double precioTotal = onzasOro * precioOnzaOro;

        System.out.println("El precio total en pesos del oro es: $" + precioTotal);

        scanner.close();
    }
}