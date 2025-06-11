package com.studyng.interview.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NoRepetido {
    public static void main(String[] args) {
        String word = "leetcodetdxl";
        System.out.println("\nNo Repetido: " + firstUniqChar(word));
    }

    public static Character firstUniqChar(String s) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }
}
