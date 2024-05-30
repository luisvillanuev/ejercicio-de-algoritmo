import java.util.Arrays;

public class Ejercicio74 {
    public static void main(String[] args) {
        int[] numeros = {23, 7, 45, 12, 9};
        Arrays.sort(numeros);
        System.out.println("Números ordenados de mayor a menor:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}