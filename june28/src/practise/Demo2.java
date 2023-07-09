package practise;

/**
 * @author li
 * @description
 */
public class Demo2 {
    public static void main(String[] args) {
        double[] score = {77.1, 88.1, 76.1, 56.1, 87.1, 98.1, 55.1, 94.1, 39.1, 96.1};
        double sum=0;
        double max=0;
        double min=score[0];
        for (int i = 0; i <10 ; i++) {
            sum+=score[i];
            if(max<score[i]){
                max=score[i];
            }
            if(min>score[i]){
                min=score[i];
            }
        }
        double aver=sum/2;
        System.out.println(max);
        System.out.println(min);
        System.out.println(aver);

    }
}
