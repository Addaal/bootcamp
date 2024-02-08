package com.roshka.bootcamp;
import java.util.Stack;

public class BalanceadorParentesis {
    public static Boolean isBalanced(final String cadena) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                stack.push(cadena.charAt(i));
            } else if (cadena.charAt(i) == ']' || cadena.charAt(i) == ')' || cadena.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else if ((cadena.charAt(i) == ')' && stack.peek() == '(') ||
                        (cadena.charAt(i) == ']' && stack.peek() == '[') ||
                        (cadena.charAt(i) == '}' && stack.peek() == '{')) {
                    stack.pop();
                }

            }

        }
        return stack.isEmpty();
    }




    public static void main(String[] args) {
//        System.out.println(BalanceadorParentesis.isBalanced("([])"));
//        System.out.println(BalanceadorParentesis.isBalanced("()[]{}{"));
//        System.out.println(BalanceadorParentesis.isBalanced("({[()]()})"));
       System.out.println(BalanceadorParentesis.isBalanced("{}"));

    }
}
