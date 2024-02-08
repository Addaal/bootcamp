import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int IVA = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Precio con IVA: " + (precio + (precio * IVA) / 100));

    }
}
