package com.digui;

import java.util.Arrays;

/**
 * @author li
 * @description
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr=new int[]{2,3,6,8,23,2,4,1,5,3,2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr){
        int[] temparr=new int[arr.length];
        mergeSort(arr,temparr,0,arr.length-1);

    }
    private static void mergeSort(int[] arr, int[] temparr, int start, int end){
        if (arr==null||arr.length==0){
            return;
        }

        //出口
        if(start<end){
            int mid=(start+end)/2;
            //拆分
            mergeSort(arr,temparr,start,mid);
            mergeSort(arr,temparr,mid+1,end);
            //合并
            int leftPos=start;
            int leftend=mid;
            int rightPos=mid+1;
            int rightend=end;
            //本次合并个数
            int nums=end-start+1;
            //临时数组起始位置
            int temppos=start;

            while (leftPos<=leftend && rightPos<=rightend){
                if(arr[leftPos]<=arr[rightPos]){
                    temparr[temppos++]=arr[leftPos++];
                }else {
                    temparr[temppos++]=arr[rightPos++];
                }
            }
                while (leftPos<=leftend){
                    temparr[temppos++]=arr[leftPos++];
                }
                while (rightPos<=rightend){
                    temparr[temppos++]=arr[rightPos++];
                }


            for (int i = 0; i < nums; i++,rightend--) {
                arr[rightend]=temparr[rightend];
            }

        }
    }

}
