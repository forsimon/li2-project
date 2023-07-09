package com.ldt;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author li
 * @description
 */
public class Lamdademo {
    public static void main(String[] args) {
        String[] arr=new String[]{"Tom","Lily","Jerry","S.coups","Lucy","John"};
    /*    Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num=o1.length() - o2.length();
                if(num==0){
                    num=o1.compareTo(o2);
                }
                return num;
            }
        });*/
        Arrays.sort(arr,(s1,s2)->s1.length()-s2.length());

        String s=Arrays.toString(arr);
        System.out.println(s);
    }
}
