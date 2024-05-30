import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su género (M para masculino, F para femenino):");
        String genero = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        if (genero.equals("M")) {
            System.out.println("Bienvenido, " + nombre);
        } else if (genero.equals("F")) {
            System.out.println("Bienvenida, " + nombre);
        } else {
            System.out.println("Hola indeciso");
        }

        scanner.close();
    }
}