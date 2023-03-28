package Guia03;

import java.util.Scanner;

public class EjExtra07 {

    public static void main(String[] args) {
        /* 7. Realice un programa que calcule y visualice el valor máximo, el valor
        mínimo y el promedio de n números (n>0). El valor de n se solicitará al
        principio del programa y los números serán introducidos por el usuario.
        Realice dos versiones del programa, una usando el bucle “while” y otra
        con el bucle “do - while”.
         */
        Scanner leer = new Scanner(System.in);
        int valMax = 0;
        int valMin = 0;
        int suma = 0;
        int cont = 0;
        boolean bandera = true;
        System.out.println("Ingrese la cantidad de numeros");
        int cantidad = leer.nextInt();
        
        // WHILE
        while (cantidad != cont) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if (bandera == true) {
                valMin = num;
                bandera = false;
            } else {
                if (num < valMin) {
                    valMin = num;
                }
            }
            suma = suma + num;
            if (num > valMax) {
                valMax = num;
            }
            cont = cont + 1;
        }
        System.out.println("El valor Maximo es: " + valMax);
        System.out.println("El valor Minimo es: " + valMin);
        System.out.println("El Promedio es: " + suma / cantidad);

        // DO WHILE
        int valMax1 = 0;
        int valMin1 = 0;
        int suma1 = 0;
        int cont1 = 0;
        boolean bandera1 = true;
        System.out.println("Ingrese la cantidad de numeros");
        int cantidad1 = leer.nextInt();
        do {
            System.out.println("Ingrese un numero");
            int num1 = leer.nextInt();
            if (bandera1 == true) {
                valMin1 = num1;
                bandera1 = false;
            } else {
                if (num1 < valMin1) {
                    valMin1 = num1;
                }
            }
            suma1 = suma1 + num1;
            if (num1 > valMax1) {
                valMax1 = num1;
            }
            cont1 = cont1 + 1;
        } while (cantidad1 != cont1);
        System.out.println("El valor Maximo es: " + valMax1);
        System.out.println("El valor Minimo es: " + valMin1);
        System.out.println("El Promedio es: " + suma1 / cantidad1);
    }
}
