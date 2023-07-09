package practice;

/**
 * @author li
 * @description
 */
public class Muli_jicheng {
    public static void main(String[] args) {
        Son son=new Son();
        System.out.print("son的");
        son.drink();
        System.out.print("tom的");
        son.smoke();
    }
}
class Granddad{
    public void drink(){
        System.out.println("爷爷爱喝酒");
    }
}
class Father extends Granddad{
    public void smoke(){
        System.out.println("爸爸爱抽烟");
    }
}
class  Mother{
    public void dance(){
        System.out.println("妈妈爱跳舞");
    }
}
class Son extends Father{

}
