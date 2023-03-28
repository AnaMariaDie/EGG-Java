package Guia03;

import java.util.Scanner;

public class EjExtra01 {

    public static void main(String[] args) {
        /* 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
        ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
        equivalente: 1 día, 2 horas.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor en minutos");
        int minutos = leer.nextInt();
        int dia = minutos / 1440;
        int hora = (minutos / 60) - (dia * 24);
        System.out.println("El valor ingresado equivale a " + dia + " dias y " + hora + " horas");
    }
}
