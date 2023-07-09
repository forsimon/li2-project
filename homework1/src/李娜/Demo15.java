/**
 * @author li
 * @description
 */
public class Demo15 {
    public static void main(String[] args) {

        //灌水量
        int sum=0;
        //灌水速度
        int s=1;
        //时间
        int count=0;
        while (sum<=10){
            s +=1;
            sum+=s;
            sum-=3;
            if(sum<0){
                sum=0;
            }
            count++;
        }
        System.out.println(count);

    }
}
