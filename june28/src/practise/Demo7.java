package practise;

import java.security.Key;
import java.util.*;
/**
 * @author li
 * @description
 */
public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Tom", "80", "Jerry", "85", "Jack", "82", "Rose", "90", "John", "88", "Tony", "77");
        Putmap(list);
    }
    public static void Putmap(ArrayList<String> list){
        Map<String,String> map= new TreeMap<>((o1, o2) -> o1.compareTo(o2));
        for (int i = 0; i < list.size(); i++) {
           map.put(list.get(i),list.get(i+1));
           i++;
        }
        map.forEach((key,value)->{
            System.out.println(key+":"+value);
        });
    }
}
