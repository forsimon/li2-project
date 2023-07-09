package com.lii;

/**
 * @author li
 * @description
 */
public class feibonacci {
    public static void main(String[] args) {
        System.out.println(fi(1));
        System.out.println(fc(1));
    }
    public static int fc(int n){
        if(n==1||n==2){
            return 1;
        }
        int last=1;
        int nextlast=1;
        int sum=0;
        for (int i = 2; i < n; i++) {
            sum=nextlast+last;
            nextlast=last;
            last=sum;
        }
        return sum;
    }
    public static int fi(int n){
        int[] arr = new int[n];
        for (int i = 2; i < arr.length; i++) {
            arr[0] = 1;
            arr[1] = 1;
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        if(n==1||n==2){
            return 1;
        }else {
            return arr[n - 1];
        }


    }


}
