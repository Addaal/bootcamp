//2. Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
////Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
public class Ejercicio2 {

    public static void main(String[] args) {
        int num1 = 8, num2 = 8;
        if (num1 == num2) {
            System.out.println("Same numbers");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
