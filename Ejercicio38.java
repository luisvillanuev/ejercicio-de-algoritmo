import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();

        int consumoGramos = edad * 365 * 8;
        int consumoManzanas = consumoGramos / 4;

        System.out.println("Cantidad de gramos de fruta consumidos: " + consumoGramos + "g");
        System.out.println("Cantidad de manzanas consumidas: " + consumoManzanas);

        scanner.close();
    }
}