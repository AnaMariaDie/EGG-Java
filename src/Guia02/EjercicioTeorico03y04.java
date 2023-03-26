package Guia02;

public class EjercicioTeorico03y04 {

    public static void main(String[] args) {
        // Ejercicio 03
        int num1 = 5;
        int num2 = 30;
        int suma;
        int multiplicacion;
        int incremento;
        int decremento;
        boolean bandera1;
        boolean bandera2;

        System.out.println("num1 es: " + num1);
        System.out.println("num2 es: " + num2);

        suma = num1 + num2;
        System.out.println("La suma de los numeros es: " + suma);
        multiplicacion = num1 * num2;
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        num1++;
        System.out.println("El incremento del num1 es: " + num1);
        num2--;
        System.out.println("El decremento del num2 es: " + num2);
        bandera1 = num1 < num2;
        System.out.println(" num1 es menor que num 2 esto es: " + bandera1);
        bandera2 = num1 > num2;
        System.out.println(" num1 es mayor que num 2 esto es: " + bandera2);

        // Ejercicio 04
        String nombre = "Ana";
        int edad = 39;

        System.out.println("Mi nombre es " + nombre + " y mi edad es " + edad);
    }
}
