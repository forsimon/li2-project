package homework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author li
 * @description
 */
public class demo5 {
    public static void main(String[] args) {
        TreeMap<String,String> map=new TreeMap<>();
        map.put("S.coups","cherry");
        map.put("Simon","jun");
        map.put("Ian","popo");
        map.put("Evan","mm");

        map.forEach((k,v)-> System.out.println(k+"("+v+")"));

        //获取所有key
        Set<String> keys=map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+"("+value+")");

        }

        //获得所有键值对
        Set<Map.Entry<String,String>> sme=map.entrySet();
        for (Map.Entry<String, String> entry : sme) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"("+value+")");
        }
    }
}
