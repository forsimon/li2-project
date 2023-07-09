package com.ldt;

import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Prime {
    public static void main(String[] args) {
        System.out.println("输入整数：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Prime p=new Prime();

        System.out.println(p.isPrime(num));
        return;
    }

    public  boolean isPrime(int num){
        int pn=(int)Math.sqrt(num);
        int chu=2;
        while (chu<=pn){
            if (num%chu ==0){
                return false;
            }
            chu++;
        }
        return true;
    }
}
