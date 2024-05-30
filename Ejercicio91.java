import java.util.Scanner;

public class Ejercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido de la persona:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el número de celular de la persona:");
        long celular = scanner.nextLong();

        System.out.println("Datos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Número de celular: " + celular);

        scanner.close();
    }
}