package homework;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class demo6 {
    public static void main(String[] args) {
        System.out.println("请输入文本：");
        Scanner sc=new Scanner(System.in);
        String line = sc.nextLine();

        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i = 0; i <line.length() ; i++) {
            char c = line.charAt(i);
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else {
                hm.put(c,1);
            }
        }
        hm.forEach((k,v)-> System.out.println(k+"出现的次数是："+v));
    }
}
