package dakao;

import java.util.*;

/**
 * @author li
 * @description
 */
public class Demo3 {
    public static void main(String[] args) {
        Set<String> ss=new HashSet<>();
        //录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串：");
        while (true){
            String s=sc.nextLine();
            //判断录入值是否为end
            if(s.equals("end")){
                break;
            }else {
                ss.add(s);
            }
        }
        System.out.println(ss);
        Iterator<String> it= ss.iterator();
        Map<String,Integer> hm=new HashMap<>();
        for (int i = 0; i <ss.size() ; i++) {
            String sh=it.next();
            hm.put(sh,sh.length());
        }
        hm.forEach((k,v)->{
            System.out.println(k+":"+v);
        });

    }
}
