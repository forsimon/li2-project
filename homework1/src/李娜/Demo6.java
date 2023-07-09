import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请存入一定金额（1000起存）:");
        double money = sc.nextDouble();
        System.out.println("存入年限（1年、2年、3年、5年）:");
        int year = sc.nextInt();
        double sum;
        switch (year) {
            case 1:
                sum = money + money * year * 0.0225;
                System.out.println("本息：" + sum);
                break;
            case 2:
                sum = money + money * year * 0.027;
                System.out.println("本息：" + sum);
                break;
            case 3:
                sum = money + money * year * 0.0325;
                System.out.println("本息：" + sum);
                break;
            case 5:
                sum = money + money * year * 0.036;
                System.out.println("本息：" + sum);
                break;
            default:
                System.out.println("输入年限错误！");

        }
    }
}
