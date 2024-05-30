public class Ejercicio45 {
    public static void main(String[] args) {
        double numero = -5.5;
        int signo = obtenerSigno(numero);
        System.out.println("El signo del número es: " + signo);
    }

    public static int obtenerSigno(double numero) {
        if (numero > 0) {
            return 1; // Positivo
        } else if (numero < 0) {
            return -1; // Negativo
        } else {
            return 0; // Cero
        }
    }
}