package Guia03;

import java.util.Scanner;

public class EjTeo02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /* Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
        alguno de ellos es mayor a 25.
         */
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 || num2 > 25) {
            System.out.println("Uno o ambos numeros son mayores a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }
    }
}
