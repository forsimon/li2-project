package homework;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author li
 * @description
 */
public class demo4 {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>(/*(s1, s2) -> {
            int num=s1.getAge()-s2.getAge();
            if (num==0){
                s1.getName().compareTo(s2.getName());
            }
            return num;
        }*/);
        Student s1=new Student("S.coups",23);
        Student s2=new Student("Evan",22);
        Student s3=new Student("S.coups",23);
        Student s4=new Student("Ian",20);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
    }
}
