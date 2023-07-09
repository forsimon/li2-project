package practice;

public interface Inter {
    public static final int NUM=10;

    public abstract void show();
}
class InterImpl implements Inter{

    @Override
    public void show() {

    }
    public void method(){
        //NUM=20;
        System.out.println(NUM);
    }
}
