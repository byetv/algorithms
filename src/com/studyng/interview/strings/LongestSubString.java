package com.studyng.interview.strings;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstringV2(s));

    }

    public static int lengthOfLongestSubstringV2(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);

            // If character is not in set, add it and update maxLen
            if (!set.contains(c)) {
                set.add(c);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                // If duplicate, remove the leftmost char and move left
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int total = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = sb.indexOf(String.valueOf(c));

            if (index != -1) {
                // Remove all characters up to and including the duplicate
                sb.delete(0, index + 1);
            }

            sb.append(c);
            total = Math.max(total, sb.length());

        }
        return total;
    }
}
