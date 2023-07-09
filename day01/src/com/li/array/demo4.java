package com.li.array;

public class demo4 {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={32,4,12,44,56,65,4,3,80,59};
        int max=arr[0];
        int index=-1;
        int num=4;
        //数组求和
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        //数组寻找最大值
        for (int j = 1; j < arr.length; j++) {
            if(max<arr[j]){
                max=arr[j];
            }
        }
        //数组查找
        for (int z = 0; z < arr.length; z++) {
            if(num==arr[z]){
                index=z;
                break;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        if (index==-1){
            System.out.println("不存在");
        }else {
            System.out.println("已经找到，索引是"+index);
        }


        //数组反转
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}
