import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jugador 1, ingrese su nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Jugador 2, ingrese su nombre: ");
        String nombre2 = scanner.nextLine();

        Pilas pila1 = new Pilas();
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(8) + 3;
            pila1.setPilasInitial(i, randomNumber);
        }

        System.out.println("A: " + pila1.getPilaA() + "\tB: " + pila1.getPilaB() + "\tC: " + pila1.getPilaC());

        boolean togglePlayer = false;
        char pilaName;
        while ((pila1.getPilaA() + pila1.getPilaB() + pila1.getPilaC()) != 0) {
            do {
                if (!togglePlayer) {
                    System.out.print(nombre1 + ", elija una pila: ");
                } else {
                    System.out.print(nombre2 + ", elija una pila: ");
                }
                pilaName = scanner.next().charAt(0);
            } while (pilaName != 'A' && pilaName != 'B' && pilaName != 'C');
            int cantidadAQuitar;
            System.out.print("Cuantos quitara de la pila " + pilaName + ":");
            cantidadAQuitar = scanner.nextInt();
            pila1.PilaToRemove(pilaName, cantidadAQuitar);
            System.out.println("A: " + pila1.getPilaA() + "\tB: " + pila1.getPilaB() + "\tC: " + pila1.getPilaC());

            if(pila1.getPilaA() + pila1.getPilaB() + pila1.getPilaC() == 0){
                break;
            }
            togglePlayer = !togglePlayer;
        }
        if(!togglePlayer){
        System.out.println(nombre1 +",ya no quedan contadores, asi que.. Ganaste");
        }else{
            System.out.println(nombre2 +",ya no quedan contadores, asi que.. Ganaste");
        }

    }
}