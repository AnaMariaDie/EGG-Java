package Guia05;

import java.util.Scanner;

public class EjExtra05 {

    public static void main(String[] args) {
        /* 5. Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
        y muestre la suma de sus elementos. 
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros para indicar el tamaño de la matriz");
        System.out.println("Ingrese el valor de las filas");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el valor de las columnas");
        int num2 = leer.nextInt();
        int[][] matriz = new int[num1][num2];
        llenarMatriz(matriz, num1, num2);
        imprimirMatriz(matriz, num1, num2);
    }

    public static int[][] llenarMatriz(int[][] matriz, int num1, int num2) {
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz, int num1, int num2) {
        int suma = 0;
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("La suma de sus elementos es: " + suma);
    }
}
