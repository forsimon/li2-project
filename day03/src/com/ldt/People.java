package com.ldt;

import java.util.Objects;

/**
 * @author li
 * @description
 */
public class People {
    private String name;
    private int age;
    private String adress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) &&
                Objects.equals(age, people.age) &&
                Objects.equals(adress, people.adress);
    }

    @Override
    public int hashCode() {
        int result=name !=null ? name.hashCode() :0;
        int result1=adress !=null ? adress.hashCode() :0;
         result=result+result1+age;
         return result;

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public static void main(String[] args) {
        People p=new People();
        People p1=new People();

        p.age=11;
        p.adress="北京";
        p.name="S.coups";

        System.out.println(p.equals(p1));
        System.out.println(p.hashCode());
        System.out.println(p.toString());

    }
}
