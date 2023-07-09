package practise;

import java.util.LinkedList;

import static java.lang.Thread.currentThread;

/**
 * @author li
 * @description
 */
public class Demo8 {
    public static void main(String[] args) {
        ThreadDemo td=new ThreadDemo();
        Thread t1=new Thread(td,"线程A");
        Thread t2=new Thread(td,"线程B");
        Thread t3=new Thread(td,"线程C");

        t1.start();
        t2.start();
        t3.start();

    }

}
class ThreadDemo implements Runnable{
    int count=0;
@Override
    public void run(){

        while (true){

            synchronized (ThreadDemo.class){

                LinkedList<String> list = new LinkedList<>();
                list.add("及时雨宋江");
                list.add("玉麒麟卢俊义");
                list.add("智多星吴用");
                list.add("入云龙公孙胜");
                list.add("大刀关胜");
                list.add("豹子头林冲");
                list.add("霹雳火秦明");
                list.add("双鞭呼延灼");
                list.add("小李广花荣");
                list.add("小旋风柴进");
                list.add("扑天雕李应");
                list.add("美髯公朱仝");
                list.add("花和尚鲁智深");
                list.add("行者武松");
                if (count==list.size()){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"获得英雄："+list.get(count));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;

            }
        }


    }

}
