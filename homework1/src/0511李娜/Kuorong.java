/**
 * @author li
 * @description
 */
public class Kuorong {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        //定义新数组
        int[] newArr=new int[arr.length+1];
        //增加元素
        int a=6;
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            newArr[i]=arr[i];
            System.out.print(newArr[i]+",  ");
        }
        newArr[arr.length]=a;
        System.out.print(newArr[arr.length]+"]");

    }
}
