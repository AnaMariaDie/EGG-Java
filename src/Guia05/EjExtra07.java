package Guia05;

import java.util.Scanner;

public class EjExtra07 {

    public static void main(String[] args) {
        /* 7. Realizar un programa que complete un vector con los N primeros números de la 
        sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes 
        números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
        La sucesión del número 2 se calcula sumando (1+1) Análogamente, la sucesión del número 3 es (1+2),
        Y la del 5 es (2+3), Y así sucesivamente… La sucesión de Fibonacci se puede formalizar de acuerdo 
        a la siguiente fórmula:
        Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
        Fibonaccin = 1 para todo n<=1
        Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como 
        parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.        
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero para determinar el tamaño del vector");
        int n = leer.nextInt();
        int vectorFibonacci[] = new int[n];
        int a = 1;
        int b = 1;
        int c;
        System.out.println("La sucesion de Fibonacci hasta el numero ingresado es: ");
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(a + ", ");
            } else {
                System.out.println(a + " ");
            }
            c = a + b;
            a = b;
            b = c;
        }
    }
}
