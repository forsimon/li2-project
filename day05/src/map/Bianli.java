package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author li
 * @description
 */
public class Bianli {
    public static void main(String[] args) {
        TreeMap<String,String>  tm=new TreeMap<>();
        tm.put("11","22");
        tm.put("33","44");
        tm.put("55","66");
         //先获取所有的键
        Set<String> ketSet=tm.keySet();
        for (String key : ketSet) {
            //通过键获取值
            String value=tm.get(key);
            System.out.println(key+":"+value);
        }

        //得到所有Entry对象
        Set<Map.Entry<String,String>> entrySet=tm.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            //通过Entry对象获得键
            String key=entry.getKey();
            //通过Entry对象获得值
            String value=entry.getValue();
            System.out.println(key+":"+value);
        }

        //map集合的foreach方法
        tm.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
