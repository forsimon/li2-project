package practice;

/**
 * @author li
 * @description
 */
public class Jicheng {

    public static void main(String[] args) {
        //创建对象，调用方法
        Fu f =new Fu();
        f.show();

        Zi z=new Zi();
        z.method();
        z.show();
    }
}
 class Fu {
     public void show() {
         System.out.println("show方法被调用");
     }
 }
class Zi extends Fu{
    public void method(){
        System.out.println("method方法被调用");
    }
}
