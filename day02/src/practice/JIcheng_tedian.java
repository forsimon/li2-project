package practice;

/**
 * @author li
 * @description
 */
public class JIcheng_tedian {
    public static void main(String[] args) {
        Zi1 z=new Zi1();
        z.show();
    }
}
class Fu1{
    int num=10;
}
class Zi1 extends Fu1{
    int num=20;
    public  void show(){
        int num=30;
        System.out.println(super.num);
    }
}
