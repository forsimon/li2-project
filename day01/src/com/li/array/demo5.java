package com.li.array;

import java.util.Random;

public class demo5 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[5];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(100)+1;
            System.out.print(arr[i]+"\t");
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);

    }
}
