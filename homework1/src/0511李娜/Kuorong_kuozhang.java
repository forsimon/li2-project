/**
 * @author li
 * @description
 */
public class Kuorong_kuozhang {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        //定义新数组
        int[] newArr=new int[arr.length+1];
        //增加元素
        int a=2;

        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (a > arr[i]) {
                newArr[i] = arr[i];
                index++;
            } else {
                newArr[i + 1] = arr[i];
            }

        }
        newArr[index]=a;
        System.out.print("[");
        for (int i = 0; i <newArr.length; i++) {
            if (i<newArr.length-1){
                System.out.print(newArr[i]+",  ");
            }
        }
        System.out.print(newArr[arr.length]+"]");

    }
}
