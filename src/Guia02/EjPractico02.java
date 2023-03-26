package Guia02;

import java.util.Scanner;

public class EjPractico02 {

    public static void main(String[] args) {
        // 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
