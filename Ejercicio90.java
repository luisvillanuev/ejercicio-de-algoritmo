public class Ejercicio90 {
    public static void main(String[] args) {
        int[][] matriz = {{2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
        int[] vector = {11, 12, 13, 14, 15};

        int cantidadPrimosMatriz = contarPrimos(matriz);
        int cantidadPrimosVector = contarPrimos(vector);

        System.out.println("Cantidad de números primos en la matriz: " + cantidadPrimosMatriz);
        System.out.println("Cantidad de números primos en el vector: " + cantidadPrimosVector);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarPrimos(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (esPrimo(num)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int contarPrimos(int[] vector) {
        int contador = 0;
        for (int num : vector) {
            if (esPrimo(num)) {
                contador++;
            }
        }
        return contador;
    }
}
