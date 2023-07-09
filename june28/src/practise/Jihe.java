package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Jihe {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student s1=new Student("2023050501","Tom",20);
        Student s2=new Student("2023050502","Jerry",19);
        Student s3=new Student("2023050503","Jack",21);
        Student s4=new Student("2023050504","Rose",18);
        Student s5=new Student("2023050505","John",20);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for (int i = 0; i <list.size() ; i++) {
            Student ss=list.get(i);
            String sid=ss.getId();
            if (s.equals(sid)){
                System.out.println(ss.getId()+ss.getName()+ss.getAge());
            }
        }


    }
}
