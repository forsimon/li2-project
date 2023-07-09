package oop;

/**
 * @author li
 * @description
 */
public class Cat extends Animal{
   private String type;

    public Cat() {
    }

    public Cat(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("小猫要吃🐟");
    }
}
