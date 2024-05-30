public class Ejercicio55 {
    public static void main(String[] args) {
        int numero = 17;
        int resultado = esPrimo(numero);
        System.out.println("El resultado es: " + resultado);
    }

    public static int esPrimo(int numero) {
        if (numero <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}