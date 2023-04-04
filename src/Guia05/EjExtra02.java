package Guia05;

import java.util.Scanner;

public class EjExtra02 {

    public static void main(String[] args) {
        /* 2. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).        
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector");
        int size = leer.nextInt();
        int suma = 0;
        int[] vector = new int[size];
        int[] vector2 = new int[size];
        devolverVector(vector, size);
        System.out.println("");
        devolverVector(vector2, size);
        System.out.println("");
        // Evaluacion de igualdad
        for (int i = 0; i < size; i++) {
            if (vector[i] != vector2[i]) {
                System.out.println("Se encontro una diferencia");
                break;
            } else {
                suma += 1;
            }
        }
        if (suma == size) {
            System.out.println("Ambos vectores son iguales");
        }
    }
        // Llenado de vectores y escritura para comparar
    public static int[] devolverVector(int[] vector, int size) {
        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 10);
        // Comparacion si son iguales
        // vector[i] = 9;
            System.out.print("[" + vector[i] + "]");
        }
        return vector;
    }
}
