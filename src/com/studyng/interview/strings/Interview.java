package com.studyng.interview.strings;

import java.util.HashMap;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {
        String text = "aaabcccdeeef";
        Map<Character, Integer> map = new HashMap<>();
        String result = "";

        for (int i = 0; i < text.length() ; i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }
        
        for(Map.Entry entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                result = entry.getKey().toString();
                break;
            }
        }
        System.out.println("Result: " +  result);
    }
}
