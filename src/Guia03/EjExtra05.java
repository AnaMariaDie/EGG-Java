package Guia03;

import java.util.Scanner;

public class EjExtra05 {

    public static void main(String[] args) {
        /* 5. Una obra social tiene tres clases de socios:
        - Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
        descuento en todos los tipos de tratamientos.
        - Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
        descuento para los mismos tratamientos que los socios del tipo A.
        - Los socios que menos aportan, los de tipo ‘C’, no reciben
        descuentos sobre dichos tratamientos.
        - Solicite una letra (carácter) que representa la clase de un socio, y
        luego un valor real que represente el costo del tratamiento (previo
        al descuento) y determine el importe en efectivo a pagar por dicho socio.        
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio A, B o C");
        char tipoSocio = leer.nextLine().charAt(0);
        System.out.println("Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
        double costoFin = 0;
        switch (tipoSocio) {
            case 'A':
            case 'a':
                System.out.println("El valor final del tratameinto es: $ " + costo * 0.50);
                break;
            case 'B':
            case 'b':
                System.out.println("El valor final del tratameinto es: $ " + costo * 0.65);
                break;
            case 'C':
            case 'c':
                System.out.println("El valor final del tratameinto es: $ " + costo);
                break;
        }
    }
}
