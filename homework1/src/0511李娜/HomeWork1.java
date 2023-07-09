import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入查找元素：");
        int s = sc.nextInt();
        int result = Chazhao(s);
        System.out.println(result);

    }
    public static int Chazhao(int s){
        int[] arr={1, 3, 5, 4, 2, 3, 7};
        //找到的索引
        int index=-1;
        for (int i = 0; i <arr.length ; i++) {
            //判断是否找到
            if (s==arr[i]){
                index=i;
                break;
            }
        }
        return index;
    }
}
