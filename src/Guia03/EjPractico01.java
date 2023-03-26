package Guia03;

import java.util.Scanner;

public class EjPractico01 {

    public static void main(String[] args) {
        // 1. Crear un programa que dado un número determine si es par o impar.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
