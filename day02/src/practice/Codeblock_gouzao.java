package practice;

/**
 * @author li
 * @description
 */
public class Codeblock_gouzao {
    /*
       构造代码块:
           位置：类中方法外定义
           特点：每次构造方法执行的时，都会执行该代码块中的代码，并且在构造方法执行前执行
           作用：将多个构造方法中相同的代码，抽取到构造代码块中，提高代码的复用性
    */
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(10);
    }
}
class Student{
    {
        System.out.println("好好学习");
    }
    public Student(){
        System.out.println("空参数构造方法");
    }
    public Student(int a){
        System.out.println("带参数构造方法");
    }

}
