public class Ejercicio43 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int menor = encontrarMenor(num1, num2);
        System.out.println("El número menor es: " + menor);
    }

    public static int encontrarMenor(int num1, int num2) {
        return Math.min(num1, num2);
    }
}
