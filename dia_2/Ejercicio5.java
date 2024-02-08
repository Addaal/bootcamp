import java.util.Scanner;

public class Ejercicio5
{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int inputNumber = scanner.nextInt();
        if(inputNumber % 2 == 0){
            System.out.println(inputNumber + " es par");
        }else{
            System.out.println(inputNumber + " es inpar");
        }
    }
}
