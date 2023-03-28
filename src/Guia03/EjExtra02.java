package Guia03;

public class EjExtra02 {

    public static void main(String[] args) {
        /* 2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
        diferente a cada una. A continuación, realizar las instrucciones
        necesarias para que: B tome el valor de C, C tome el valor de A, A tome
        el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
        valores finales de cada variable. Utilizar sólo una variable auxiliar.
        */
        int A = 20;
        int B = 30;
        int C = 40;
        int D = 50;
        int aux = 0;
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);
    }
}
