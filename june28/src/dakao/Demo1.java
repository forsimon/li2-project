package dakao;

import sun.text.resources.cldr.ii.FormatData_ii;

import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入行号：");
        int s=sc.nextInt();
        for (int i = 0; i <s ; i++) {
            //输入为奇数
            if(s%2!=0){
                if(i<=s/2){
                    for (int j = 0; j < s/2-i; j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j <i*2+1 ; j++) {

                        System.out.print(" "+"*"+" ");
                    }
                }else {
                    for (int j = 0; j < i-s/2; j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j < s-(i-s/2)*2; j++) {
                        System.out.print(" "+"*"+" ");
                    }
                }
                System.out.println();
            }
            //输入为偶数
            else{
                if(i<s/2){
                    for (int j = 0; j < s/2-i; j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j <i*2+1 ; j++) {

                        System.out.print(" "+"*"+" ");
                    }
                }
                else {
                    for (int j = 0; j < i-s/2+1; j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j < s-(i-s/2)*2-1; j++) {
                        System.out.print(" "+"*"+" ");
                    }
                }
                System.out.println();
            }


        }
    }
}
