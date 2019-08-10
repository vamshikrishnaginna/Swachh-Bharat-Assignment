package com.rubiconred.swachhbharat;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        User newUser = new User();
        WastageDispose uWastageDispose = new WastageDispose();
        ReportGenerator report = new ReportGenerator(newUser, uWastageDispose, false);

//        Gson gson=new Gson();
//        String report1=gson.toJson(report);
//        System.out.println(report1);
//        //XStream xs = new XStream();
//        //WeightsAndPoints wap=new WeightsAndPoints();
//        // String points=xs.toXML(wap.getPointsTable()) ;
//        //System.out.println(points);
//        ReportFetch rf = new ReportFetch();
//        rf.printValues();
//        WeightsAndPoints weights = new WeightsAndPoints("plastic", "pepsi");
//        System.out.println(weights.getWeight());


    }
}
