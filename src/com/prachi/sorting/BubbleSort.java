package com.prachi.sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        for (int turn = 0; turn < arr.length-1; turn++) {
            int swap = 0;
            for (int i = 0; i < arr.length-1-turn; i++) {
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
