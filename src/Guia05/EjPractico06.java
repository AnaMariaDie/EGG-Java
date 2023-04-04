package Guia05;

import java.util.Scanner;

public class EjPractico06 {

    public static void main(String[] args) {
        /* 6. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
        1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
        idénticas. Crear un programa que permita introducir un cuadrado por
        teclado y determine si este cuadrado es mágico o no. El programa
        deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.        
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[3][3];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz[1].length; i++) {
                System.out.println("Ingrese un numero");
                matriz[i][j] = leer.nextInt();
            }
        }
        boolean retorno = comprobacion(matriz);
        if (retorno == true) {
            System.out.println("Es un cuadrado magico");
        } else {
            System.out.println("NO es un cuadrado magico");
        }
    }

    public static boolean comprobacion(int[][] matriz) {
        boolean esMagica = false;
        int suma = 0;
        int sumaD = 0;
        int sumaF = 0;
        int sumaC = 0;
        int sumaD1 = 0;
        int sumaD2 = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz[1].length; i++) {
                suma += matriz[i][j];
                if (suma == 15) {
                    sumaF += 1;
                }
                if (i == j) {
                    sumaD += matriz[i][j];
                    sumaD1 += 1;
                }
            }
            suma = 0;
        }
        System.out.println("suma fila " + sumaF);
        System.out.println("suma diag1 " + sumaD1);
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                suma += matriz[i][j];
                if (suma == 15) {
                    sumaC += 1;
                }
            }
            suma = 0;
        }
        System.out.println("suma columna " + sumaC);
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz[1].length; i++) {
                if (i == 0 && j == 2 || i == 1 && j == 1 || i == 2 && j == 0) {
                    sumaD2 += 1;
                }
            }
        }
        System.out.println("suma diag2 " + sumaD2);
        if (sumaF == sumaC && sumaF == sumaD1 && sumaC == sumaD2 && sumaD1 == sumaD2) {
            esMagica = true;
        }
        return esMagica;
    }
}
