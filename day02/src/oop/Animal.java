package oop;

/**
 * @author li
 * @description
 */
public class Animal {

    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void drink(){
        System.out.println("喝水");
    }
    public void eat(){
        System.out.println("宠物饿了，要吃东西。");
    }
}
