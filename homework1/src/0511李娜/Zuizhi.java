/**
 * @author li
 * @description
 */
public class Zuizhi {
    public static void main(String[] args) {
        int[] arr={2,456,1,6,8,4,3,75};
        int max = getMax(arr);
        int mix = getMix(arr);
        System.out.println("最大值："+max);
        System.out.println("最小值："+mix);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getMix(int[] arr){
        int mix=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(mix>arr[i]){
                mix=arr[i];
            }
        }
        return mix;
    }
}
