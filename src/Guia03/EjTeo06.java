package Guia03;

import java.util.Scanner;

public class EjTeo06 {

    public static void main(String[] args) {
        /* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
        ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 **
         */
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        int i;
        do {
            cont++;
            System.out.println("");
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            for (i = 0; i < num; i++) {
                System.out.print("*");
            }
        } while (cont!= 4);
    }
}
