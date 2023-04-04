package Guia04;

import java.util.Scanner;

public class EjTeo02 {

    public static void main(String[] args) {
        /* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
        validando que el primer número múltiplo del segundo e imprima si el primer número es 
        múltiplo del segundo, sino informe que no lo son.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        esMultiplo(num1, num2);
    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("El primer numero NO es multiplo del segundo");
        }
    }
}
