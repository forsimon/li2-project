/**
 * @author li
 * @description
 */
public class Demo9 {
    public static void main(String[] args) {
        for (int i = 2; i <=100; i++) {
            //除数
            int d=2;
            while (d*d<i){
                if(i%d==0){
                    break;
                }
                d++;
            }
            if(d*d>i){
                System.out.println(i);
            }


    }
    }
}
