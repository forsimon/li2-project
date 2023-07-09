package practise;

import java.util.Arrays;

/**
 * @author li
 * @description
 */
public class Demo3 {
    public static void main(String[] args) {
        int[] arra={11,33,55,77};
        int[] arrb={22,44,66,88};
        int[] arr=new int[arra.length+arrb.length];
        for (int i = 0; i <arr.length ; i++) {
            if(i<=arra.length-1){
                arr[i]=arra[i];
            }else {
                arr[i]=arrb[i-arra.length];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
