package practice;

/**
 * @author li
 * @description
 */
public class Chongxie {
    public static void main(String[] args) {
        Zi2 z=new Zi2();
        z.method();
    }
}
class Fu2{
    private void show(){
        System.out.println("Fu2中show()方法被调用");
    }
    void method(){
        System.out.println("Fu2中method()方法被调用");
    }
}
class Zi2 extends Fu2{
  /*
    编译出错，子类不能重写父类私有的方法
    @Override
    private void show(){
        System.out.println("Zi中show()方法被调用");
    }*/


/*
    编译出错，子类重写父类方法时，访问权限需要大于等于父类
    @Override
    private void method(){
      System.out.println("Zi中show()方法被调用");
  }*/



    @Override
    public void method(){
        System.out.println("Zi中show()方法被调用");
    }
}
