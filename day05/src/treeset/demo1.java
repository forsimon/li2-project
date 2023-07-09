package treeset;

import java.util.TreeSet;

/**
 * @author li
 * @description
 */
public class demo1 {
    public static void main(String[] args) {

        TreeSet<Student> s=new TreeSet<>();

        Student s1=new Student("wewoef",21);
        Student s2=new Student("wew",24);
        Student s3=new Student("wewo",21);
        Student s4=new Student("wewoef",21);

        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);


        System.out.println(s);
    }
}
