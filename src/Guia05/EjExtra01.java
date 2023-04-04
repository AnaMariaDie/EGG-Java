package Guia05;

import java.util.Scanner;

public class EjExtra01 {

    public static void main(String[] args) {
        /* 1. Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
        de tamaño N, con los valores ingresados por el usuario.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño del vector");
        int size = leer.nextInt();
        int[] vector = new int[size];
        int suma = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un valor para el vector en posicion: " + (i+1));
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los valores ingresados al vector es: " + suma);
    }
}
