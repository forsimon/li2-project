package oop;

/**
 * @author li
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setType("蓝短");
        cat.setName("kitty");
        cat.setColor("pink");
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getType());
        Cat.drink();
        cat.eat();

        Dog dog=new Dog();
        dog.setSize("大");
        dog.setName("萨摩耶");
        dog.setColor("white");
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getSize());
        Dog.drink();
        dog.eat();


    }
}
