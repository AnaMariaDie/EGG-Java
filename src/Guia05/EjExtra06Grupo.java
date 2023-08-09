package Guia05;

import java.util.Scanner;
import java.util.Random;

public class EjExtra06Grupo {

    public static void main(String[] args) {
        int contador = 0;
        String[][] sopa = new String[20][20];
        sopa = llenadoMatriz(sopa);
        impresionMatriz(sopa);

        int randomI = 0;
        int anteriorI = 0;
        while (contador < 5) {
            Random random = new Random();
            // Se pide las palabras
            String nombre = ingresoPalabra();
            contador++;
            // Verifica el largo para que no exceda el tamaño de la Matriz y que la fila no se repita
            // esto es para no sobreescribir palabras
            if (randomI == anteriorI) {
                randomI = random.nextInt(20 - nombre.length());
            }
            int randomJ = random.nextInt(20 - nombre.length());
            int count = 0;
            // Ingreso de las palabras dentro de la sopa
            for (int j = 0; j < nombre.length(); j++) {
                sopa[randomI][randomJ + j] = nombre.toUpperCase().substring(count, count + 1);
                count++;
            }
            anteriorI = randomI;
        }
        impresionMatriz(sopa);
    }

    // Ingreso de las 5 palabras y comprobacion de tamaño y cantidad
    public static String ingresoPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String rta = "";
        String palabra = sc.nextLine();
        while (palabra.length() < 3 || palabra.length() > 5) {
            rta = palabra.length() < 3 ? "Palabra demasiado corta, ingrese otra" : "Palabra demasiado larga, ingrese otra";
            System.out.println(rta);
            palabra = sc.nextLine();
        }
        return palabra;
    }

    // Llenado de Matriz con numeros aleatorios
    public static String[][] llenadoMatriz(String[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = String.valueOf(random.nextInt(10));
            }
        }
        return matriz;
    }

    // Impresion de Matriz
    public static void impresionMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
