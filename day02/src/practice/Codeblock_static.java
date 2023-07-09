package practice;

/**
 * @author li
 * @description
 */
public class Codeblock_static {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        Student1 s2=new Student1(10);
    }
}
class Student1{
    static {
        System.out.println("静态代码块，执行");
    }
    public Student1(){
        System.out.println("空参数构造方法");
    }
    public Student1(int a){
        System.out.println("带参数构造方法");
    }
}
