/**
 * @author li
 * @description
 */
public class Demo8 {
    public static void main(String[] args) {
        //每周存入钱数
        int weekmoney=0;
        //总钱数
        int sum=0;
        for (int i = 1; i <=52; i++) {
            weekmoney+=10;
            sum+=weekmoney;
        }
        System.out.println("一年后存钱罐有"+sum+"元");
    }
}
