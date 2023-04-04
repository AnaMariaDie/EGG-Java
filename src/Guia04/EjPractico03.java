package Guia04;

import java.util.Scanner;

public class EjPractico03 {

    public static void main(String[] args) {
        /* 3. Crea una aplicación que a través de una función nos convierta una cantidad de 
        euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
        La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será 
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
        El cambio de divisas es:
        i. * 0.86 libras es un 1 €
        ii. * 1.28611 $ es un 1 €
        iii. * 129.852 yenes es un 1 €
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de Euros a convertir");
        double euro = leer.nextInt();
        System.out.println("A que moneda deseas convertir?");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        String opcion = leer.next();
        convertirA(euro,opcion);
    }

    public static void convertirA(double euro, String opcion) {
        double resultado;
        switch (opcion) {
            case "1":
                resultado = euro * 0.86;
                System.out.println("€ " + euro + " equivale a £ " + resultado + " Libras");
                break;
            case "2":
                resultado = euro * 1.28611;
                System.out.println("€ " + euro + " equivale a $ " + resultado + " Dolares");
                break;
            case "3":
                resultado = euro * 129.852;
                System.out.println("€ " + euro + " equivale a ¥ " + resultado + " Yenes");
                break;
        }
    }
}
