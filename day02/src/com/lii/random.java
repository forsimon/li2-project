package com.lii;

import java.util.Random;

/**
 * @author li
 * @description
 */
public class random {
    public static void main(String[] args) {
        int suiji=random();
        System.out.println(suiji);
    }
    public static int random(){
        Random random=new Random();
        int suiji=random.nextInt(100)+1;
        return suiji;
    }
}
