import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个摄氏温度：");
        double s = sc.nextDouble();
        //摄氏温度转换为华氏温度
        double ss=s*1.8+32;
        System.out.println("其华氏温度为："+ss);

        System.out.println("请输入一个华氏温度：");
        double h = sc.nextDouble();
        //华氏温度转换为摄氏温度
        double hh=(h-32)/1.8;
        System.out.println("其摄氏温度为："+hh);

    }
}
