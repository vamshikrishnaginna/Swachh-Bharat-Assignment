package com.rubiconred.swachhbharat;

import com.thoughtworks.xstream.XStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        User newUser = new User();
        Wastage uWastage = new Wastage();
        Report report = new Report(newUser, uWastage);
        XStream xs = new XStream();
//        WeightsAndPoints wap=new WeightsAndPoints();
//        String points=xs.toXML(wap.getPointsTable()) ;
//        System.out.println(points);





    }
}
