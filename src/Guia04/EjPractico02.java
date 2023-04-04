package Guia04;

import java.util.Scanner;

public class EjPractico02 {

    public static void main(String[] args) {
        /* 2. Diseñe una función que pida el nombre y la edad de N personas e imprima los 
        datos de las personas ingresadas por teclado e indique si son mayores o menores de 
        edad. Después de cada persona, el programa debe preguntarle al usuario si quiere 
        seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.        
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        do {
            System.out.println("Indique el nombre de la persona");
            String nombre = leer.next();
            System.out.println("Indique la edad de la misma");
            int edad = leer.nextInt();
            if (edad > 18) {
                System.out.println("La persona " + nombre + " de " + edad + " años es mayor de edad");
            } else {
                System.out.println("La persona " + nombre + " de " + edad + " años es menor de edad");
            }
            System.out.println("Desea seguir mostrando personas: SI o NO");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("NO")) {
                salir = true;
            }
        } while (salir != true);
    }
}
