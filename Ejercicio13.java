import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();

        int ultDig1 = num1 % 10;
        int ultDig2 = num2 % 10;
        int ultDig3 = num3 % 10;

        System.out.println("El último dígito del primer número es: " + ultDig1);
        System.out.println("El último dígito del segundo número es: " + ultDig2);
        System.out.println("El último dígito del tercer número es: " + ultDig3);

        scanner.close();
    }
}