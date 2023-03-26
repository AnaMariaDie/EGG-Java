package Guia02;

import java.util.Scanner;

public class EjPractico01 {

    public static void main(String[] args) {
        /* 1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
        El programa deberá después mostrar el resultado de la suma.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es: " + suma);
    }
}
