package Practice;

/**
 * @author li
 * @description
 */
public class Demo2 {
    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
            }
        });

        useFlyable(s-> System.out.println(s+",便利店薯片半价了"));
    }

    private static void useFlyable(Flyable f){
        f.fly("今天的风儿甚是喧嚣");
    }
}
