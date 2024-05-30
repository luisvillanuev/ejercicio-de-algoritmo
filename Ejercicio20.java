import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        double promedio;
        double[] notas = new double[5];

        System.out.println("Ingrese las 5 notas:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        promedio = suma / 5;

        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);

        for (int i = 0; i < 5; i++) {
            System.out.println("El doble de la nota " + (i + 1) + " es: " + (notas[i] * 2));
        }

        scanner.close();
    }
}
