package Guia05;

public class EjPractico05 {

    public static void main(String[] args) {
        /* 5. Realice un programa que compruebe si una matriz dada es antisimétrica.
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su
        propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
        A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
        obtiene cambiando sus filas por columnas (o viceversa).        
         */
        int[][] matriz = new int[4][4];
        int[][] matrizA = new int[4][4];
        System.out.println("Matriz");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz[1].length; i++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }
        // Crear una Matriz Antisimetrica
        for (int j = 0; j < matrizA[0].length; j++) {
            for (int i = 0; i < matrizA[1].length; i++) {
                matrizA[i][j] = matriz[i][j] * -1;
            }
        }
        // Imprimir la Matriz Antisimetrica
        System.out.println("Matriz Antisimetrica");
        for (int j = 0; j < matrizA[0].length; j++) {
            for (int i = 0; i < matrizA[1].length; i++) {
                System.out.print("[ " + matrizA[i][j] + " ]");
            }
            System.out.println(" ");
        }
        // Comprobancion de Matrices
        int contDif = 0;
        // Contador de diferencias
        for (int j = 0; j < matrizA[0].length; j++) {
            for (int i = 0; i < matrizA[1].length; i++) {
                if (matrizA[i][j] != -(matriz[i][j])) {
                    contDif += 1;
                    break;
                }
            }
        }
        // Si es mayor a 0 entonces al menos un valor es diferente, sino son todos iguales
        if (contDif > 0) {
            System.out.println("La matriz NO es antisimetrica");
        } else if (contDif == 0) {
            System.out.println("La matriz es antisimetrica");
        }
    }
}
