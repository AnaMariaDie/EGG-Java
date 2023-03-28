package Guia03;

import java.util.Scanner;

public class EjExtra08 {

    public static void main(String[] args) {
        /* 8. Escriba un programa que lea números enteros. Si el número es múltiplo
        de cinco debe detener la lectura y mostrar la cantidad de números
        leídos, la cantidad de números pares y la cantidad de números impares.
        Al igual que en el ejercicio anterior los números negativos no deben
        sumarse. Nota: recordar el uso de la sentencia break.
         */
        Scanner leer = new Scanner(System.in);

        int sumaPar = 0;
        int sumaImpar = 0;
        int suma = 0;
        boolean bandera = false;
        int num;
        do {
            System.out.println("Ingrese un numero positivo");
            num = leer.nextInt();
            if (num < 0) {
                System.out.println("Ingrese un numero positivo");
                num = leer.nextInt();
            }
            if (num % 5 == 0) {
                bandera = true;
                break;
            }
            suma = suma + 1;
            if (num % 2 == 0) {
                sumaPar = sumaPar + 1;
            } else {
                sumaImpar = sumaImpar + 1;
            }
        } while (bandera == false);
        System.out.println("La cantidad de numeros leidos fue: " + suma);
        System.out.println("La cantidad de numeros pares fue: " + sumaPar);
        System.out.println("La cantidad de numeros impares fue: " + sumaImpar);
    }

}
