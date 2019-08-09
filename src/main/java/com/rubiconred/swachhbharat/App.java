package com.rubiconred.swachhbharat;

import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException, ParseException {

        User newUser = new User();
        WastageDispose uWastageDispose = new WastageDispose();
        ReportDemo report = new ReportDemo(newUser, uWastageDispose);

        //XStream xs = new XStream();
        //WeightsAndPoints wap=new WeightsAndPoints();
        // String points=xs.toXML(wap.getPointsTable()) ;
        //System.out.println(points);
        ReportFetch rf = new ReportFetch();
        rf.printValues();
    }
}
