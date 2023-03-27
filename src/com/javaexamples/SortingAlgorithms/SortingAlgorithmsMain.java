package com.javaexamples.SortingAlgorithms;

import java.util.Arrays;

public class SortingAlgorithmsMain {
    public static void main(String[] args) {
        // -- No. 01 --
        bubbleSort(new int[]{64, 34, 25, 1, 12, 22, 11, 90});
    }

    private static void bubbleSort(int[] array) {
        boolean isSwapped = true;

        while (isSwapped) {
            isSwapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                int tempInt = array[i];

                if (array[i + 1] < tempInt) {
                    array[i] = array[i + 1];
                    array[i + 1] = tempInt;
                    isSwapped = true;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
