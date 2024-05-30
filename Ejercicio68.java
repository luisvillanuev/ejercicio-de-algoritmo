public class Ejercicio68 {
    public static void main(String[] args) {
        int n = 3;
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += calcularFactorial(i);
        }
        System.out.println("La suma de factoriales hasta " + n + " es: " + suma);
    }

    public static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}