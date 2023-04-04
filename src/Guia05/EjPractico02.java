package Guia05;

import java.util.Scanner;

public class EjPractico02 {

    public static void main(String[] args) {
        /* 2. Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
        y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
        se encuentra el numero y si se encuentra repetido.    
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Indique el tamaño del vecto que construiremos");
        int num = leer.nextInt();
        int [] vector = new int[num];
        // Llenar Vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10); 
            System.out.println("Vector en posicion " + i + " = " + vector[i]);
        }
        // Buscar numero
        System.out.println("Ingrese el numero a buscar en el vector");
        int buscarNum = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
           if (vector[i] == buscarNum) {
               System.out.println("Numero encontrado en posicion " + i);
           } 
        }
    }
}
