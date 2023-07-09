package oop1;

/**
 * @author li
 * @description
 */
public abstract class Pet {
    private String name;
    private int age;

    public Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }


    abstract void eat();

    public void drink(){
        System.out.println(age+"的"+name+"喝水");
    }
}
