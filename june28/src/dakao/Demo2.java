package dakao;

import java.util.Arrays;
import java.util.Random;

/**
 * @author li
 * @description
 */
public class Demo2 {
    public static void main(String[] args) {

        int[] arr=new int[10];
        Random r=new Random();
        for (int i = 0; i <10 ; i++) {
            arr[i] = r.nextInt(100)+1;
        }
        System.out.println("挪动前:");
        System.out.println(Arrays.toString(arr));
        System.out.println("挪动后:");
        //定义最值
        int max=arr[0];
        int min=arr[0];
        //记录最值位置
        int maxindex=0;
        int minindex=0;
        for (int i = 0; i <arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
                maxindex=i;
            }
            if (min>arr[i]){
                min=arr[i];
                minindex=i;
            }
        }
        //交换最大数与末位
        int tmax=arr[maxindex];
        arr[maxindex]=arr[arr.length-1];
        arr[arr.length-1]=tmax;
        //交换最小数与开始
        int tmin=arr[minindex];
        arr[minindex]=arr[0];
        arr[0]=tmin;
        System.out.println(Arrays.toString(arr));
    }
}
