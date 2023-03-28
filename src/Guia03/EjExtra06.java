package Guia03;

import java.util.Scanner;

public class EjExtra06 {

    public static void main(String[] args) {
        /* 6. Leer la altura de N personas y determinar el promedio de estaturas que
        se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
        general.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de la muestra");
        int muestra = leer.nextInt();
        double sumaAlt = 0;
        double sumaMenor = 0;
        int altMen = 0;
        for (int i = 0; i < muestra; i++) {
            System.out.println("Ingrese la altura del sujeto " + i);
            double altura = leer.nextDouble();
            sumaAlt = sumaAlt + altura;
            if (altura < 1.60) {
                sumaMenor = sumaMenor + altura;
                altMen = altMen + 1;
            }
        }
        System.out.println("El promedio de estaturas por debajo de 1.60m es: " + sumaMenor / altMen);
        System.out.println("El promedio de estaturas general es: " + sumaAlt / muestra);
    }
}
