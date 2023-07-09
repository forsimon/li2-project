package exception;

import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class demo {
    public static void main(String[] args) {
        System.out.println("请输入姓名：");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Student s=new Student();
        s.setName(name);

        while (true){
            System.out.println("请输入年龄：");
            String agestr=sc.nextLine();

            try {
                int age=Integer.parseInt(agestr);
                s.setAge(age);
                break;
            }catch (NumberFormatException e) {
                System.out.println("请输入整数");
                continue;
            }catch (AgeOutOfBoundsException e){
                throw new AgeOutOfBoundsException();
               /* System.out.println("请输入18-35");
                continue;*/
            }

        }
        System.out.println(s);


    }
}
