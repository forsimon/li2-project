package com.digui;

import java.util.Arrays;

/**
 * @author li
 * @description
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[]{2,6,7,1,4,6,8};
        Quiksort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Quiksort(int[] arr){
        Quick(arr, 0,arr.length-1);
    }
    private static void Quick(int[] arr, int start, int end){
        if(arr==null||arr.length==0){
            return;
        }
        if (start<end){
            int i=start;
            int j=end;
            int pivot=arr[i];
            while (i<j){
                //在右边找小于基准点的数
               while (arr[j]>=pivot && i<j){
                   j--;
               }
               if(i<j){
                   arr[i]=arr[j];
                   i++;
               }
                //在左边找大于基准点的数
                while (arr[i]<=pivot && i<j){
                    i++;
                }
                if(i<j){
                    arr[j]=arr[i];
                    j--;
                }
            }
            arr[i]=pivot;
            Quick(arr, start,i-1);
            Quick(arr, i+1,end);
        }


    }
}
