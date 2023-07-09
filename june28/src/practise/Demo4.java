package practise;

/**
 * @author li
 * @description
 */
public class Demo4 {
    public static void main(String[] args) {
        int sum=0;
        sum+=Chi(1);
        System.out.println(sum);

    }
    public static int Chi(int n){

        if(n==10){
            return 1;
        }else {
            return 2*Chi(n+1)+2;
        }



    }
}
