import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de kilovoltios necesarios:");
        double kilovoltios = scanner.nextDouble();

        double naranjas = kilovoltios / 0.05;
        double toneladas = naranjas * 6 / 1000;

        System.out.println("Cantidad de naranjas necesarias: " + naranjas);
        System.out.println("Cantidad de toneladas necesarias: " + toneladas);

        scanner.close();
    }
}