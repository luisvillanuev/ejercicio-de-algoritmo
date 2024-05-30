public class Ejercicio69 {
    public static void main(String[] args) {
        int n = 5;
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 20 + i;
        }
        System.out.println("La suma de la serie hasta " + n + " es: " + suma);
    }
}