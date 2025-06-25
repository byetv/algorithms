package com.studyng.interview.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2,3,3, 3};
        int length = eliminarDuplicados(arr);

        System.out.print("Resultado: [");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + (i < length - 1 ? ", " : ""));
        }
        System.out.println("]");

        int[] arr2 = {5, 6, 6, 8, 8, 9};
        int[] result = eliminarDuplicadosV2(arr2);
        System.out.println(Arrays.toString(result));

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

    public static int[] eliminarDuplicadosV2(int[] arr) {
        if (arr.length == 0) return new int[0];

        int[] temp = new int[arr.length];
        int j = 0;
        temp[j++] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[j++] = arr[i];
            }
        }

        return Arrays.copyOf(temp, j);
    }
}
