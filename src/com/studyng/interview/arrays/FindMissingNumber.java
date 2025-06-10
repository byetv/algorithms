package com.studyng.interview.arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7,8,9,10};

        int n = nums.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) sum += num;
        System.out.println(total - sum);
    }
}
