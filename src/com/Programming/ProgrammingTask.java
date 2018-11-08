package com.Programming;

public class ProgrammingTask {

    private static int maxValueOfOrderedSubsequence(int[] arr) {
        int arrLen = arr.length;
        int m=1,t=1;
        for (int i = 0; i < arrLen; i++) {
            if (i + 1 < arrLen) {

                if ((arr[i] < arr[i + 1])) {
                    t++;
                } else {
                    if (t > m)
                        m = t;
                    t = 1;

                }
            }

        }
        if (m < t)
            m = t;
        return m;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 2, 1, 3, 5, 6, 2, 3, 7};
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] arr2 = {2, 7, 1, 8, 2, 8, 1};
        System.out.println("Max Length of ordered subsequence of arr  = " +
                maxValueOfOrderedSubsequence(arr));
        System.out.println("Max Length of ordered subsequence of arr1 = " +
                maxValueOfOrderedSubsequence(arr1));
        System.out.println("Max Length of ordered subsequence of arr2 = " +
                maxValueOfOrderedSubsequence(arr2));

    }
}


