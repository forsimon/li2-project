package com.li;

public class HomeWork3 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++){
            if(i%7!=0&&i%10!=7&&i/10!=7){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
