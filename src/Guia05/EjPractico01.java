package Guia05;

public class EjPractico01 {

    public static void main(String[] args) {
        /* 1. Realizar un algoritmo que llene un vector con los 100 primeros números
        enteros y los muestre por pantalla en orden descendente.
         */
        int[] numeros = new int[100];
        //  Construyendo vector
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1);
        }
        //  Escribiendo el vector
        for (int i = 99; i > -1; i--) {
            System.out.println("Numero en posicion " + i + " = " + numeros[i]);
        }
    }
}
