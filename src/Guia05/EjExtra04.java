package Guia05;

import java.util.Scanner;

public class EjExtra04 {

    public static void main(String[] args) {
        /* 4. Los profesores del curso de programación de Egg necesitan llevar un registro de 
        las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
        desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos 
        prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final 
        del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual 
        al 7 de sus notas del curso.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double [] notas = new double[10];
        double tpe1 = 0;
        double tpe2 = 0;
        double in1 = 0;
        double in2 = 0;
        int aprobados = 0;
        int desaprobados = 0;
        // Ingresando las notas y realizando el promedio. Solo se guarda el promedio en el vector notas
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i+1));
            System.out.println("Ingrese la Nota del Trabajo Practico 1");
            tpe1 = leer.nextInt() * 0.10;
            System.out.println("Ingrese la Nota del Trabajo Practico 2");
            tpe2 = leer.nextInt() * 0.15;
            System.out.println("Ingrese la Nota del Integrador 1");
            in1 = leer.nextInt() * 0.25;
            System.out.println("Ingrese la Nota del Integrador 2");
            in2 = leer.nextInt() * 0.50;
            notas[i] = tpe1 + tpe2 + in1 + in2;
        }
        // Comprobando aprobados y desaprobados. Escribiendo el vector notas para verlo
        for (int i = 0; i < 10; i++) {
            System.out.print("[ " + notas[i] + " ]");
            if (notas[i] >= 7) {
                aprobados += 1;
            } else {
            desaprobados += 1;
            }
        }
        System.out.println("La cantidad de aprobados fue: " + aprobados);
        System.out.println("La cantidad de desaprobados fue: " + desaprobados);
    }
}
