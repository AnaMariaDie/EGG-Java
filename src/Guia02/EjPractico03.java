package Guia02;

import java.util.Scanner;

public class EjPractico03 {

    public static void main(String[] args) {
        /* 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en 
        minúsculas.
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = leer.nextLine();
        String minuscula = frase.toLowerCase();
        System.out.println("La frase en minuscula: " + minuscula);
        String mayuscula = frase.toUpperCase();
        System.out.println("La frase en mayuscula: " + mayuscula);
    }
}
