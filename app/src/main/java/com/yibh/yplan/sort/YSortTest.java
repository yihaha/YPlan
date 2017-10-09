package com.yibh.yplan.sort;

import android.util.Log;

import com.elvishew.xlog.XLog;

import java.util.Arrays;

/**
 * Created by Test on 2017/10/9.
 */

public class YSortTest {

    public static void main(String[] strings) {
        int[] a = {1, 10, -10, 12, 7, 9, -3};
//        insertionSort(a);
        seclectionSort(a);
    }


    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
//                Log.w("插入排序 ", Arrays.toString(arr));
                    System.out.println("插入排序:  " + Arrays.toString(arr));
                }
            }
        }
    }

    public static void seclectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            System.out.println("简单选择排序:  " + Arrays.toString(arr));

        }
    }

}
