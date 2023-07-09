package homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author li
 * @description
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("s");
        al.add(".");
        al.add("c");
        al.add("o");
        al.add("u");
        al.add("p");
        al.add("s");

        //迭代器
        Iterator<String> it=al.iterator();
        while (it.hasNext()){
            String n = it.next();
            System.out.println(n);
        }
        System.out.println("******************************************");
        //for-each
        for (String s : al) {
            System.out.println(s);
        }
        System.out.println("******************************************");
        //索引
        Object[] array = al.toArray();
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
