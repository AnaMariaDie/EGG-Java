package Guia04;

import java.util.Scanner;

public class EjTeo01 {

    public static void main(String[] args) {
        /* Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
        y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente 
        manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto 
        de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
        a e i o u
        @ # $ % *
        Realice un subprograma que reciba una secuencia de caracteres y retorne la 
        codificación correspondiente. Utilice la estructura “según” para la transformación. 
        Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
        La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        System.out.println("La frase antes de codificarla: " + frase);
        String retorno = decodificar(frase);
        System.out.println("La frase ya codificada: " + retorno);
        System.out.println(" ");
    }

    public static String decodificar(String frase) {
        String frase1 = "";
        for (int i = 0; i < frase.length(); i++) {
//            frase1 = frase1.replace("a", "@");
//            frase1 = frase1.replace("e", "#");
//            frase1 = frase1.replace("i", "$");
//            frase1 = frase1.replace("o", "%");
//            frase1 = frase1.replace("u", "*");
            String letra = frase.substring(i, (i + 1));
            switch (letra.toLowerCase()) {
                case "a":
                    frase1 += "@";
                    break;
                case "e":
                    frase1 += "#";
                    break;
                case "i":
                    frase1 += "$";
                    break;
                case "o":
                    frase1 += "%";
                    break;
                case "u":
                    frase1 += "*";
                    break;
                default:
                    frase1 += letra;
                    break;
            }
        }
        return frase1;
    }
}
