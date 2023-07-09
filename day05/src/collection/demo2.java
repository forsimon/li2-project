package collection;

import java.util.LinkedList;

/**
 * @author li
 * @description
 */
public class demo2 {
    public static void main(String[] args) {

        LinkedList<Integer> ll=new LinkedList<>();

        for (int i = 1; i <=108 ; i++) {
            ll.add(i);
        }

        while (ll.size()>1){
            //删除第一张
            ll.removeFirst();
            //将第一张放到最下面
            ll.addLast(ll.removeFirst());

        }

        System.out.println(ll.getFirst());
    }
}
