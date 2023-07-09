package com.lii;

/**
 * @author li
 * @description
 */
public class qiuMax {
    public static void main(String[] args) {
        int[] arr={23,13,44,2,76,4,5,90,2};
        int max=fMax(arr);
        System.out.println(max);

    }

    public static int fMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
