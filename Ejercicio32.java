import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del rectángulo en metros:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectángulo en metros:");
        double altura = scanner.nextDouble();

        double areaMetros = base * altura;
        double areaCentimetros = areaMetros * 10000;
        double areaMilimetros = areaCentimetros * 100;

        System.out.println("Área en metros cuadrados: " + areaMetros);
        System.out.println("Área en centímetros cuadrados: " + areaCentimetros);
        System.out.println("Área en milímetros cuadrados: " + areaMilimetros);

        scanner.close();
    }
}