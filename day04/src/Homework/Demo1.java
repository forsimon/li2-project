package Homework;

/**
 * @author li
 * @description
 */
public class Demo1 {
    public static void main(String[] args) {
        String s="skjxcsddfgh";
        zuiLong(s);

    }

    public static void zuiLong(String s){
        char[] ss=s.toCharArray();
        int first=0;
        int last=1;

        while (last!=s.length()-1) {
            if(ss[last-1]!=ss[last]){
              last++;
            }else {
                first++;
                last=first+1;
            }

        }
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(ss,first,last-1);

        System.out.println(stringBuilder.toString());


    }
}
