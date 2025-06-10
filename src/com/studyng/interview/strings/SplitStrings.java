package com.studyng.interview.strings;

public class SplitStrings {
    public static void main(String[] args) {
        String word = "This is an example";

        String[] split = word.split(" ");

        for (String word2 : split){
            System.out.println(word2);
        }
    }
}
