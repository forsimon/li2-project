package oop;

/**
 * @author li
 * @description
 */
public class Phone {
   String brand;
   int price;

   public void call(String name){
       System.out.println("给"+name+"打电话");
   }

   public void sendMessage(){
       System.out.println("群发短信");
   }
}
