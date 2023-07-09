/**
 * @author li
 * @description
 */
public class Fanzhuan {
    public static void main(String[] args) {
        int[] arr={23,245,4,5,7,4,3,24,56};
        //指向第一个
        int first=0;
        //指向倒数第一个
        int last=arr.length-1;
        while (first<last){
            int t=arr[first];
            arr[first]=arr[last];
            arr[last]=t;
            first++;
            last--;
        }
        System.out.print("[");
        for (int i = 0; i <arr.length ; i++) {
            if(i<arr.length-1){
                System.out.print(arr[i]+",  ");
            }
        }
        System.out.print(arr[arr.length-1]+"]");
    }

}
