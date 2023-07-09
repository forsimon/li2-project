package exception;

/**
 * @author li
 * @description
 */
public class Student {
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18&&age<=35){
            this.age = age;
        }else {
            throw new AgeOutOfBoundsException("the age must be between 18 and 35");
        }

    }

    @Override
    public String toString() {
        return "Student:{name:"+name+",age:"+age+"}";
    }
}
