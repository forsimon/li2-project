/**
 * @author li
 * @description
 */
public class Array2 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{2,4,5}};
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
