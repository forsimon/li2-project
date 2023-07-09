import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数的正整数：");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        //每位的数字
        int bai=num/100%10;
        int shi=num/10%10;
        int ge=num%10;
        System.out.println(bai+shi+ge);
    }
}
