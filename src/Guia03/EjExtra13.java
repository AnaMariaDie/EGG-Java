package Guia03;

import java.util.Scanner;

public class EjExtra13 {

    public static void main(String[] args) {
        /* 13.Crear un programa que dibuje una escalera de números, donde cada
        línea de números comience en uno y termine en el número de la línea.
        Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
        ingresa el número 3:
        1 12
        123 
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int escalon = leer.nextInt();
        int cont = 0;
        for (int i = 1; i <= escalon; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
