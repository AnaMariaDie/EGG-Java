package Guia03;

import java.util.Scanner;

public class EjTeo04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
        la nota se pedirá de nuevo hasta que la nota sea correcta.
         */
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = leer.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese la nota nuevamente");
            nota = leer.nextInt();
        }
    }
}
