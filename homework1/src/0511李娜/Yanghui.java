import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Yanghui {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入杨辉三角的行数：");
        int n = sc.nextInt();
        if(n<=0){
            return;
        }
        //定义杨辉三角数组
        int[][] arr=new int[n][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
            for (int j = 0; j <arr[i].length; j++) {
                if(j==0||j==i){
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
