package com.digui;

/**
 * @author li
 * @description
 */
public class Digui {
    public static void main(String[] args) {

        System.out.println(digui(20));
    }

    public static int digui(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return digui(n-1)+digui(n-2);
    }

}
