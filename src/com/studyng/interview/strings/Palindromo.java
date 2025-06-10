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
}
