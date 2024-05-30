public class Ejercicio66 {
    public static void main(String[] args) {
        int n = 5;
        int suma = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números impares hasta " + (2 * n - 1) + " es: " + suma);
    }
}
