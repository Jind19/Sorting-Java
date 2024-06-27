package com.prachi.sorting;
import java.util.*;
import java.util.Collections;

public class InbuiltSort {

    public static void main(String[] args) {
        Integer[] arr = {5,4,1,3,2};
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
