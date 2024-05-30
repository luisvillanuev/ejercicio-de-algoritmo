import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar tres dígitos aleatorios distintos entre 0 y 9
        int digito1, digito2, digito3;
        do {
            digito1 = random.nextInt(10);
            digito2 = random.nextInt(10);
            digito3 = random.nextInt(10);
        } while (digito1 == digito2 || digito1 == digito3 || digito2 == digito3);

        // Imprimir los dígitos generados para propósitos de prueba
        System.out.println("Dígitos a adivinar (para propósitos de prueba): " + digito1 + ", " + digito2 + ", " + digito3);

        int intentos = 0;
        boolean adivinado = false;

        // Juego
        while (!adivinado) {
            intentos++;
            System.out.println("Intento #" + intentos + ":");
            System.out.println("Ingrese tres dígitos separados por espacios:");

            int d1 = scanner.nextInt();
            int d2 = scanner.nextInt();
            int d3 = scanner.nextInt();

            if (d1 == digito1 && d2 == digito2 && d3 == digito3) {
                System.out.println("¡Felicidades! Has adivinado los dígitos y sus posiciones correctamente.");
                adivinado = true;
            } else {
                String pista = obtenerPista(d1, d2, d3, digito1, digito2, digito3);
                System.out.println("Pista: " + pista);
            }
        }

        System.out.println("Total de intentos: " + intentos);
        scanner.close();
    }

    public static String obtenerPista(int d1, int d2, int d3, int digito1, int digito2, int digito3) {
        StringBuilder pista = new StringBuilder();

        if (d1 == digito1) {
            pista.append("VERDE ");
        } else if (d1 == digito2 || d1 == digito3) {
            pista.append("AMARILLO ");
        } else {
            pista.append("ROJO ");
        }

        if (d2 == digito2) {
            pista.append("VERDE ");
        } else if (d2 == digito1 || d2 == digito3) {
            pista.append("AMARILLO ");
        } else {
            pista.append("ROJO ");
        }

        if (d3 == digito3) {
            pista.append("VERDE");
        } else if (d3 == digito1 || d3 == digito2) {
            pista.append("AMARILLO");
        } else {
            pista.append("ROJO");
        }

        return pista.toString();
    }
}