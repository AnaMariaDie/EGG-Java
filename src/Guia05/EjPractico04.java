package Guia05;

import java.util.Vector;

public class EjPractico04 {

    public static void main(String[] args) {
        /* 4. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
        y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
        A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).        
         */
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
        System.out.println("Matriz");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz[1].length; i++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < matriz[1].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }
    }
}
