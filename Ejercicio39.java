import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año de nacimiento:");
        int anoNacimiento = scanner.nextInt();

        System.out.println("Ingrese el año actual:");
        int anoActual = scanner.nextInt();

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.next();

        int diasDormidos = (int) ((anoActual - anoNacimiento) * 0.34 * 365);

        System.out.println("La cantidad de días que ha dormido " + nombre + " es: " + diasDormidos);

        scanner.close();
    }
}