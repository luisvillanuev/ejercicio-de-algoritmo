import java.util.Scanner;

public class Ejercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año:");
        int anio = scanner.nextInt();

        boolean esBisiesto = esBisiesto(anio);
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }

        scanner.close();
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}
