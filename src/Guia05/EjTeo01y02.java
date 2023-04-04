package Guia05;

public class EjTeo01y02 {

    public static void main(String[] args) {
        /* Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
        de equipo y define su tipo de dato de tal manera que te permita alojar sus
        nombres más adelante.        
         */
//        String[] equipo = new String[7];

        /* Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
        compañeros de equipo
         */
//        for(int i = 0; i < 7; i++) {
//        equipo[i] = "ana";
//        }
//  Podemos declarar y dar valores predeterminados al crear el vector
        String equipo[] = {"Gaby", "Thomas", "Nicolas", "Ana", "Miguel", "German", "Alicia"};
        String aux = "";
        for (String espacio : equipo) {
            aux = aux + "  " + espacio;
        }
        System.out.println(aux);
    }
}
