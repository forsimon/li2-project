package oop1;

/**
 * @author li
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Basketbballplayer bp=new Basketbballplayer();
        bp.setAddress("上海");
        bp.setName("姚明");
        System.out.println(bp.getName());
        System.out.println(bp.getAddress());
        bp.play();
        bp.speakEnglish();

        FootballPlayer fp=new FootballPlayer();
        fp.play();
    }
}
