/**
 * @author li
 * @description
 */
public class Demo4 {
    public static void main(String[] args) {
        double yu=24;
        double yul=16;
        double hs=8;
        double rice=3;
        double sum1,sum2;
        //优惠价格
        if((yu+hs+rice)>=30){
            sum1=(yu+hs+rice)*0.8;
        }else {
            sum1=yu+hs+rice;
        }
        //折扣
        sum2=yul+hs+rice;
        //比较价格
       double sum = sum1<sum2? sum1:sum2;
        System.out.println("最少花："+sum);
    }
}
