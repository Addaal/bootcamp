import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.print("Enter a number greater o equal to 0: ");
            number = scanner.nextInt();
        }while (number < 0);
        System.out.println(number);
    }
}
