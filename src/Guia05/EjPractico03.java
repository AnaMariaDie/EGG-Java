package Guia05;

public class EjPractico03 {

    public static void main(String[] args) {
        /* 3. Recorrer un vector de N enteros contabilizando cuántos números son de
        1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        int[] vector = new int[50];
        // Llenar Vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10000);
            System.out.println("Vector en posicion " + i + " = " + vector[i]);
        }
        int cant1 = 0;
        int cant2 = 0;
        int cant3 = 0;
        int cant4 = 0;
        int cant5 = 0;
        // Contamos la cantidad de digitos
        for (int i = 0; i < vector.length; i++) {
            String numCadena = String.valueOf(vector[i]);
            if (numCadena.length() == 5) {
                cant5 += 1;
            }
            if (numCadena.length() == 4) {
                cant4 += 1;
            }
            if (numCadena.length() == 3) {
                cant3 += 1;
            }
            if (numCadena.length() == 2) {
                cant2 += 1;
            }
            if (numCadena.length() == 1) {
                cant1 += 1;
            }
        }
        System.out.println("El vector tiene " + cant1 + " numeros de 1 digito");
        System.out.println("El vector tiene " + cant2 + " numeros de 2 digitos");
        System.out.println("El vector tiene " + cant3 + " numeros de 3 digitos");
        System.out.println("El vector tiene " + cant4 + " numeros de 4 digitos");
        System.out.println("El vector tiene " + cant5 + " numeros de 5 digitos");
        System.out.println("");
        System.out.println("Contamos con una funcion");
        for (int i = 0; i < vector.length; i++) {
            int resultado = digitos(vector[i]);
            System.out.println("Vector en posicion " + i + " = " + vector[i] + " tiene " + resultado + " digitos");
        }
    }
    // Otra forma de contar cantidad de digitos con una funcion
    public static int digitos(int num) {
        int div = 10;
        int digito = 0;
        int resultado;
        do {
            resultado = num / div;
            digito += 1;
            div = div * 10;
        } while (resultado >= 1);
        return digito;
    }
}
