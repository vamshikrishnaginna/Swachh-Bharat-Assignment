package com.rubiconred.swachhbharat;

import java.util.ArrayList;

public class RandomSlogan {
    String slogan;
    ArrayList<String> sloganList;

    public RandomSlogan() {
        sloganList = new ArrayList<>();
        sloganList.add("Ek Kadam Swachhata Ki Ore");
        sloganList.add("Be keen to be clean");
        sloganList.add("Go green to get India clean");
        sloganList.add("Stay green to be clean!");
        sloganList.add("Clean India, developed India!");
    }


    public static double getRandom(double min, double max) {
        return (Math.random() * (max + 1 - min)) + min;
    }

    public String getSlogan() {


        slogan = sloganList.get((int) getRandom(0, 4));


        return slogan;
    }


}
