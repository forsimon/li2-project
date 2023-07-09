package homework;

import java.util.HashSet;

/**
 * @author li
 * @description
 */
public class demo3 {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<>();
        Student s1=new Student("S.coups",23);
        Student s2=new Student("Evan",22);
        Student s3=new Student("S.coups",23);
        Student s4=new Student("Ian",20);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        System.out.println(hs);

    }
}
