package Guia03;

import java.util.Scanner;

public class EjExtra14 {

    public static void main(String[] args) {
        /* 14.Se dispone de un conjunto de N familias, cada una de las cuales tiene
        una M cantidad de hijos. Escriba un programa que pida la cantidad de
        familias y para cada familia la cantidad de hijos para averiguar la media
        de edad de los hijos de todas las familias.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias a censar");
        int cantidadFamilias = leer.nextInt();
        double promedio;
        double sumaEdad = 0;
        int sumaHijos = 0;
        for (int i = 0; i < cantidadFamilias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia ");
            int cantHijos = leer.nextInt();
            sumaHijos = sumaHijos + cantHijos;
            for (int j = 0; j < cantHijos; j++) {
                System.out.println("Ingrese la edad del hijo N° " + (j + 1));
                double edades = leer.nextInt();
                sumaEdad = sumaEdad + edades;
            }
        }
        promedio = sumaEdad / sumaHijos;
        System.out.println("Cantidad de familias censadas: " + cantidadFamilias);
        System.out.println("Cantidad total de hijos censados: " + sumaHijos);
        System.out.println("El promedio de edades total es: " + promedio);
    }
}
