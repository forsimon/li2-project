import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Demo7 {
    public static void main(String[] args) {
        //前面有n个人
        Scanner sc=new Scanner(System.in);
        System.out.println("输入前排人数：");
        int n = sc.nextInt();
        //电梯上下次数
        int count=n/12;
        int time=count*4+2;
        System.out.println("需要时间"+time+"分钟");

    }
}
