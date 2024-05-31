package com.lpy;

import java.util.Arrays;

/**
 * 基础排序
 */
public class BasicSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 7, 6, 9, 8, 4, 0};
        int[] arr2 = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println("原始数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        selectSort(arr);
        System.out.println();
        System.out.println("============");
        System.out.println("我的排序：");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("============");
        System.out.println("标准排序：");
        Arrays.sort(arr2);
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }
    }

    /**
     * 选择
     * 依次从 0 往后做比较，最小的与 0 及其后面的位置做交换
     * 时间复杂度 O(N²)
     */
    private static void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("请输入有效的数据...");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swapData(arr, i, minIndex);
        }
    }

    /**
     * 这种交换方式的前提是两个交换的位置不能相同，否则就都会变成 0
     *
     * @param arr
     * @param i
     * @param minIndex
     */
    private static void swapData(int[] arr, int i, int minIndex) {
        if (i == minIndex) return;
        arr[i] = arr[i] ^ arr[minIndex];
        arr[minIndex] = arr[i] ^ arr[minIndex];
        arr[i] = arr[i] ^ arr[minIndex];
    }

    /**
     * 冒泡
     */

    /**
     * 插入
     */

    /**
     * 对数器
     */

}
