package com.rubiconred.swachhbharat;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        User newUser = new User();
        Wastage uWastage = new Wastage();
        ReportDemo report = new ReportDemo(newUser, uWastage);

//        XStream xs = new XStream();
//        WeightsAndPoints wap=new WeightsAndPoints();
//        String points=xs.toXML(wap.getPointsTable()) ;
//        System.out.println(points);



    }
}
