package practise;

/**
 * @author li
 * @description
 */
public class Demo1 {
    public static void main(String[] args) {
        double h=100;
        double s=100;
        h=h/2;
        for (int i = 2; i <=10; i++) {
          s=s+h*2;
          h/=2;
        }
        s=s+h;
        System.out.println(h);
        System.out.println(s);

    }
}
