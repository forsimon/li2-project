package oop;

/**
 * @author li
 * @description
 */
public class Teatphone {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.brand="apple";
        p.price=10000;
        System.out.println(p.brand+":"+p.price);
        p.call("S.coups");
        p.sendMessage();
    }
}
