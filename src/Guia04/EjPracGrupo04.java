package Guia04;

import java.util.Scanner;

public class EjPracGrupo04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese un numero");
        int num = leer.nextInt();
        boolean primosos;
        primosos = primo(num);
        System.out.println("El numero ingresado es primo? " + primosos);
    }

    public static boolean primo(int num) {
        boolean primos;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primos = false;
                return primos;
            }
        }
        primos = true;
        return primos;
    }
}
