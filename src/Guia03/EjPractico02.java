package Guia03;

import java.util.Scanner;

public class EjPractico02 {
    public static void main(String[] args) {
        /* 2. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
        programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
        Incorrecto. Nota: investigar la función equals() en Java.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto");
        } else System.out.println("Incorrecto");
    }
}
