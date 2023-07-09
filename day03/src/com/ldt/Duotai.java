package com.ldt;

/**
 * @author li
 * @description
 */
public class Duotai {
    public static void main(String[] args) {
        Fu f=new Zi();
        Zi z=(Zi) f;
        System.out.println(f.num);
        System.out.println(z.num);
        f.method();
        ((Zi) f).show();

    }
}
class Fu{
    int num=10;
    public void method(){
        System.out.println("Fu...method");
    }
}
class Zi extends Fu{
    int num=20;

    @Override
    public void method() {
        System.out.println("Zi...method");
    }
    public void show(){
        System.out.println("show");
    }
}
