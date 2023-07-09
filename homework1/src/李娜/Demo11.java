/**
 * @author li
 * @description
 */
public class Demo11 {
    public static void main(String[] args) {
        //1543个核桃
        int ht=1543;
        //计数器
        int count=0;
        while (ht>0){
            if(ht%2==0){
                ht /=2;
            }else {
                ht-=1;
                count++;
                ht /=2;
            }
        }
        System.out.println(count);
    }
}
