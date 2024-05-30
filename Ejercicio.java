import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos:");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        int segundos = minutosRestantes * 60;

        System.out.println("El tiempo ingresado es: " + horas + " horas, " + minutosRestantes + " minutos, " + segundos + " segundos");

        scanner.close();
    }
}