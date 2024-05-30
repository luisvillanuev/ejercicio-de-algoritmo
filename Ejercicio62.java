import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaTemperaturas = 0;
        double temperaturaMaxima = Double.MIN_VALUE;
        double temperaturaMinima = Double.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese la temperatura exterior:");
            double temperatura = scanner.nextDouble();
            sumaTemperaturas += temperatura;

            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }

            if (temperatura < temperaturaMinima) {
                temperaturaMinima = temperatura;
            }
        }

        double temperaturaPromedio = sumaTemperaturas / 6;

        System.out.println("La temperatura promedio del día es: " + temperaturaPromedio);
        System.out.println("La temperatura máxima fue: " + temperaturaMaxima);
        System.out.println("La temperatura mínima fue: " + temperaturaMinima);

        scanner.close();
    }
}
