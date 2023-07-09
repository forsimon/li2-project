package Practice;

/**
 * @author li
 * @description
 */
public class FuziTest {
    public static void main(String[] args) {
        Fu f=new Zi();
        System.out.println(f.num);
        f.test();

        Zi z=(Zi)f;
        z.show();
    }
}
