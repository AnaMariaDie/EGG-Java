package Guia03;

import java.util.Scanner;

public class EjPractico07 {

    public static void main(String[] args) {
        /* 7. Realizar un programa que simule el funcionamiento de un dispositivo
        RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
        cadenas deben llegar con un formato fijo: tienen que ser de un máximo
        de 5 caracteres de largo, el primer carácter tiene que ser X y el último
        tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
        FDE), y toda secuencia distinta de FDE, que no respete el formato se
        considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de
        lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
        deberá investigar cómo se utilizan las siguientes funciones de Java
        Substring(), Length(), equals().
         */
        Scanner leer = new Scanner(System.in);
        String cadena = "null";
        int sumCorrecta = 0;
        int sumIncorrecta = 0;
        int cantidad;
        String carI = "null";
        String carF = "null";
        String FDE = "&&&&&";
        do {
            System.out.println("Ingrese una cadena");
            cadena = leer.nextLine();
            cantidad = cadena.length();
            carI = cadena.substring(0, 1);
            carF = cadena.substring(cantidad - 1, cantidad);
            if (cantidad <= 5 && carI.equalsIgnoreCase("X") && carF.equalsIgnoreCase("O")) {
                sumCorrecta = sumCorrecta + 1;
            } else {
                if (cadena.equals(FDE)) {
                    break;
                } else {
                    sumIncorrecta = sumIncorrecta + 1;
                }
            }
        } while (!(cadena.equals(FDE)));

        System.out.println("La cantidad de cadenas Correctas fue: " + sumCorrecta);
        System.out.println("La cantidad de cadenas Incorrectas fue: " + sumIncorrecta);
    }
}
