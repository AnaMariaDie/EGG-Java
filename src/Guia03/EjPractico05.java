package Guia03;

import java.util.Scanner;

public class EjPractico05 {

    public static void main(String[] args) {
        /* 5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los
        números introducidos supere el límite inicial.
         */
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese un valor limite");
        int limite = leer.nextInt();
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = suma + num;
        } while (limite>suma);
    }
}
