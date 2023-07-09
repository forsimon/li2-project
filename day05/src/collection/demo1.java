package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author li
 * @description
 */
public class demo1 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");

        //迭代器
        Iterator<String> it = list.iterator();
        //是否有元素
        while (it.hasNext()) {
            //获取
            String next = it.next();
            System.out.println(next);
        }
        //foreach循环  map不行
        for (String s:list){
            System.out.println(s);
        }

    }
}
