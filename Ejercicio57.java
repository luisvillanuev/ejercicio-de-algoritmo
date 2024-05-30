public class Ejercicio57 {
    public static void main(String[] args) {
        int numero = 12345;
        int sumaDigitos = sumarDigitos(numero);
        System.out.println("La suma de los dígitos es: " + sumaDigitos);
    }

    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}