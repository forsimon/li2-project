package com.li;

public class HomeWork6 {
    public static void main(String[] args) {
        int sum=1543;
        int count=0;
        while (sum>0){

            if(sum%2!=0){
                sum--;
                count++;
                sum/=2;
            }else{
                sum/=2;
            }
        }
        System.out.println(count);
    }
}
