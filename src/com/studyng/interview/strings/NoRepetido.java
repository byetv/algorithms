package com.studyng.interview.strings;

import java.util.HashMap;
import java.util.Map;

public class NoRepetido {
    public static void main(String[] args) {
        String word = "leetcodedx";
        
        int[] result = new int[0];
        
        char noRepetido = 0;
        result[0] = 2;
        
        for (int i = 0; i < word.length(); i++) {
            char actual = word.charAt(i);
            boolean repetido = false;

            for(int j = 0; j < word.length(); j++) {
                if(i != j && actual == word.charAt(j)) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                noRepetido = actual;
            }
        }

        System.out.println("No Repetido: " + noRepetido);
        System.out.println("No Repetido: " + firstUniqChar(word));
    }

    public static Character firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c,1) + 1);
        }

        for(Map.Entry<Character, Integer> entry : count.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }
}
