package oop1;

/**
 * @author li
 * @description
 */
public abstract class Player {
   private String name;
   private String address;

    public Player() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void play();
}
