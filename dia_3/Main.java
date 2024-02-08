import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Ingrese segundos: ");
        Scanner sc = new Scanner(System.in);
        String segundos = sc.nextLine();
        int segundosInt = Integer.parseInt(segundos);
        Reloj reloj = new Reloj(segundosInt);
        System.out.println("Hora inicial: " + reloj.toString());
        for (int i = 0; i < 10; i++) {
            reloj.tick();
            System.out.println(reloj.toString());
        }

        System.out.println("Ingrese segundos para otro reloj: ");
        String segundos2 = sc.nextLine();
        int segundosInt2 = Integer.parseInt(segundos2);
        Reloj reloj2 = new Reloj(segundosInt2);
        System.out.println("Hora segundo reloj: " + reloj2.toString());
        reloj.restaReloj(reloj2);
        System.out.println("Resta: " + reloj.toString());

    }
}