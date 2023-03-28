package Guia03;

import java.util.Scanner;

public class EjExtra04 {

    public static void main(String[] args) {
        /* 4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
        muestre su equivalente en romano.        
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10");
        int num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El numero es I");
                break;
            case 2:
                System.out.println("El numero es II");
                break;
            case 3:
                System.out.println("El numero es III");
                break;
            case 4:
                System.out.println("El numero es IV");
                break;
            case 5:
                System.out.println("El numero es V");
                break;
            case 6:
                System.out.println("El numero es VI");
                break;
            case 7:
                System.out.println("El numero es VII");
                break;
            case 8:
                System.out.println("El numero es VIII");
                break;
            case 9:
                System.out.println("El numero es IX");
                break;
            case 10:
                System.out.println("El numero es X");
                break;
            default:
                System.out.println("El valor ingresado no es valido");
        }
    }
}
