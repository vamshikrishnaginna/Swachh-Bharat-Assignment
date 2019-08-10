package com.rubiconred.swachhbharat;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ReportGenerator {
    private int count = 0;
    private String userName;
    private String phoneNumber;
    private String email;
    private ArrayList<String> typeList;
    private ArrayList<String> brandList;
    private ArrayList<Integer> points;
    private ArrayList<Integer> weights;


    private int totalWeight = 0;
    private int totalPoints = 0;
    private String couponCode;

    private int typeMaxlength = 0;
    private int brandMaxlength = 0;
    Date d1;

    public ReportGenerator() {
    }

    public ReportGenerator(User user, WastageDispose wastageDispose, boolean isDataFromFile) {
        count = wastageDispose.wasteTypeItems.size();
        java.util.Date d1 = new java.util.Date();
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
        String timeStamp = df.format(d1);
        TransactionIdGenerator id = new TransactionIdGenerator(user);
        int trasactionId = id.getId();
        userName = user.getuName();
        phoneNumber = user.getuPhone();
        email = user.getuEmail();
        Coupon coupon = new Coupon(user);
        couponCode = coupon.getCouponCode();
        typeList = wastageDispose.getWasteTypeItems();
        brandList = wastageDispose.getBrandItems();
        points = wastageDispose.getPointsList();
        weights = wastageDispose.getWeightsList();
        System.out.println("                             REPORT                                  ");
        System.out.println(
                "=========================================================================");
        System.out.println("Transaction id:" + trasactionId);
        System.out.println("User Name     :" + userName + "                     TimeStamp:" + timeStamp);

        System.out.println("Phone Number  :" + phoneNumber);
        System.out.println("Email         :" + email);
        System.out.println("Coupon code   :" + couponCode);
        count = wastageDispose.getTotalItems();
        System.out.println("Total Items   :" + count);
        System.out.println("Item Details  :");
        for (String type1 : typeList) {
            if (typeMaxlength < type1.length()) {
                typeMaxlength = type1.length();
            }
        }
        for (String brand1 : brandList) {
            if (brandMaxlength < brand1.length()) {
                brandMaxlength = brand1.length();
            }
        }
        System.out.println("---------------------------------------");
        System.out.print("SNO" + "\t" + "TYPE");
        for (int j = 0; j <= typeMaxlength - 4; j++) {

            System.out.print(" ");

        }
        System.out.println("\tBRAND\tWEIGHTS\tPOINTS");
        System.out.println("---------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.print(i + 1);

            System.out.print("\t");

            System.out.print(typeList.get(i));

            for (int j = 0; j <= typeMaxlength - typeList.get(i).length(); j++) {

                System.out.print(" ");

            }

            System.out.print("\t");
            System.out.print(brandList.get(i));
            System.out.print("\t");

            System.out.print(weights.get(i));


            totalWeight += weights.get(i);
            System.out.print("\t \t");
            System.out.println(points.get(i));
            totalPoints += points.get(i);


        }
        System.out.println("---------------------------------------");
        System.out.println(" ");
        System.out.println("Total WeightsAndPoints:" + totalWeight + "gms\t         Total " +
                "Points:" + totalPoints);
        System.out.println(
                "=========================================================================");
        System.out
                .println("         Thank You for your contribution " + userName);
        System.out.println("");
        RandomSlogan slogan = new RandomSlogan();
        System.out.println("***********" + slogan.getSlogan() + "**********");


        //Details are stored in json file
        ReportStore rs;
        //checks if data is fetched from file else write the data of new registered transcation
        if (!isDataFromFile)
            rs = new ReportStore(user, couponCode, count, wastageDispose, timeStamp);


    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getType() {
        return typeList;
    }

    public void setType(ArrayList<String> type) {
        this.typeList = type;
    }

    public ArrayList<String> getBrand() {
        return brandList;
    }

    public void setBrand(ArrayList<String> brand) {
        this.brandList = brand;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    public ArrayList<Integer> getWeight() {
        return weights;
    }

    public void setWeight(ArrayList<Integer> weight) {
        this.weights = weight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public int getCount() {
        return count;
    }

    @Override

    public String toString() {
        return "ReportDemo{" +
                "count=" + count +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", type=" + typeList +
                ", brand=" + brandList +
                ", points=" + points +
                ", weight=" + weights +
                ", totalWeight=" + totalWeight +
                ", totalPoints=" + totalPoints +
                ", couponCode='" + couponCode + '\'' +
                '}';
    }
}
