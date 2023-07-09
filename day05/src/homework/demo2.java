package homework;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author li
 * @description
 */
public class demo2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        for (int i = 1; i <=108; i++) {
            ll.add(i);
        }
        while (ll.size()>1){
            ll.removeFirst();
            ll.addLast(ll.removeFirst());
        }
        System.out.println(ll.getFirst());
        System.out.println(isDuiChen("..(....{...)......}"));
        System.out.println(isDuiChen("..(....{..}.)..[....]"));


        System.out.println(isKuoHao("..(....{...)......}"));
        System.out.println(isKuoHao("..(....{..}.)..[....]"));


    }
    public static boolean isDuiChen(String s){
        Stack<Character> ss=new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                ss.push(')');
            }
            if(c=='['){
                ss.push(']');
            }
            if(c=='{'){
                ss.push('}');
            }
            if(c==')'||c==']'||c=='}'){
                if (ss.isEmpty()){
                    return false;
                }
                if(c!=ss.pop()){
                    return false;
                }
            }


        }
        return ss.isEmpty();
    }

    public static boolean isKuoHao(String s){
        LinkedList<Character> ss=new LinkedList<>();
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                ss.add(')');
            }
            if(c=='['){
                ss.add(']');
            }
            if(c=='{'){
                ss.add('}');
            }
            if(c==')'||c==']'||c=='}'){
                if (ss.isEmpty()){
                    return false;
                }
                if(c!=ss.removeLast()){
                    return false;
                }
            }


        }
        return ss.isEmpty();
    }
}
