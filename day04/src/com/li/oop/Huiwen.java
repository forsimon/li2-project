package com.li.oop;

/**
 * @author li
 * @description
 */
public class Huiwen {
    public static void main(String[] args) {
        String s="上海自来水来自海上";
        System.out.println(isHuiwen(s));
    }

    public static boolean isHuiwen(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
