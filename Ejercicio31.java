import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo en milímetros:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo en milímetros:");
        double altura = scanner.nextDouble();

        double areaMilimetros = (base * altura) / 2;
        double areaCentimetros = areaMilimetros / 100;
        double areaMetros = areaCentimetros / 10000;

        System.out.println("Área en milímetros cuadrados: " + areaMilimetros);
        System.out.println("Área en centímetros cuadrados: " + areaCentimetros);
        System.out.println("Área en metros cuadrados: " + areaMetros);

        scanner.close();
    }
}