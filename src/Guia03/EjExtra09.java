package Guia03;

import java.util.Scanner;

public class EjExtra09 {

    public static void main(String[] args) {
        /* 9. Simular la división usando solamente restas. Dados dos números enteros
        mayores que uno, realizar un algoritmo que calcule el cociente y el
        residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
        obtener un resultado menor que el divisor, este resultado es el residuo, y
        el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
        */  
        Scanner leer = new Scanner(System.in);
        int cociente = 0;
        int residuo;
        System.out.println("Ingrese dos numeros enteros mayores a 1. "
                + "El primero sera el dividendo y el segundo el divisor");
        int dividendo = leer.nextInt();
        int divisor = leer.nextInt();
        do {
        residuo = dividendo - divisor; 
        cociente = cociente + 1;
        System.out.println(dividendo + " - " + divisor + " = " + residuo + "  " + cociente + " resta realizada");  
        dividendo = residuo;
        } while (residuo > divisor);
        System.out.println("El residuo es: " + residuo
        + " y el cociente es: " + cociente);   
    }
}
