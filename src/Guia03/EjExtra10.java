package Guia03;

import java.util.Scanner;

public class EjExtra10 {

    public static void main(String[] args) {
        /* 10.Realice un programa para que el usuario adivine el resultado de una
        multiplicación entre dos números generados aleatoriamente entre 0 y 10.
        El programa debe indicar al usuario si su respuesta es o no correcta. En
        caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
        su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.
         */
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        int total = num1 * num2;
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//        System.out.println("total = " + total);
        System.out.println("Adivina el resultado de la multiplicacion de los numeros");
        int resp = leer.nextInt();
        do {
            System.out.println("Intenta nuevamente");
            resp = leer.nextInt();
            System.out.println("Te das por vencido");
            String resp2 = leer.next();
            if (resp2.equalsIgnoreCase("S")) {
                System.out.println("total = " + total);
                break;
            }
        } while (resp != total);
    }
}
