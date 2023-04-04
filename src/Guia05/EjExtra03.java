package Guia05;

public class EjExtra03 {

    public static void main(String[] args) {
        /* 3. Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
        por parámetro. Después haremos otra función o procedimiento que imprima el vector.        
         */
        int size = 10;
        int[] vector = new int[size];
        devolverVector(vector, size);
        imprimirVector(vector, size);
        System.out.println("");
    }
    
    public static int[] devolverVector(int[] vector, int size) {
        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }
    public static void imprimirVector(int [] vector, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("[ " + vector[i] + " ] ");
        }    
    }
}
