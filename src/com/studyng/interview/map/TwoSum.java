package com.studyng.interview.map;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        //int[] arr = {3,2,4};
        int target = 17;

        //encontrarSuma(arr, target);
        int[] result = twoSum(arr, target);
        System.out.println("Result:" + Arrays.toString(result));
    }

    public static void encontrarSuma(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("(" + nums[i] + ", " + nums[j] + ")");
                }
            }
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] result = new int[2];

        while(left != right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            } else {
                if(sum > target){
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }

    public int[] twoSumNotOrder(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        // Just for safety, though problem guarantees one solution
        throw new IllegalArgumentException("No two sum solution");
    }
}
