import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un dia: ");
        String dia = scanner.nextLine();

        if(dia.equals("Lunes") || dia.equals("Martes") || dia.equals("Miercoles") || dia.equals("Jueves") || dia.equals("Viernes")
        || dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes")){
            System.out.println("dia laboral");

        }else if(dia.equals("Sabado") || dia.equals("Domingo")
                || dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("feriado");
        }else{
            System.out.println("Escribi bien");
        }
    }
}
