import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el voltaje " + i + ":");
            double voltaje = scanner.nextDouble();
            suma += voltaje;
        }

        double promedio = suma / 5;
        System.out.println("El promedio de los voltajes es: " + promedio);

        if (promedio > 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("VOLTAJE CORRECTO");
        }

        scanner.close();
    }
}