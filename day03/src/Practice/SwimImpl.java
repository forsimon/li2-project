package Practice;

/**
 * @author li
 * @description
 */
public class SwimImpl{
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("姐妹来玩水");
            }
        });

        goSwimming(()->{
            System.out.println("姐妹来喝水");
        });

    }

    public static void goSwimming(Swimming swimming){
        swimming.swim();
    }

}
