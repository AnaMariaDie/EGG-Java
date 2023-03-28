package Guia03;

import java.util.Scanner;

public class EjExtra12 {

    public static void main(String[] args) {
        /* 12.Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
        números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
        aparezca un 3 lo sustituya por una E. Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String. 
         */
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String numI = String.valueOf(i);
                    String numJ = String.valueOf(j);
                    String numK = String.valueOf(k);
                    numI = numI.replace('3', 'E');
                    numJ = numJ.replace('3', 'E');
                    numK = numK.replace('3', 'E');
                    System.out.print(numI + " - " + numJ + " - " + numK + " ");
                    System.out.println(" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
