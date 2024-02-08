import java.util.Random;

public class E02ejercicio1 {

    public static void main(String[] args) {
        int[] miArray = new int[10];
        for(int i = 0; i < miArray.length; i++) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(11) - 5;
            miArray[i] = numeroAleatorio;
        }


        int largestNum = miArray[0];

        for(int i = 0; i < miArray.length; i++) {
            System.out.print("\t" + miArray[i]);
            if(largestNum < miArray[i]) {
                largestNum = miArray[i];
            }
        }
        System.out.println("\nLargest number: " + largestNum);
    }
}
