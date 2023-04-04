package Guia04;

import java.util.Scanner;

public class EjPractico01 {

    public static void main(String[] args) {
        /* 1. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
        sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada 
        operación matemática y deben devolver sus resultados para imprimirlos en el main.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean op = true;
        do {
            System.out.println("Que operacion desea realizar: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    int suma = sumarNumeros(num1, num2);
                    System.out.println("La suma de los numeros es: " + suma + "\n");
                    break;
                case 2:
                    int resta = restarNumeros(num1, num2);
                    System.out.println("La resta de los numeros es: " + resta + "\n");
                    break;
                case 3:
                    int multi = multiplicarNumeros(num1, num2);
                    System.out.println("La multiplicacion de los numeros es: " + multi + "\n");
                    break;
                case 4:
                    int divi = dividirNumeros(num1, num2);
                    System.out.println("La division de los numeros es: " + divi + "\n");
                    break;
                case 5:
                    System.out.println("Seguro que desea salir \n");
                    String resp = leer.next();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa");
                        op = false;
                    } else {
                        op = true;
                    }
                    break;
                default:
                    System.out.println("La opcion indicada no es valida \n");
                    op = true;
                    break;
            }
        } while (op != false);

    }

    public static int sumarNumeros(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static int restarNumeros(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    public static int multiplicarNumeros(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public static int dividirNumeros(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }
}
