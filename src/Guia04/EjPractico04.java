package Guia04;

import java.util.Scanner;

public class EjPractico04 {

    public static void main(String[] args) {
        /* 4. Crea una aplicación que nos pida un número por teclado y con una función se lo 
        pasamos por parámetro para que nos indique si es o no un número primo, debe devolver 
        true si es primo, sino false.
        Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
        Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo. 
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        boolean retorno = primoONo(numero);
        System.out.println("El numero ingresado es Primo " + retorno);
        System.out.println(" ");
        esPrimo(numero);

//      Probando la funcion
//        for(int i = 0; i <= 100; i++) {
//            System.out.println(i + " -> " + primoONo(i));
//        }
    }

    public static boolean primoONo(int numero) {
        boolean esONo = false;
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont = cont + 1;
            }
        }
        if (cont != 2) {
            esONo = false;
        } else {
            esONo = true;
        }
        return esONo;
    }
//  Otra forma de resultado
    public static void esPrimo(int numero) {
        boolean resultado = false;
        for (int i = 2; i <= numero - 1; i++) {
            if (numero % i == 0) {
                resultado = false;
            } else {
                resultado = true;
            }
        }
        System.out.println(resultado);
    }
}
