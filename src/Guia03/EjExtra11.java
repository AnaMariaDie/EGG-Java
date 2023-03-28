package Guia03;

import java.util.Scanner;

public class EjExtra11 {

    public static void main(String[] args) {
        /* 11. Escribir un programa que lea un número entero y devuelva el número de
        dígitos que componen ese número. Por ejemplo, si introducimos el
        número 12345, el programa deberá devolver 5. Calcular la cantidad de
        dígitos matemáticamente utilizando el operador de división. Nota:
        recordar que las variables de tipo entero truncan los números o
        resultados. 
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        int cantidad = 0;

        do {
            cantidad = cantidad + 1;
            num = num / 10;
        } while (num >= 1);
        System.out.println("El numero ingresado tiene " + cantidad + " digitos");
    }
}
