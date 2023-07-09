package com.lii;

import java.util.concurrent.ForkJoinPool;

/**
 * @author li
 * @description
 */
public class Print99 {
    public static void main(String[] args) {
        print99();
    }

    public static void print99(){
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
