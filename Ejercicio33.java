import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadEmpleados;
        int contadorMas700 = 0;
        int contadorMujeres = 0;
        int contadorVarones = 0;
        double sumaSalarios = 0;

        System.out.println("Ingrese la cantidad de empleados:");
        cantidadEmpleados = scanner.nextInt();

        for (int i = 1; i <= cantidadEmpleados; i++) {
            System.out.println("Ingrese el sexo del empleado #" + i + " (M para masculino, F para femenino):");
            char sexo = scanner.next().charAt(0);

            System.out.println("Ingrese el salario del empleado #" + i + ":");
            double salario = scanner.nextDouble();
            sumaSalarios += salario;

            if (salario > 700) {
                contadorMas700++;
            }

            if (sexo == 'M') {
                contadorVarones++;
            } else if (sexo == 'F') {
                contadorMujeres++;
            }
        }

        double promedioSalarios = sumaSalarios / cantidadEmpleados;
        double porcentajeMujeres = (double) contadorMujeres / cantidadEmpleados * 100;
        double porcentajeVarones = (double) contadorVarones / cantidadEmpleados * 100;

        System.out.println("Cantidad de personas que ganan más de 700 al mes: " + contadorMas700);
        System.out.println("Promedio de salarios: " + promedioSalarios);
        System.out.println("Porcentaje de mujeres que trabajan en la empresa: " + porcentajeMujeres + "%");
        System.out.println("Porcentaje de varones que trabajan en la empresa: " + porcentajeVarones + "%");

        scanner.close();
    }
}