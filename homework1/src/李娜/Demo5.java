import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        //判断闰年
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
    }
}
