package Guia05;

import java.util.Random;
import java.util.Scanner;

public class EjExtra06 {

    public static void main(String[] args) {
        /* 6. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
        a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de 
        tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una 
        fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las
        palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente 
        imprima por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
        de Java substring(), Length() y Math.random().        
         */
        String[][] sopa = new String[20][20];
        llenarMatriz(sopa);
        mostrarMatriz(sopa);
        agregarPalabra(sopa);
        System.out.println("Matriz con las palabras ingresadas");
        mostrarMatriz(sopa);
    }

    // Llenar Matriz con numeros random
    public static String[][] llenarMatriz(String[][] sopa) {
        Random random = new Random();
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                int num = random.nextInt(9 - 0);
                String numCad = String.valueOf(num);
                sopa[i][j] = numCad;
            }
        }
        return sopa;
    }

    // Imprime la sopa
    public static String[][] mostrarMatriz(String[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print("[ " + sopa[i][j] + " ] ");
            }
            System.out.println("");
        }
        System.out.println("");
        return sopa;
    }

    // Agregamos las palabras
    public static String[][] agregarPalabra(String[][] sopa) {

        Random random = new Random();
        int val = 0;
        int k = 0;
        int ni = 0;
        int nj = 0;
        while (k < 5) {
            val = ni;

            String palabra = comprobarPalabra();
            ni = random.nextInt(20 - palabra.length());
            nj = random.nextInt(20 - palabra.length());
            if (val != ni) {
                int c = 0;
                for (int j = 0; j < palabra.length(); j++) {
                    sopa[ni][nj + j] = palabra.toUpperCase().substring(c, c + 1);
                    c++;
                }
            } else {
                ni = random.nextInt(20 - palabra.length());
                nj = random.nextInt(20 - palabra.length());
                int c = 0;
                for (int j = 0; j < palabra.length(); j++) {
                    sopa[ni][nj + j] = palabra.toUpperCase().substring(c, c + 1);
                    c++;
                }
            }
            k += 1;
        }
        return sopa;
    }

    public static String comprobarPalabra() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra de 3 a 5 caracteres");
        String palabra = leer.next();
        if (palabra.length() < 3) {
            System.out.println("La palabra ingresada demaciado corta, ingrese una mayor a 3 caracteres");
            palabra = leer.next();
        } else if (palabra.length() > 5) {
            System.out.println("La palabra ingresada es demaciado larga, ingrese una con menos de 5 caracteres");
            palabra = leer.next();
        }
        return palabra;
    }
}
