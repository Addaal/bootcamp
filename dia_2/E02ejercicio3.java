import java.util.Scanner;


public class E02ejercicio3 {

    public static boolean isPalindrome(String mifrase) {
        String frase = mifrase.replaceAll("\\s", "");
        for (int i = 0; i < frase.length() / 2; i++) {
            if (frase.charAt(i)!= frase.charAt(frase.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase palindrome \n");
        String frase = scanner.nextLine();
        boolean isPalindromeBool = isPalindrome(frase);
        if (isPalindromeBool) {
            System.out.println("palindrome");
        } else {
            System.out.println("no palindrome");
        }

    }
}
