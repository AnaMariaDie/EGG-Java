package Guia03;

import java.util.Scanner;

public class EjPractico04 {

    public static void main(String[] args) {
        /* 4. Escriba un programa que pida una frase o palabra y valide si la primera
        letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
        imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
        contrario, se deberá imprimir “INCORRECTO”. 
        Nota: investigar la funciónn Substring y equals() de Java.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
        char letra = frase.charAt(0);
        if (letra == 'a' || letra == 'A') {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
