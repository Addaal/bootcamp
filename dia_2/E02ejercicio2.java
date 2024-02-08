import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;


public class E02ejercicio2 {

    public static int retornarNumeroConMayorFrecuencia(int[] array){
        int frecuencia = 0;
        int numeroConMayorFrecuencia = array[0];

        for(int i = 0; i < array.length; i++) {
            int nuevaFrecuencia = 0;
            for(int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    nuevaFrecuencia++;
                }
                if(nuevaFrecuencia > frecuencia ) {
                    frecuencia = nuevaFrecuencia;
                    numeroConMayorFrecuencia = array[i];
                }
            }
        }

        return numeroConMayorFrecuencia;
    }

    public static ArrayList<Integer> NumerosFaltantes(int[] array) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        for (int j = -30; j <= 30; j++) {
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                dynamicArray.add(j);
            }
        }
        return dynamicArray;
    }


    public static void main(String[] args) {
        int[] miArray = new int[100];
        for(int i = 0; i < miArray.length; i++) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(61) - 30;
            miArray[i] = numeroAleatorio;
        }
        for(int i = 0; i < miArray.length; i++)
        {
            System.out.print("\t" + miArray[i]);
        }
        System.out.println("\nNumero con mayor frecuencia: " + retornarNumeroConMayorFrecuencia(miArray));
        ArrayList<Integer> numerosFaltantesArray =  NumerosFaltantes(miArray);
        System.out.println("\n numerosFaltantes:");
        for(int i = 0; i < numerosFaltantesArray.size(); i++) {
            System.out.print("\t" + numerosFaltantesArray.get(i));
        }
    }
}
