package Guia02;

import java.util.Scanner;

public class EjPractico05 {

    public static void main(String[] args) {
        /*  5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
        el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt().
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int nume = leer.nextInt();
        int doble = nume * 2;
        System.out.println("El doble es: " + doble);
        int triple = nume * 3;
        System.out.println("El triple: " + triple);
        double rcuadrada = Math.sqrt(nume);
        System.out.println("La raiz cuadrada es: " + rcuadrada);
    }
}
