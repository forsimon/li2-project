package practise;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author li
 * @description
 */
public class Demo5 {
    private int count=0;
    public static void main(String[] args) {
        String a="白居易在《大林寺桃花》中说：人间四月芳菲尽，山寺桃花始盛开；崔护在《题都城南庄》中说：人面不知何处去，桃花依旧笑春风；王维在《桃源行》中说：渔舟逐水爱山春，两岸桃花夹古津...春来遍是桃花水，不辨仙源何处寻；唐寅在《桃花庵歌》中也描述：桃花坞里桃花庵，桃花庵里桃花仙。桃花仙人种桃树，又摘桃花换酒钱...";
        String b="桃花";
       /* System.out.println(Th(a,b));*/
        Demo5 d5=new Demo5();
       /* d5.Thdigui(a,b);
        System.out.println(d5.count);*/

        System.out.println(d5.Thdigui1(a,b));

    }
    public static int Th(String a,String b){
        Pattern p=Pattern.compile(b);
        Matcher m=p.matcher(a);
        int count=0;
        while (m.find()){
            count++;
        }
        return count;
    }
    public  void Thdigui(String a,String b){
        int index=a.indexOf(b);
        if (index!=-1){
            count++;
            if (index<a.length()-1){
                a=a.substring(index+1);
                Thdigui(a,b);
            }
        }

    }
    public  int Thdigui1(String a,String b){
        int first=a.indexOf(b);
        int end=a.lastIndexOf(b);
        if (first!=-1){
            count++;
            if (first == end) {
                return 1;
            }
            else {
                a=a.substring(first,end);
                String[] s=a.split(b);
                for (int i = 0; i <s.length ; i++) {
                    System.out.print(s[i]+"\t");
                }

                return s.length;
            }
        }else {
            return 0;
        }

    }
}
