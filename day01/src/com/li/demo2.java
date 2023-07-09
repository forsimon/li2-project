package com.li;

public class demo2 {
    public static void main(String[] args) {
        //语法规则：不能数字开头，不能是关键字

       double x=100;
        //自动将int转换成double
        System.out.println(x);

        double m=2.5;
        int n=(int)m;
        //损失精度
        System.out.println(n);

        //byte,short,char 参与运算会自动提升为int类型





    }
}
