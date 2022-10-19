package com.biswa.array;

import java.util.Arrays;

class BubbleSort {
    static int[] bubblesort(int arr[]) {
        System.out.println(Arrays.toString(arr));
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i)-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
}

public class BubbleSortMain {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 7, 9, 3, 6, 8};
        int sortArr[] = BubbleSort.bubblesort(arr);
        System.out.println(Arrays.toString(sortArr));
    }
}
