package oop1;

/**
 * @author li
 * @description
 */
public class Basketbballplayer extends Player implements SpeakEnglish{

    @Override
    public void play() {
        System.out.println("篮球运动员打篮球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("篮球运动员学英语");
    }
}
