package Guia02;

import java.util.Scanner;

public class EjPractico04 {

    public static void main(String[] args) {
        /* 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
        La fórmula correspondiente es: F = 32 + (9 * C / 5).
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad en grados centigrados");
        double centigrados = leer.nextDouble();
        double fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("El valor ingresado equivale a " + fahrenheit + " grados Fahrenheit");
    }
}
