package oop;

/**
 * @author li
 * @description
 */
public class Dog extends Animal{
   private String size;

    public Dog() {
    }

    public Dog(String name, String color, String size) {
        super(name, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("小狗要吃骨头");
    }
}
