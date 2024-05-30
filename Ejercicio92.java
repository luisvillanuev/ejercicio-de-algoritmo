public class Ejercicio92 {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3};
        int[] vector2 = {4, 5, 6};

        int productoEscalar = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los vectores es: " + productoEscalar);
    }

    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int producto = 0;
        for (int i = 0; i < vector1.length; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }
}