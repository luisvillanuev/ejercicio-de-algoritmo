public class Ejercicio64 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int potencia = calcularPotencia(x, y);
        System.out.println("El resultado de " + x + "^" + y + " es: " + potencia);
    }

    public static int calcularPotencia(int x, int y) {
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        return resultado;
    }
}