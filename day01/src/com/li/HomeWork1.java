package com.li;

public class HomeWork1 {
    public static void main(String[] args) {
        int j=0;
        int sum=0;
        for(int i=1;i<=100;i++){

            if(i%2==0){
                sum=j+i;
                j=sum;
            }
        }
        System.out.println(sum);

    }
}
