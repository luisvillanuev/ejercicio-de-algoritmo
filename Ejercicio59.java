public class Ejercicio59 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            imprimirTablaMultiplicar(i);
            System.out.println();
        }
    }

    public static void imprimirTablaMultiplicar(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}