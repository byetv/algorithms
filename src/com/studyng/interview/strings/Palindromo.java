package com.studyng.interview.strings;

public class Palindromo {

    public static void main(String[] args) {
        String palindromo = "abcderdcba";

        int len = palindromo.length() - 1;

        boolean isPalindromo = true;

        for (int i = 0; i < len; i++) {
            boolean sameLetter = palindromo.charAt(i) == palindromo.charAt(len);
            if(!sameLetter){
               System.out.println("Its not a palindromo");
                isPalindromo = false;
               break;
            }
            len--;
        }
        if(isPalindromo) {
            System.out.println("Its a palindromo");
        }
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        // Negativos o números que terminan en 0 (pero no son 0) no pueden ser palíndromos
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Para número par de cifras: x == reversed
        // Para número impar de cifras: x == reversed / 10
        return x == reversed || x == reversed / 10;
    }
}
