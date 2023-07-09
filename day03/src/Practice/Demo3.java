package Practice;

/**
 * @author li
 * @description
 */
public class Demo3 {
    public static void main(String[] args) {
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {

                return x+y;
            }
        });

        useAddable((x,y)->x+y);
    }

    private static void useAddable(Addable a){
        int sum=a.add(11,29);
        System.out.println(sum);
    }
}
