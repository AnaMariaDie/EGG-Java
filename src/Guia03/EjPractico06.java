package Guia03;

import java.util.Scanner;

public class EjPractico06 {

    public static void main(String[] args) {
        /* 6. Realizar un programa que pida dos números enteros positivos por
        teclado y muestre por pantalla el siguiente menú:
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija Opcion:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
        del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’
        se sale del programa, caso contrario se vuelve a mostrar el menú.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
//        int opcion = 0;
        boolean op2 = false;
        do {
            System.out.println("**** MENU ****");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija Opcion");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("La multiplicacion es: " + multi);
                    break;
                case 4:
                    int divi = num1 / num2;
                    System.out.println("La division es: " + divi);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)");
                    String resp = leer.next();
                    if (resp.equalsIgnoreCase("S")) {
                        op2 = true;
                        System.out.println("Esta saliendo del programa");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (op2 != true);
    }
}
