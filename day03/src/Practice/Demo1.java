package Practice;

/**
 * @author li
 * @description
 */
public class Demo1 {
    public static void main(String[] args) {
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃🍎");
            }
        });

        useEatable(()-> System.out.println("吃🍊"));
    }

    private static void useEatable(Eatable e){
        e.eat();
    }
}
