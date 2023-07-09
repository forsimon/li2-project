import java.util.Scanner;

/**
 * @author li
 * @description
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入斐波那契数列的项数：");
        int n = sc.nextInt();
        int[] arrf=new int[n];
        for (int i = 2; i <n ; i++) {
            arrf[0]=1;
            arrf[1]=1;
            arrf[i]=arrf[i-1]+arrf[i-2];
        }
        if(n==1||n==2){
            System.out.println(1);
        }else {
            System.out.println(arrf[n-1]);
        }


    }
}
