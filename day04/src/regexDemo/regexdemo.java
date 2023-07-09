package regexDemo;

import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class regexdemo {
    public static void main(String[] args) {
        //手机调用
        Scanner sc=new Scanner(System.in);

        String regex="1[3|5-9]\\d{9}";
        for (int i = 0; i <11 ; i++) {
            System.out.println("输入手机号：");
            String s = sc.nextLine();
            //校验
            System.out.println(s.matches(regex));

        }


    }
}
