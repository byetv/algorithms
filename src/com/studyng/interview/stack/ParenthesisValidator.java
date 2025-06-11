package com.studyng.interview.stack;

import java.util.Stack;

public class ParenthesisValidator {
    public static void main(String[] args) {
        String input = "(()())()";
        System.out.println("its valid? " + isValid(input));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Si es un paréntesis de apertura, lo agregamos a la pila
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Si es un paréntesis de cierre, verificamos si coincide
            else if (c == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            }
            else if (c == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            }
            else if (c == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            }
        }

        // Al final, la pila debe estar vacía si todo está bien
        return stack.isEmpty();
    }


}
