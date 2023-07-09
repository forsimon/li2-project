import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class HomeWork2 {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 4, 2, 3, 7};
        copy(arr,3,3);
    }

    public static void copy(int[] arr, int fromIndex,int len){
        int [] newArr=new  int[len];
        for (int i = 0; i <len ; i++) {
            newArr[i]=arr[fromIndex];
            fromIndex++;
        }
        System.out.print("[");
        for (int i = 0; i <len ; i++) {

            if(i<len-1){
                System.out.print(newArr[i]+", ");
            }
        }
        System.out.print(newArr[len-1]);
        System.out.print("]");
    }
}
