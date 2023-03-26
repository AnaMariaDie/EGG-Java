package Guia03;

import java.util.Scanner;

public class EjTeo01 {

    public static void main(String[] args) {
        /* Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
        Scanner.
         */
        Scanner leer = new Scanner(System.in);
        boolean siONo = false;
        System.out.println("Indica si 2 es < 4");
        if (2 < 4) {
            siONo = true;
            System.out.println("respuesta = " + siONo);
        } else {
            System.out.println("respuesta = " + siONo);
        }
        System.out.println("Indica el costo de un agua");
        double costo = leer.nextDouble();
        System.out.println("costo = " + costo);
        System.out.println("Ingresa la primer letra de tu nombre");
        char letra = leer.next().charAt(0); // para leer solo el primer caracter 
        System.out.println("letra = " + letra);
    }
}
