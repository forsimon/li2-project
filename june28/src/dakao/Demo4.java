package dakao;

/**
 * @author li
 * @description
 */
public class Demo4 {
    public static void main(String[] args) {
        Quqian qu=new Quqian();
        Thread t1=new Thread(qu,"A");
        Thread t2=new Thread(qu,"B");
        t1.start();
        t2.start();
    }
}
class Quqian implements Runnable{
     int money=1000;
    @Override
    public void run() {
        while (money > 0) {

            synchronized (Quqian.class){
                if(money<=0){
                    break;
                }
                money -=100;
                System.out.println(Thread.currentThread().getName()+"取款,还剩"+money);

            }
        }
    }
}