package com.studyng.interview.strings;

public class Reverse {

    public static void main(String[] args) {
        String word = "hello  world";

        System.out.println(new StringBuilder(word).reverse());

        System.out.println("\n Reversed word: " + reverse(word));
    }

    public static String reverse(String word) {
        StringBuilder newWord = new StringBuilder();
        int len = word.length();

        while (len != 0){
            newWord.append(word.charAt(len - 1));
            len--;
        }
        return newWord.toString();
    }
}
