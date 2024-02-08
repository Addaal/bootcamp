import java.util.Objects;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String contrasena = "54hjd12";
        System.out.println(contrasena);
        boolean ingreso = false;

        System.out.println("Ingresa la contrasena (tienes 3 intentos):");
        String contrasenaInput = new Scanner(System.in).nextLine();
        if(!Objects.equals(contrasenaInput, contrasena)){
            for (int i = 0; i < 2; i++) {
                System.out.println("Tienes " + (2-i) + " intentos restantes");
                System.out.println("Ingresa la contrasena:");
                contrasenaInput = new Scanner(System.in).nextLine();

                if(Objects.equals(contrasenaInput, contrasena)){

                    ingreso = true;
                    break;
                }
            }
        }
        if(ingreso){
            System.out.println("Correcto");
        }else{

        System.out.println("Fallaste JAJA");
        }

    }
}
