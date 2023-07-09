package com.lii;

/**
 * @author li
 * @description
 */
public class demo1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        printArr(arr);
    }
    public static void printArr(int[] arr){
        //打印“[”
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
            //中间格式
            if (i !=arr.length-1){
                System.out.print(", ");
            }
        }
        //打印"]"
        System.out.print("]");

    }
}
