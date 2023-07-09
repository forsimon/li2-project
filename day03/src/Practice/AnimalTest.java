package Practice;

import java.time.format.SignStyle;

/**
 * @author li
 * @description
 */
public class AnimalTest {
    public static void main(String[] args) {
        Cat cat=new Cat();
        //useCat(cat);
        useAnimal(cat);

        Dog dog=new Dog();
        //useDog(dog);



        Animal a=new Cat();
        if(a instanceof Cat){
            System.out.println("是🐱类的对象");
            Cat c=(Cat)a;
            c.eat();
        }
        if(a instanceof Dog){
            System.out.println("是🐕类的对象");
            Dog d=(Dog) a;
            d.eat();
        }

    }

    public static void useCat(Cat cat){
        cat.eat();
    }

    public  static void useDog(Dog dog){
        dog.eat();
    }

    public static void useAnimal(Animal animal){
        Animal animal1=new Dog();
        animal1.eat();
        Animal animal2=new Cat();
        animal2.eat();
    }
}
