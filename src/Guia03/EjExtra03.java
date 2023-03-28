package Guia03;

import java.util.Scanner;

public class EjExtra03 {

    public static void main(String[] args) {
        /* 3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
        trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
        la función equals() de la clase String.        
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
}
