public class Ejercicio52 {
    public static void main(String[] args) {
        int numero = 7;
        imprimirTablaMultiplicar(numero);
    }

    public static void imprimirTablaMultiplicar(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
