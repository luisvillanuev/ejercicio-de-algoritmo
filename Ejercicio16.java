import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su puntuación en el examen:");
        double puntuacion = scanner.nextDouble();

        if (puntuacion >= 60) {
            System.out.println("Felicitaciones, has aprobado el examen.");
        } else {
            System.out.println("Lo siento, has reprobado el examen.");
        }

        scanner.close();
    }
}
