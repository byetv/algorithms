package com.studyng.interview.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2,3,3, 3};
        int length = eliminarDuplicados(arr);

        System.out.print("Resultado: [");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + (i < length - 1 ? ", " : ""));
        }
        System.out.println("]");

    }

    public static int eliminarDuplicados(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // índice del último valor único

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // sobrescribe el duplicado
            }
        }

        return i + 1; // la nueva longitud del array sin duplicados
    }
}
